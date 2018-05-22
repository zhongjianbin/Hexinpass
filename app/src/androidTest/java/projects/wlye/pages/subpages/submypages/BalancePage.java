package projects.wlye.pages.subpages.submypages;

import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import helper.base.VP2;
import helper.squareup.spoon.Spoon;

/**
 * Author:jianbin.zhong
 * Date: 2018/5/22 14:34
 * Description:普惠钱包余额界面
 */

public class BalancePage extends VP2 {

    public static String ID_YUE = "com.staff.wuliangye:id/tv_balance";
    public static String ID_BALANCEBACK = "com.staff.wuliangye:id/title_left_btn";
    public static String ID_BANLANCETITLE = "com.staff.wuliangye:id/title";
    private static String ID_BILL = "com.staff.wuliangye:id/title_right_txt";

    public static String ID_BALANCE = "com.staff.wuliangye:id/iv_rb"; //余额显示的整个ID
    public static String ID_BALANCECOUNT = "com.staff.wuliangye:id/tv_balance";
    public static String ID_BALANCEINSTRUCTION = "com.staff.wuliangye:id/iv_wh";
    public static String ID_BALANCEINSTRUCTIONTITLE = "com.staff.wuliangye:id/title";
    public static String ID_BALANCEINSTRUCTIONTEX = "com.staff.wuliangye:id/webview";
    public static String ID_BALANCECANCLE = "com.staff.wuliangye:id/webview";
    public static String ID_CHARGE = "com.staff.wuliangye:id/btn_charge";
    public static String ID_BACKTOBALANCE = "com.staff.wuliangye:id/rl_left";
    public static String ID_CHARGETITLE = "com.staff.wuliangye:id/title";
    public static String ID_MONEY = "com.staff.wuliangye:id/view_money";
    public static String ID_CHARGEMONEY1 = "com.staff.wuliangye:id/money1";
    public static String ID_CHARGEMONEY2 = "com.staff.wuliangye:id/money2";
    public static String ID_CHARGEMONEY3 = "com.staff.wuliangye:id/money3";
    public static String ID_CHARGEMONEY4 = "com.staff.wuliangye:id/money4";
    public static String ID_INPUTMONEY = "com.staff.wuliangye:id/input_money";
    public static String ID_NEXTCOMMIT = "com.staff.wuliangye:id/next_commit";
    public static String ID_CHARGEBYHEXINPASS = "com.staff.wuliangye:id/tv_charge";
    //和信通卡充值界面
    public static String ID_HETITLE = "com.staff.wuliangye:id/title";
    public static String ID_HEBACKCHARGE = "com.staff.wuliangye:id/title_left_btn";
    public static String ID_HELOGIN = "com.staff.wuliangye:id/email_login_form";
    public static String ID_CARD = "com.staff.wuliangye:id/et_card_no";
    public static String ID_PASSWORD = "com.staff.wuliangye:id/et_pwd";
    public static String ID_OK = "com.staff.wuliangye:id/btn_ok";
    public static String ID_TIP = "com.staff.wuliangye:id/tv_tip";







    /**
     *点击进入普惠钱包余额界面
     *@author jianbin.zhong
     *@time 2018/5/16 10:10
     */
    public static void navToBalance(){
        clickById(ID_YUE);
        Spoon.screenshot("navToBalance");
    }

    /**
     *普惠钱包界面返回到我的界面
     *@author jianbin.zhong
     *@time 2018/5/22 14:05
     */
    public static void balanceBackToMyHome(){
        clickById(ID_BALANCEBACK);
        Spoon.screenshot("BalanceBackToMyHome");
    }

    /**
     *获取钱包里的”普惠钱包“四个字
     *@author jianbin.zhong
     *@time 2018/5/22 14:07
     */
    public static String getBanlanceTitle() throws UiObjectNotFoundException {
        return getTex(ID_BANLANCETITLE);
    }

    /**
     *钱包界面获取“账单”两个字
     *@author jianbin.zhong
     *@time 2018/5/22 14:11
     */
    public static String getBillTex() throws UiObjectNotFoundException {
        return getTex(ID_BILL);
    }

    /**
     *跳转进入账单界面
     *@author jianbin.zhong
     *@time 2018/5/22 14:12
     */
    public static void navToBill(){
        clickById(ID_BILL);
    }


    /**
     *点击问号进入余额说明
     *@author jianbin.zhong
     *@time 2018/5/22 14:16
     */
    public static void navToBanlanceInstruction(){
        clickById(ID_BALANCEINSTRUCTION);
    }

    /**
     *获取”余额说明“四个字
     *@author jianbin.zhong
     *@time 2018/5/22 14:20
     */
    public static String getBalanceInstructionTitle() throws UiObjectNotFoundException {
        return getTex(ID_BALANCEINSTRUCTIONTITLE);
    }

