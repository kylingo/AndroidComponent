package com.android.component.sdk;

import android.app.Application;

import com.android.component.library.app.LibraryApplication;

/**
 * @author kylingo
 * @since 2018/11/23 17:52
 */
public class SdkApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    public static void init(Application application) {
        LibraryApplication.onCreate(application);
    }
}