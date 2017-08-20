package bwie.com.fruitsshop.application;

import android.app.Application;
import android.content.Context;

import bwie.com.fruitsshop.MainActivity;
import bwie.com.fruitsshop.utils.CrashHandler;
import bwie.com.fruitsshop.utils.ToastUtils;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/8
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public class MyApplication extends Application {
    public static Context sAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = getApplicationContext();
        ToastUtils.init(true);
        CrashHandler.getInstance().init(this, true, true, 2000, MainActivity.class);
    }

    public static Context getAppContext() {
        return sAppContext;
    }
}
