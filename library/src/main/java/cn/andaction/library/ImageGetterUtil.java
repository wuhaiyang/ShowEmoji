package cn.andaction.library;

import android.graphics.drawable.Drawable;
import android.text.Html;

import java.lang.reflect.Field;

/**
 * User: Geek_Soledad(wuhaiyang@danlu.com)
 * Date: 2016-02-01
 * Time: 16:01
 * Description: .....
 */
public class ImageGetterUtil implements Html.ImageGetter {


    public static int getResourceId(String name,Field field) {
        try {
            return Integer.parseInt(field.get(null).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.drawable.ic_launcher;
    }
    @Override
    public Drawable getDrawable(String source) {
        return null;
    }
}
