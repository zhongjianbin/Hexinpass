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
import projects.wlye.pages.MyPages;

/**
 * Author:jianbin.zhong
 * Date: 2018/4/28 15:46
 * Description: My Pages Cases
 */

@RunWith(AndroidJUnit4.class)
public class MyCases extends VP2{

    private static Logger logger = Logger.getLogger(MyCases.class.getName());

    @Before
    public void setUp() {
        openAppByPackageName(App.appPackageName);
        cancleUpdate();
        MyPages.navToMyPage();
    }

    @Test
    /**
     * 测试进入“我的”界面
     *@author jianbin.zhong
     *@time 2018/5/16 10:47
     */
    public void testNavToMyPage(){
        if (!getObjectById(MyPages.ID_MY).exists() || !getObjectById(MyPages.ID_ABOUT).exists()){
            Spoon.screenshot("testNavToMyPage_fail");
            Asst.fail("test navToMyPage fail");
        }
    }

    @Test
    /**
     *测试我的界面title “我的”是否正确
     *@author jianbin.zhong
     *@time 2018/5/16 10:38
     */
    public void testTitle() throws UiObjectNotFoundException {
        String expect = "我的";
        String actual = MyPages.getTitleTex();
        Spoon.screenshot("MyPage");
        if (!expect.equals(actual)){
            Spoon.screenshot("testTitle_fail");
            Asst.fail(actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试用户名是否正确，是否匹配
     *@author jianbin.zhong
     *@time 2018/5/16 15:26
     */
    public void testUserName() throws UiObjectNotFoundException {
        String expect = "*建彬";
        logger.info("expect: "+expect);
        String actual = MyPages.getUsernameTex();
        Spoon.screenshot("UserName");
        if (!expect.equals(actual)){
            Spoon.screenshot("testUserName_fail");
            Asst.fail(actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试电话号码是否正确，是否匹配
     *@author jianbin.zhong
     *@time 2018/5/16 16:39
     */
    public void testPhoneNumber() throws UiObjectNotFoundException {
        String expect = "183****8698";
        String actual = MyPages.getPhonenumberTex();
        Spoon.screenshot("PhoneNumber");
        if (!expect.equals(actual)){
            Spoon.screenshot("testPhoneNumber_fail");
            Asst.fail(actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试工会是否正确,是否匹配
     *@author jianbin.zhong
     *@time 2018/5/16 16:43
     */
    public void testBranch() throws UiObjectNotFoundException {
        String expect = "机关二分会";
        String actual = MyPages.getBranchTex();
        Spoon.screenshot("Branch");
        if (!expect.equals(actual)){
            Spoon.screenshot("testBranch_fail");
            Asst.fail(actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *根据“普惠钱包”text来找到相应的object，判断该object是否存在来判定用例是否通过
     *@author jianbin.zhong
     *@time 2018/5/16 17:17
     */
    public void testPuHuiWallet(){
        if (!getObjectByText(MyPages.TEX_PUHUIWALLET).exists()){
            Spoon.screenshot("testPhHuiWalllet_fail");
            Asst.fail("test PhHuiWalllet fail");
        }
    }

    @Test
    /**
     *测试余额
     *@author jianbin.zhong
     *@time 2018/5/16 17:21
     */
    public void testYuE() throws UiObjectNotFoundException {
        String expect = "6418.77元";
        String actual = MyPages.getYuETex();
        Spoon.screenshot("YuE");
        if (!expect.equals(actual)){
            Spoon.screenshot("testYuE_fail");
            Asst.fail(actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试"沟通咨询"四个字
     *@author jianbin.zhong
     *@time 2018/5/17 14:43
     */
    public void testInteraction() throws UiObjectNotFoundException {
        String actual = MyPages.getInteractionTex();
        String expect = "沟通咨询";
        if (!expect.equals(actual)){
            Spoon.screenshot("testInteraction_fail");
            Asst.fail(actual+" does not equal "+expect);
        }
    }

}