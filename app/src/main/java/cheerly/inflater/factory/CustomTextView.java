package cheerly.inflater.factory;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by chenglin on 2017-7-8.
 */

public class CustomTextView extends TextView {
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
