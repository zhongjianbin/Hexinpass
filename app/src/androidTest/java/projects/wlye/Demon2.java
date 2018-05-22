package projects.wlye;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import helper.base.VP2;
import helper.squareup.spoon.Spoon;

/**
 * Author:jianbin.zhong
 * Date: 2018/5/9 15:26
 * Description:
 */

public class Demon2 extends VP2{

    public static String SIOEYE_PACKAGE_NAME_CN="cn.sioeye.sioeyeapp";

    @Before
    public void setUp() throws RemoteException {
        openAppByPackageName(SIOEYE_PACKAGE_NAME_CN);
    }

    @Test
    public void testClickMe8() throws UiObjectNotFoundException {
        waitTime(5);
        Spoon.screenshot("data","kobe");
    }
    @After
    public void tearDown() {
        gDevice.pressHome();//回到主界面

    }

    /**
     * 等待时间，单位秒
     * @param n
     */
    public static void waitTime(int n) {
        long time = n * 1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}