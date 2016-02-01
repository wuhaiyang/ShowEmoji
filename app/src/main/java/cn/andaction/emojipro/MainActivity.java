package cn.andaction.emojipro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Field;

import cn.andaction.library.EmojiEditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Emoji";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EmojiEditText et_text = (EmojiEditText) findViewById(R.id.et_emoji);
        Button btn_insert = (Button) findViewById(R.id.btn_insert);
        btn_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    et_text.inserEmoji("angry", R.drawable.class.getField("angry"));
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
                Log.w(TAG, et_text.getText().toString());
            }
        });
    }
}
