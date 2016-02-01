package cn.andaction.library;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

import java.lang.reflect.Field;

/**
 * User: Geek_Soledad(wuhaiyang@danlu.com)
 * Date: 2016-02-01
 * Time: 15:57
 * Description: .....
 */
public class EmojiEditText extends EditText {
    public EmojiEditText(Context context) {
        super(context);
    }

    public EmojiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EmojiEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public void inserEmoji(String emojiName,Field field) {
        int inserPos = getSelectionStart();
        String replaced = String.format(EmojiConstant.SEPATATOR_FORMATER, emojiName);
        Editable editable = getText();
        editable.insert(inserPos, String.format(EmojiConstant.SEPATATOR_FORMATER, emojiName));
        editable.setSpan(new EmojiIconSpan(getContext(), emojiName,field), inserPos, inserPos + replaced.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    }
    public void deleteOneChar(){
        KeyEvent event = new KeyEvent(0, 0, 0, KeyEvent.KEYCODE_DEL, 0, 0, 0, 0, KeyEvent.KEYCODE_ENDCALL);
        dispatchKeyEvent(event);
    }
}
