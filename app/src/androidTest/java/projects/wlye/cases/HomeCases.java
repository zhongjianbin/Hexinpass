package projects.wlye.cases;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObjectNotFoundException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.logging.Logger;

import helper.base.VP2;
import helper.squareup.spoon.Spoon;
import helper.tools.Asst;
import projects.wlye.pages.App;
import projects.wlye.pages.HomePages;
import projects.wlye.pages.MyPages;
import projects.wlye.pages.UnionPages;

/**
 * Author:jianbin.zhong
 * Date: 2018/4/28 15:45
 * Description:
 */
@RunWith(AndroidJUnit4.class)
public class HomeCases extends VP2{

    private static Logger logger = Logger.getLogger(HomeCases.class.getName());

    @Before
    public void setUp() {
        openAppByPackageName(App.appPackageName);
        cancleUpdate();
    }

/*    @Test
    *//**
     *测试跳转到工会服务界面
     *@author jianbin.zhong
     *@time 2018/5/24 15:44
     *//*
    public void testNavToUnionPage() throws UiObjectNotFoundException {
        HomePages.navToUnionPage();
        if (!UnionPages.getInformationTex().equals("资讯") || !UnionPages.getServerTex().equals("服务")){
            Asst.fail("跳转到工会服务界面失败或工会服务界面未加载出来");
            Spoon.screenshot("testNavToUnionPage_Fail");
        }
    }*/

    @Test
    /**
     *测试跳转到我的界面
     *@author jianbin.zhong
     *@time 2018/5/24 15:47
     */
    public void testNavToMyPage() throws UiObjectNotFoundException {
        HomePages.navToMyPage();
        if (!MyPages.getTitleTex().equals("我的") || !MyPages.getCouponTex().equals("我的优惠券")){
            Asst.fail("跳转到我的界面失败或我的界面未加载出来");
            Spoon.screenshot("testNavToMyPage_Fail");
        }
    }

    @Test
    /**
     *测试主页进入到消息
     *@author jianbin.zhong
     *@time 2018/5/24 16:09
     */
    public void testNavToMsgPage() throws UiObjectNotFoundException {
        HomePages.navToMyPage();
        if (!HomePages.getMsgTitle().equals("我的消息")){
            Asst.fail("跳转到我的消息界面失败或我的消息界面未加载出来");
            Spoon.screenshot("testNavToMsgPage_Fail");
        }
    }
}