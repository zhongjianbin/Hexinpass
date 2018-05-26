package projects.wlye.cases.subcases.submycases;

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
import projects.wlye.pages.subpages.submypages.BalancePage;

/**
 * Author:jianbin.zhong
 * Date: 2018/5/22 16:11
 * Description:普惠钱包余额用例
 */
@RunWith(AndroidJUnit4.class)
public class BalanceCase extends VP2{

    private static Logger logger = Logger.getLogger(BalanceCase.class.getName());

    @Before
    public void setUp() {
        openAppByPackageName(App.appPackageName);
        cancleUpdate();//如果提示需要更新app，会取消更新
        HomePages.navToMyPage();//主页点击进入“我的”界面
        MyPages.navToBalance();//我的界面进入普惠钱包余额界面
    }

    @Test
    /**
     *测试普惠钱包余额界面返回到我的界面
     *@author jianbin.zhong
     *@time 2018/5/26 15:02
     */
    public void testBalanceBackToMyPage() throws UiObjectNotFoundException {
        BalancePage.balanceBackToMyHome();
        String expect = "我的";
        String actual = MyPages.getTitleTex();
        if (!expect.equals(actual)){
            Spoon.screenshot("testBalanceBackToMyPage_fail");
            Asst.fail("testBalanceBackToMyPage_fail");
        }
    }

    @Test
    /**
     *测试"普惠钱包"title字是否正确
     *@author jianbin.zhong
     *@time 2018/5/26 15:04
     */
    public void testBanlanceTitle() throws UiObjectNotFoundException {
        String expect = "普惠钱包";
        String actual=BalancePage.getBanlanceTitle();
        if (!expect.equals(actual)){
            Spoon.screenshot("testBanlanceTitle_fail");
            Asst.fail("test BanlanceTitle fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试“账单”字是否正确
     *@author jianbin.zhong
     *@time 2018/5/26 15:26
     */
    public void testBillTex() throws UiObjectNotFoundException {
        String expect = "账单";
        String actual = BalancePage.getBillTex();
        if (!expect.equals(actual)){
            Spoon.screenshot("testBillTex_fail");
            Asst.fail("test BillTex fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试跳转到“账单界面”
     *@author jianbin.zhong
     *@time 2018/5/26 15:31
     */
    public void testNavToBill() throws UiObjectNotFoundException {
        BalancePage.navToBill();
        waitTime(1);
        String expect = "账单";
        String actual = BalancePage.getBanlanceTitle();
        if (!expect.equals(actual)){
            Spoon.screenshot("testNavToBillPage_fail");
            Asst.fail("testNavToBillPage_fail"+actual+"does not equal"+expect);
        }
    }

    @Test
    /**
     *测试余额元
     *@author jianbin.zhong
     *@time 2018/5/26 15:36
     */
    public void testYuEYuanTex() throws UiObjectNotFoundException {
        String expect = "余额（元）";
        String actual = BalancePage.getYuETex();
        if (!expect.equals(actual)){
            Spoon.screenshot("testYuEYuanTex_fail");
            Asst.fail("test YuEYuanTex fail, "+actual+" does not equal "+expect);
        }
    }



}