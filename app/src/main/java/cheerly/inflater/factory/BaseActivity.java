package cheerly.inflater.factory;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/**
 * Created by chenglin on 2017-7-8.
 */

public class BaseActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public Object getSystemService(String name) {
        if (name.equals(Context.LAYOUT_INFLATER_SERVICE)) {
            LayoutInflater inflater = (LayoutInflater) super.getSystemService(name);
            if (inflater.getFactory() == null) {
                inflater.setFactory(new MyLayoutInflaterFactory());
            }
            return inflater;
        }
        return super.getSystemService(name);
    }
}
