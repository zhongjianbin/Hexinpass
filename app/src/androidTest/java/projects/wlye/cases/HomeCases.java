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
import projects.wlye.pages.subpages.submainpages.CashPage;
import projects.wlye.pages.subpages.submainpages.GuaranteePage;
import projects.wlye.pages.subpages.submainpages.LegalPage;
import projects.wlye.pages.subpages.submainpages.StressPage;
import projects.wlye.pages.subpages.subunionpages.UnionPage;

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

    @Test
    /**
     *测试跳转到工会服务界面
     *@author jianbin.zhong
     *@time 2018/5/24 15:44
     */
    public void testNavToUnionPage() throws UiObjectNotFoundException {
        HomePages.navToUnionPage();
        UnionPage.confirmHttps();
        String actual = UnionPages.getServerTex();
        if (!actual.equals("服务")){
            Spoon.screenshot("testNavToUnionPage_Fail");
            Asst.fail("testNavToUnionPage_fail:");
        }
    }

    @Test
    /**
     *测试跳转到我的界面
     *@author jianbin.zhong
     *@time 2018/5/24 15:47
     */
    public void testNavToMyPage() throws UiObjectNotFoundException {
        HomePages.navToMyPage();
        if (!MyPages.getTitleTex().equals("我的") || !MyPages.getCouponTex().equals("我的优惠券")){
            Spoon.screenshot("testNavToMyPage_Fail");
            Asst.fail("testNavToMyPage_fail");
        }
    }

    @Test
    /**
     *测试主页进入到消息
     *@author jianbin.zhong
     *@time 2018/5/24 16:09
     */
    public void testNavToMsgPage() throws UiObjectNotFoundException {
        HomePages.clickMsg();
        if (!HomePages.getMsgTitle().equals("我的消息")){
            Spoon.screenshot("testNavToMsgPage_Fail");
            Asst.fail("testNavToMsgPage_fail");
        }
    }
    @Test
    /**
     *测试主页进入到普惠扫码
     *@author jianbin.zhong
     *@time 2018/5/26 10:46
     */
    public void testNavToPay() throws UiObjectNotFoundException {
        HomePages.navToPay();
        if (!HomePages.getMsgTitle().equals("普惠扫码")){
            Spoon.screenshot("testNavToPay_Fail");
            Asst.fail("testNavToPay_fail");
        }
    }

    @Test
    /**
     *测试“普惠扫码四个字是否正确”
     *@author jianbin.zhong
     *@time 2018/5/26 11:36
     */
    public void testPayTex() throws UiObjectNotFoundException {
        String expect = "普惠扫码";
        String actual = HomePages.getPayTex();
        if (!expect.equals(actual)){
            Spoon.screenshot("testPayTex_Fail");
            Asst.fail("test PayTex fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试点击跳转到现金红包
     *@author jianbin.zhong
     *@time 2018/5/26 11:08
     */
    public void testNavToBj() throws UiObjectNotFoundException {
        HomePages.navToBj();
        CashPage.confirmKnow();
        //需要先做判断，是否是首次进入现金红包，首次进入现金红包就需要找到我知道了object，否则直接判断现金红包
        if (!HomePages.getObjectById(HomePages.ID_BJ).exists()){
            if (!HomePages.getMsgTitle().equals("现金红包")){
                Spoon.screenshot("testNavToBj_Fail");
                Asst.fail("testNavToBj_fail");
            }
        }
    }

    @Test
    /**
     *测试“现金红包”四个字
     *@author jianbin.zhong
     *@time 2018/5/26 11:39
     */
    public void testBjTex() throws UiObjectNotFoundException {
        String expect = "现金红包";
        String actual = HomePages.getBjTex();
        if (!expect.equals(actual)){
            Spoon.screenshot("testBjTex_Fail");
            Asst.fail("test BjTex fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试点击跳转到全部商户
     *@author jianbin.zhong
     *@time 2018/5/26 11:12
     */
    public void testNavToLife() throws UiObjectNotFoundException {
        HomePages.navToLife();
        if (!HomePages.getMsgTitle().equals("全部商户")){
            Spoon.screenshot("testNavToLife_Fail");
            Asst.fail("testNavToLife_fail");
        }
    }

    @Test
    /**
     *测试“全部商户”四个字
     *@author jianbin.zhong
     *@time 2018/5/26 11:42
     */
    public void testLifeTex() throws UiObjectNotFoundException {
        String expect = "全部商户";
        String actual = HomePages.getLifeTex();
        if (!expect.equals(actual)){
            Spoon.screenshot("testLifeTex_Fail");
            Asst.fail("test LifeTex fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试跳点击跳转到便民缴费
     *@author jianbin.zhong
     *@time 2018/5/26 11:13
     */
    public void testNavToCharge() throws UiObjectNotFoundException {
        HomePages.navToCharge();
        if (!HomePages.getMsgTitle().equals("便民缴费")){
            Spoon.screenshot("testNavToCharge_Fail");
            Asst.fail("testNavToCharge_fail");
        }
    }

    @Test
    /**
     *测试“便民缴费”四个字
     *@author jianbin.zhong
     *@time 2018/5/26 11:43
     */
    public void testChargeTex() throws UiObjectNotFoundException {
        String expect = "便民缴费";
        String actual = HomePages.getChargeTex();
        if (!expect.equals(actual)){
            Spoon.screenshot("testChargeTex_Fail");
            Asst.fail("test ChargeTex fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试跳转到电影选座
     *@author jianbin.zhong
     *@time 2018/5/26 11:33
     */
    public void testNavToFilm() throws UiObjectNotFoundException {
        HomePages.navToFilm();
        if (!HomePages.getMsgTitle().equals("电影选座")){
            Spoon.screenshot("testNavToFilm_Fail");
            Asst.fail("testNavToFilm_fail");
        }
    }

    @Test
    /**
     *测试“电影选座”四个字
     *@author jianbin.zhong
     *@time 2018/5/26 11:45
     */
    public void testFilmTex() throws UiObjectNotFoundException {
        String expect = "电影选座";
        String actual = HomePages.getFilmTex();
        if (!expect.equals(actual)){
            Spoon.screenshot("testFilmTex_Fail");
            Asst.fail("test FilmTex fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试跳转到法律服务界面
     *@author jianbin.zhong
     *@time 2018/6/29 9:45
     */
    public void testNavToLegal() throws UiObjectNotFoundException {
        HomePages.navToLegal();
        String expect = "法律服务";
        String actual=LegalPage.getTitle();
        if (!expect.equals(actual)){
            Spoon.screenshot("testNavToLegal_Fail");
            Asst.fail("testNavToLegal_Fail, "+actual+" does not equal "+expect);
        }

    }

    @Test
    /**
     *测试法律服务四个字
     *@author jianbin.zhong
     *@time 2018/6/29 10:05
     */
    public void testLegalTex() throws UiObjectNotFoundException {
        String expect = "法律服务";
        String actual = HomePages.getLegalTex();
        if (!expect.equals(actual)){
            Spoon.screenshot("testLegalTex_Fail");
            Asst.fail("testLegalTex_Fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试跳转到心理减压
     *@author jianbin.zhong
     *@time 2018/6/29 10:08
     */
    public void testNavToStress() throws UiObjectNotFoundException {
        HomePages.navToStress();
        String expect = "心理减压";
        String actual = StressPage.getTitle();
        if (!expect.equals(actual)){
            Spoon.screenshot("testNavToStress_Fail");
            Asst.fail("testNavToStress_Fail, "+actual+" does not equal "+expect);
        }

    }

    @Test
    /**
     *测试“心理减压”四个字
     *@author jianbin.zhong
     *@time 2018/6/29 10:13
     */
    public void testStressTex() throws UiObjectNotFoundException {
        String actual = HomePages.getStressTex();
        String expect = "心理减压";
        if (!expect.equals(actual)){
            Spoon.screenshot("testStressTex_Fail");
            Asst.fail("testStressTex_Fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试跳转到互助保障
     *@author jianbin.zhong
     *@time 2018/6/29 10:21
     */
    public void testNavToGuarantee() throws UiObjectNotFoundException {
        HomePages.navToGuarantee();
        String actual = GuaranteePage.getTitle();
        String expect = "互助保障";
        if (!expect.equals(actual)){
            Spoon.screenshot("testNavToGuarantee_Fail");
            Asst.fail("testNavToGuarantee_Fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试“互助保障”四个字
     *@author jianbin.zhong
     *@time 2018/6/29 10:22
     */
    public void testGuaranteeTex() throws UiObjectNotFoundException {
        String actual = HomePages.getGuaranteeTex();
        String expect = "互助保障";
        if (!expect.equals(actual)){
            Spoon.screenshot("testGuaranteeTex_Fail");
            Asst.fail("testGuaranteeTex_Fail, "+actual+" does not equal "+expect);
        }
    }


    @Test
    /**
     *测试跳转到普惠商城界面
     *@author jianbin.zhong
     *@time 2018/5/26 14:34
     */
    public void testNavToShop() throws UiObjectNotFoundException {
        String expect = "普惠商城";
        HomePages.navToShop();
        String actual = HomePages.getMsgTitle();
        if (!expect.equals(actual)){
            Spoon.screenshot("testNavToShop_Fail");
            Asst.fail("test NavToShop fail, "+actual+" does not equal "+expect);
        }
    }

    @Test
    /**
     *测试跳转到限时秒杀（和信通商城）
     *@author jianbin.zhong
     *@time 2018/5/26 14:36
     */
    public void testNavToMs() throws UiObjectNotFoundException {
        HomePages.navToMs();
        String expect = "限时秒杀";
        waitTime(2);
        String actual = HomePages.getMsgTitle();
        if (!expect.equals(actual)){
            Spoon.screenshot("testNavToMs_Fail");
            Asst.fail(actual+" does not equal "+expect);
        }
    }

    //测试跳转到普惠金融(未开通)

}