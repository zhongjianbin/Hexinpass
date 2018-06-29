package projects.wlye.pages.subpages.submainpages;

import android.support.test.uiautomator.UiObjectNotFoundException;

import java.util.logging.Logger;

import helper.base.VP2;

/**
 * Author:jianbin.zhong
 * Date: 2018/6/29 9:43
 * Description:
 */

public class LegalPage extends VP2 {

    private static Logger logger = Logger.getLogger(LegalPage.class.getName());

    public static String ID_TITLE = "com.staff.wuliangye:id/title";//title

    public static String getTitle() throws UiObjectNotFoundException {
        return getTex(ID_TITLE);
    }
}