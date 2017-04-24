package me.yoyfook.app.myutils.ui;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by yoyfook on 17/4/20.
 */

public final class ToastUtils {
    public static void show(Context context, CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(Context context, CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}
