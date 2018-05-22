package com.hexinpass;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Author:jianbin.zhong
 * Date: 2018/4/28 13:41
 * Description:
 */

@RunWith(AndroidJUnit4.class)
public class OpenWuliangye {

    private UiDevice myDevice = null;
    private Context myContext = null;
    private static String APP = "com.staff.wuliangye";
    private static String ID_PHONE = "com.staff.wuliangye:id/et_phone";

    @Before
    public void setUp() throws RemoteException {
        myDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        //myContext = InstrumentationRegistry.getContext();
        myContext = InstrumentationRegistry.getInstrumentation().getContext();
        if (!myDevice.isScreenOn()){
            myDevice.wakeUp();
        }
        myDevice.pressHome();
    }

    @Test
    public void testClickMe() throws UiObjectNotFoundException {
        Intent myIntent = myContext.getPackageManager().getLaunchIntentForPackage(APP);
        myContext.startActivity(myIntent);//启动app
        myDevice.waitForWindowUpdate(APP, 5 * 2000);
        UiObject inPhoneNum = myDevice.findObject(new UiSelector().resourceId(ID_PHONE));
        inPhoneNum.clearTextField();
        inPhoneNum.setText("18380448698");
        if(!inPhoneNum.getText().equals("18380448698")){
            Assert.fail("test fail");
        }
        waitTime(5);
    }

    @Test
    public void testClickMe2() throws UiObjectNotFoundException {
        Intent myIntent = myContext.getPackageManager().getLaunchIntentForPackage(APP);
        myContext.startActivity(myIntent);//启动app
        myDevice.waitForWindowUpdate(APP, 5 * 2000);
        UiObject inPhoneNum = myDevice.findObject(new UiSelector().resourceId(ID_PHONE));
        inPhoneNum.clearTextField();
        inPhoneNum.setText("18380448699");
        if(inPhoneNum.getText().equals("18380448699")){
            Assert.fail("test fail");
        }
        waitTime(5);
    }

    @Test
    public void testClickMe3() throws UiObjectNotFoundException {
        Intent myIntent = myContext.getPackageManager().getLaunchIntentForPackage(APP);
        myContext.startActivity(myIntent);//启动app
        myDevice.waitForWindowUpdate(APP, 5 * 2000);
        UiObject inPhoneNum = myDevice.findObject(new UiSelector().resourceId(ID_PHONE));
        inPhoneNum.clearTextField();
        inPhoneNum.setText("18380448689");
        if(inPhoneNum.getText().equals("18380448699")){
            Assert.fail("test fail");
        }
        waitTime(5);
    }

    @Test
    public void testClickMe4() throws UiObjectNotFoundException {
        Intent myIntent = myContext.getPackageManager().getLaunchIntentForPackage(APP);
        myContext.startActivity(myIntent);//启动app
        myDevice.waitForWindowUpdate(APP, 5 * 2000);
        UiObject inPhoneNum = myDevice.findObject(new UiSelector().resourceId(ID_PHONE));
        inPhoneNum.clearTextField();
        inPhoneNum.setText("18380448679");
        if(inPhoneNum.getText().equals("18380448699")){
            Assert.fail("test fail");
        }
        waitTime(5);
    }

    @Test
    public void testClickMe5() throws UiObjectNotFoundException {
        Intent myIntent = myContext.getPackageManager().getLaunchIntentForPackage(APP);
        myContext.startActivity(myIntent);//启动app
        myDevice.waitForWindowUpdate(APP, 5 * 2000);
        UiObject inPhoneNum = myDevice.findObject(new UiSelector().resourceId(ID_PHONE));
        inPhoneNum.clearTextField();
        inPhoneNum.setText("18380448669");
        if(inPhoneNum.getText().equals("18380448699")){
            Assert.fail("test fail");
        }
        waitTime(5);
    }

    @After
    public void tearDown() {
        myDevice.pressHome();//回到主界面

    }

    /**
     * 等待时间，单位秒
     * @param n
     */
    public void waitTime(int n) {
        long time = n * 1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

