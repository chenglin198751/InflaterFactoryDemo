package cheerly.inflater.factory;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;

/**
 * Created by chenglin on 2017-7-8.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
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
