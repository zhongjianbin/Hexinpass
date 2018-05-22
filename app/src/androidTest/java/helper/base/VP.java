package helper.base;

import android.app.Instrumentation;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import java.util.logging.Logger;

/**
 * Author:jianbin.zhong
 * Date: 2018/5/11 10:26
 * Description:
 */

public class VP {

    private static Logger logger = Logger.getLogger(VP.class.getName());
    public static UiDevice gDevice = null;
    public static Instrumentation instrument = null;
    public static Context context = null;
    public static boolean isStop = false;
    public static String logAbsPath;
    public static String logName;
    private static Thread logThread;

    //permission allow dialog
    public static String PERMISSION_ALLOW = "com.android.packageinstaller:id/permission_allow_button";
    public static String ID_MESSAGE = "android:id/message";
    
    /**
     *get permission
     *@author jianbin.zhong
     *@time 2018/5/11 10:39
     */
    public static void doAskPermission(boolean isAsk) throws UiObjectNotFoundException {
        if (isAsk){
            for (int t = 1; t < 3; t++) {
                if ("com.android.packageinstaller".equals(gDevice.getCurrentPackageName())) {
                    //权限请求确认-pkg com.google.android.packageinstaller
                    UiObject uiObject_permission = gDevice.findObject(new UiSelector().resourceId(PERMISSION_ALLOW));
                    if (uiObject_permission.exists()) {
                        logger.info("["+t+"]"+"click allow-permission setting");
                        uiObject_permission.clickAndWaitForNewWindow();
                    }
                }
            }
        }
    }

    /**
     *init devices
     *@author jianbin.zhong
     *@time 2018/5/11 10:39
     */
    public static void initDevice() {
        if (instrument == null) {
            instrument = InstrumentationRegistry.getInstrumentation();
            context = instrument.getContext();
        }
        if (gDevice == null) {
            gDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        }
        //registerWatcher();
        try {
            doAskPermission(false);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }

}