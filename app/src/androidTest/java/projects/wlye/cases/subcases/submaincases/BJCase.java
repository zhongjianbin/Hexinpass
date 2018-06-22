package projects.wlye.cases.subcases.submaincases;

import android.support.test.uiautomator.UiObjectNotFoundException;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import helper.base.VP2;
import helper.squareup.spoon.Spoon;
import helper.tools.Asst;
import projects.wlye.pages.App;
import projects.wlye.pages.HomePages;
import projects.wlye.pages.subpages.submainpages.BJPage;

/**
 * Author:jianbin.zhong
 * Date: 2018/6/21 16:56
 * Description:
 */

public class BJCase extends VP2 {

    private static Logger logger = Logger.getLogger(BJCase.class.getName());

    @Before
    public void setUp(){
        openAppByPackageName(App.appPackageName);
        cancleUpdate();
        HomePages.navToBj();//进入现金红包
    }

    @Test
    /**
     *测试“现金红包”四个字是否正确
     *@author jianbin.zhong
     *@time 2018/6/21 17:11
     */
    public void testTitle() throws UiObjectNotFoundException {
        String actual = BJPage.getTitleTex();
        String expect = "现金红包";
        if (!actual.equals(expect)){
            Spoon.screenshot("testTitle_Fail");
            Asst.fail("testTitle_Fail");
        }
    }

    @Test
    /**
     *测试现金红包界面点击左上角返回
     *@author jianbin.zhong
     *@time 2018/6/21 17:22
     */
    public void testLeft() throws UiObjectNotFoundException {
        BJPage.clickLeft();
        String expect1 = "工会服务";
        String expect2 = "首页";
        String actual2 = HomePages.getHomeTex();
        String actual1 = HomePages.getUnionTex();
        if (!expect1.equals(actual1) || !expect2.equals(actual2)){
            Spoon.screenshot("testLeft_Fail");
            Asst.fail("testLeft_Fail");
        }
    }
}