package project.core.thoinx.com.coreproject.utils;

import android.util.Log;

/**
 * Created by thoinx on 04/01/17.
 */
public class L {
    private static boolean ENABLE_LOG = Constants.isDebug;
    private static final String TAG = "ThoiNX";

    public static void e(String message) {
        if (ENABLE_LOG) {
            Log.e(TAG, message);
        }
    }

    public static void i(String message) {
        if (ENABLE_LOG) {
            Log.i(TAG, message);
        }
    }

    public static void w(String message) {
        if (ENABLE_LOG) {
            Log.w(TAG, message);
        }
    }

    public static void d(String message) {
        if (ENABLE_LOG) {
            Log.d(TAG, message);
        }
    }

    public static void e(String tag, String message) {
        if (ENABLE_LOG) {
            Log.e(tag, message);
        }
    }

    public static void i(String tag, String message) {
        if (ENABLE_LOG) {
            Log.i(tag, message);
        }
    }

    public static void w(String tag, String message) {
        if (ENABLE_LOG) {
            Log.w(tag, message);
        }
    }

    public static void d(String tag, String message) {
        if (ENABLE_LOG) {
            Log.d(tag, message);
        }
    }
}
