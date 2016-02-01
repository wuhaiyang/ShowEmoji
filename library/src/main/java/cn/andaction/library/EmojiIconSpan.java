package cn.andaction.library;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;

import java.lang.reflect.Field;

/**
 * User: Geek_Soledad(wuhaiyang@danlu.com)
 * Date: 2016-02-01
 * Time: 15:59
 * Description: .....
 */
public class EmojiIconSpan extends DynamicDrawableSpan {


    public static final int DRAWABLE_S = 24;
    
    private Context mContext;
    private int mResourceId;
    public EmojiIconSpan(Context context,String iconName,Field field) {
        super();
        mContext = context;
        mResourceId = ImageGetterUtil.getResourceId(iconName,field);
    }
    @Override
    public Drawable getDrawable() {
        Drawable drawable = mContext.getResources().getDrawable(mResourceId);
        drawable.setBounds(0, 0, DRAWABLE_S, DRAWABLE_S);
        return drawable;
    }
}
