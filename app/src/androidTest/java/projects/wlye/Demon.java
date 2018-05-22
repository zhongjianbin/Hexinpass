package projects.wlye;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObjectNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.logging.Logger;

import helper.base.VP2;
import helper.squareup.spoon.Spoon;
import helper.tools.Asst;

/**
 * Author:jianbin.zhong
 * Date: 2018/4/28 15:47
 * Description:
 */
@RunWith(AndroidJUnit4.class)
public class Demon extends VP2{

    String appPackageName = "com.staff.wuliangye";
    private static String ID_PHONE = "com.staff.wuliangye:id/et_phone";

    @Before
    public void setUp(){
        openAppByPackageName(appPackageName);
    }

    @Test
    public void inputNumber() throws UiObjectNotFoundException{
            cancleUpdate();
            getObjectById(ID_PHONE).setText("18380448698");
            int i=2;
            Spoon.screenshot("this",""+i);
            waitTime(8);
            if (getObjectById(ID_PHONE).getText().equals("18380448698")){
                Asst.fail("get text do not equal phone number");
            }
    }

    @After
    public void tearDown() {
        gDevice.pressHome();//回到主界面

    }




}
