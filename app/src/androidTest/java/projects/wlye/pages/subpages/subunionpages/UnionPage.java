package projects.wlye.pages.subpages.subunionpages;

import java.util.logging.Logger;

import helper.base.VP2;

/**
 * Author:jianbin.zhong
 * Date: 2018/6/28 16:56
 * Description:
 */

public class UnionPage extends VP2{

    private static Logger logger = Logger.getLogger(UnionPage.class.getName());

    public static String TEXT_VISIT = "继续访问";

    public static void confirmHttps(){
        waitTime(2);
        if (getObjectByText(TEXT_VISIT).exists()){
            clickByText(TEXT_VISIT);
        }else {
            logger.info("no need to confirm https");
        }
    }
}