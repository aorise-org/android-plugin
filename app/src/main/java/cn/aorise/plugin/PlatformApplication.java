package cn.aorise.plugin;

import android.util.Log;

import cn.aorise.common.BaseApplication;
import cn.aorise.plugin.db.DbHelper;

public class PlatformApplication extends BaseApplication {
    private static final String TAG = PlatformApplication.class.getSimpleName();
//    private RefWatcher mRefWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate");
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            // This process is dedicated to LeakCanary for heap analysis.
//            // You should not init your app in this process.
//            return;
//        }
//        mRefWatcher = LeakCanary.install(this);
        DbHelper.getInstance().init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

//    public static RefWatcher getRefWatcher(Context context) {
//        PlatformApplication application = (PlatformApplication) context.getApplicationContext();
//        return application.mRefWatcher;
//    }
}