    /**
     *获取余额说明的详细文字介绍
     *@author jianbin.zhong
     *@time 2018/5/22 14:22
     */
    public static String getBalanceInstruction() throws UiObjectNotFoundException {
        return getTex(ID_BALANCEINSTRUCTIONTEX);
    }

    /**
     *余额说明界面点击取消
     *@author jianbin.zhong
     *@time 2018/5/22 14:25
     */
    public static void clickBanlanceCancle(){
        clickById(ID_BALANCECANCLE);
    }

    /**
     *获取“余额（元）”几个字
     *@author jianbin.zhong
     *@time 2018/5/22 14:53
     */
    public static String getYuETex() throws UiObjectNotFoundException {
        return getObjectById(ID_BALANCE).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *获取“¥”标记
     *@author jianbin.zhong
     *@time 2018/5/22 15:03
     */
    public static String getMoneySign() throws UiObjectNotFoundException {
        return getObjectById(ID_BALANCE).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(1)).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *获取金额的明确数字
     *@author jianbin.zhong
     *@time 2018/5/22 15:06
     */
    public static String getBalanceCount() throws UiObjectNotFoundException {
        return getTex(ID_BALANCECOUNT);
    }

    /**
     *获取“充值”两个字
     *@author jianbin.zhong
     *@time 2018/5/22 15:12
     */
    public static String getChargeTex() throws UiObjectNotFoundException {
        return getTex(ID_CHARGE);
    }

    //充值界面
    /**
     *进入充值界面
     *@author jianbin.zhong
     *@time 2018/5/22 15:13
     */
    public static void navToChargePage(){
        clickById(ID_CHARGE);
    }

    /**
     *充值界面点击左上角返回到余额界面
     *@author jianbin.zhong
     *@time 2018/5/22 15:32
     */
    public static void backToBalance(){
        clickById(ID_BACKTOBALANCE);
    }

    /**
     *获取“充值”title
     *@author jianbin.zhong
     *@time 2018/5/22 15:35
     */
    public static String getChargeTitle() throws UiObjectNotFoundException {
        return getTex(ID_CHARGETITLE);
    }

    /**
     *获取充值金额四个字
     *@author jianbin.zhong
     *@time 2018/5/22 15:39
     */
    public static String getChargeMoneyTex() throws UiObjectNotFoundException {
        return getObjectById(ID_MONEY).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *获取充值金额1的金额（默认50元）
     *@author jianbin.zhong
     *@time 2018/5/22 15:40
     */
    public static String getMoney1() throws UiObjectNotFoundException {
        return getTex(ID_CHARGEMONEY1);
    }

    /**
     *选中充值金额1（即选中充值金额50元）
     *@author jianbin.zhong
     *@time 2018/5/22 15:56
     */
    public static void selectMoney1(){
        clickById(ID_CHARGEMONEY1);
    }

    /**
     *获取充值金额2的金额（默认100元）
     *@author jianbin.zhong
     *@time 2018/5/22 15:41
     */
    public static String getMoney2() throws UiObjectNotFoundException {
        return getTex(ID_CHARGEMONEY2);
    }

    /**
     *选中充值金额2
     *@author jianbin.zhong
     *@time 2018/5/22 15:58
     */
    public static void selectMoney2(){
        clickById(ID_CHARGEMONEY2);
    }

    /**
     *获取充值金额3的金额（默认200元）
     *@author jianbin.zhong
     *@time 2018/5/22 15:42
     */
    public static String getMoney3() throws UiObjectNotFoundException {
        return getTex(ID_CHARGEMONEY3);
    }

    /**
     *选中充值金额3
     *@author jianbin.zhong
     *@time 2018/5/22 15:58
     */
    public static void selectMoney3(){
        clickById(ID_CHARGEMONEY3);
    }

    /**
     *获取充值金额4的金额（默认300元）
     *@author jianbin.zhong
     *@time 2018/5/22 15:43
     */
    public static String getMoney4() throws UiObjectNotFoundException {
        return getTex(ID_CHARGEMONEY4);
    }

    /**
     *选中充值金额4
     *@author jianbin.zhong
     *@time 2018/5/22 15:59
     */
    public static void selectMoney4(){
        clickById(ID_CHARGEMONEY4);
    }

    /**
     *获取其它金额四个字
     *@author jianbin.zhong
     *@time 2018/5/22 15:46
     */
    public static String getOtherMoneyTex() throws UiObjectNotFoundException {
        return getObjectById(ID_MONEY).getChild(new UiSelector().index(3)).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *获取输入金额的描述（默认为“最大金额2000元”）
     *@author jianbin.zhong
     *@time 2018/5/22 15:48
     */
    public static String getInputMoneyDesc() throws UiObjectNotFoundException {
        return getTex(ID_INPUTMONEY);
    }

    /**
     *输入充值金额
     *@author jianbin.zhong
     *@time 2018/5/22 15:53
     */
    public static void setInputMoney(String money) throws UiObjectNotFoundException {
        setText(ID_INPUTMONEY,money);
    }

    /**
     *清除充值金额
     *@author jianbin.zhong
     *@time 2018/5/22 15:54
     */
    public static void clearInputMoney() throws UiObjectNotFoundException {
        clearText(ID_INPUTMONEY);
    }

    /**
     *点击下一步
     *@author jianbin.zhong
     *@time 2018/5/22 16:03
     */
    public static void clickNextCommit(){
        clickById(ID_NEXTCOMMIT);
    }

    /**
     *判断下一步按钮是否是置灰的
     *@author jianbin.zhong
     *@time 2018/5/22 16:47
     */
    public static boolean isNextCommitEnable() throws UiObjectNotFoundException {
        return getObjectById(ID_NEXTCOMMIT).isEnabled();
    }

    /**
     *获取使用和信通卡支付字
     *@author jianbin.zhong
     *@time 2018/5/22 16:07
     */
    public static String getChargeByHeXinPassTex() throws UiObjectNotFoundException {
        return getTex(ID_CHARGEBYHEXINPASS);
    }

    /**
     *点击使用和信通卡充值
     *@author jianbin.zhong
     *@time 2018/5/22 16:09
     */
    public static void clickChargeByHeXinPass(){
        clickById(ID_CHARGEBYHEXINPASS);
    }

    /**
     *进入使用和信通卡充值界面
     *@author jianbin.zhong
     *@time 2018/5/22 16:23
     */
    public static void navToChargeByHeXinPass(){
        clickById(ID_CHARGEBYHEXINPASS);
    }

    /**
     *和信通卡充值登录界面返回到充值界面
     *@author jianbin.zhong
     *@time 2018/5/22 16:25
     */
    public static void heBackToCharge(){
        clickById(ID_HEBACKCHARGE);
    }

    /**
     *获取“和信通卡充值”几个字
     *@author jianbin.zhong
     *@time 2018/5/22 16:27
     */
    public static String getHeTitle() throws UiObjectNotFoundException {
        return getTex(ID_HETITLE);
    }
    
    /**
     *获取“卡号”两个字
     *@author jianbin.zhong
     *@time 2018/5/22 16:30
     */
    public static String getCardTitle() throws UiObjectNotFoundException {
        return getObjectById(ID_HELOGIN).getChild(new UiSelector().index(1)).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *获取卡号描述，默认为“请输入19位卡号”
     *@author jianbin.zhong
     *@time 2018/5/22 16:32
     */
    public static String getCardDesc() throws UiObjectNotFoundException {
        return getTex(ID_CARD);
    }

    /**
     *输入卡号
     *@author jianbin.zhong
     *@time 2018/5/22 16:34
     */
    public static void inputCard(String card) throws UiObjectNotFoundException {
        setText(ID_CARD,card);
    }

    /**
     *清除卡号
     *@author jianbin.zhong
     *@time 2018/5/22 16:34
     */
    public static void clearCard() throws UiObjectNotFoundException {
        clearText(ID_CARD);
    }

    /**
     *获取“密码”两个字
     *@author jianbin.zhong
     *@time 2018/5/22 16:31
     */
    public static String getPasswordTitle() throws UiObjectNotFoundException {
        return getObjectById(ID_HELOGIN).getChild(new UiSelector().index(3)).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *输入密码
     *@author jianbin.zhong
     *@time 2018/5/22 16:38
     */
    public static void inputPassword(String password) throws UiObjectNotFoundException {
        setText(ID_PASSWORD, password);
    }

    /**
     *清除密码
     *@author jianbin.zhong
     *@time 2018/5/22 16:40
     */
    public static void clearPassword() throws UiObjectNotFoundException {
        clearText(ID_PASSWORD);
    }

    /**
     *点击确定
     *@author jianbin.zhong
     *@time 2018/5/22 16:42
     */
    public static void clickOk(){
        clickById(ID_OK);
    }

    /**
     *判定和信卡充值界面的确定是否是置灰的
     *@author jianbin.zhong
     *@time 2018/5/22 16:43
     */
    public static boolean isOkEnable() throws UiObjectNotFoundException {
        return getObjectById(ID_OK).isEnabled();
    }

    /**
     *获取“温馨提示:”
     *@author jianbin.zhong
     *@time 2018/5/22 16:49
     */
    public static String getTipTitle() throws UiObjectNotFoundException {
        return getTex(ID_TIP);
    }

    /**
     *获取温馨提示的内容
     *@author jianbin.zhong
     *@time 2018/5/22 16:51
     */
    public static String getTipContent() throws UiObjectNotFoundException {
        return getObjectById(ID_HELOGIN).getChild(new UiSelector().index(6)).getChild(new UiSelector().index(1)).getText();
    }

}