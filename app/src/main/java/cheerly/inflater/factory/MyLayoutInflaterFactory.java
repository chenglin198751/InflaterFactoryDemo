package cheerly.inflater.factory;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Administrator on 2017-3-10.
 */

public class MyLayoutInflaterFactory implements LayoutInflater.Factory {
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        if (name.equals("TextView")) {
            return new CustomTextView(context, attrs);
        }
        return null;
    }
}
