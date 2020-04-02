package com.hz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @version V1".0
 * @author: hezheng
 * @date: 2020/3/25 1\\\"\\6:2\\"5
 */
@RestController
public class IconController {
    String iconStr = ".icon-zan:before{content:'\\e612'}," +
            ".icon-jiazaizhong:before{content:'\\e60e'}," +
            ".icon-sousuo:before{content:'\\e621'}," +
            ".icon-quanpingpad:before{content:'\\e61d'}," +
            ".icon-shezhi:before{content:'\\e607'}," +
            ".icon-renzhengv:before{content:'\\e62b'}," +
            ".icon-shijian:before{content:'\\e60a'}," +
            ".icon-guanbi:before{content:'\\e614'}," +
            ".icon-tianjia:before{content:'\\e616'}," +
            ".icon-tuichu:before{content:'\\e601'}," +
            ".icon-shui:before{content:'\\e602'}," +
            ".icon-qq:before{content:'\\e618'}," +
            ".icon-weibo:before{content:'\\e617'}," +
            ".icon-tupian:before{content:'\\e608'}," +
            ".icon-logo:before{content:'\\e603'}," +
            ".icon-daima:before{content:'\\e609'}," +
            ".icon-biaoqing:before{content:'\\e60f'}," +
            ".icon-nan:before{content:'\\e619'}," +
            ".icon-nv:before{content:'\\e61a'}," +
            ".icon-quitquanping:before{content:'\\e61e'}," +
            ".icon-zuichun:before{content:'\\e61c'}," +
            ".icon-charushuipingxian:before{content:'\\e622'}," +
            ".icon-yulan:before{content:'\\e60d'}," +
            ".icon-liulanyanjing:before{content:'\\e60b'}," +
            ".icon-touxiang:before{content:'\\e604'}," +
            ".icon-caina:before{content:'\\e613'}," +
            ".icon-room:before{content:'\\e615'}," +
            ".icon-svgmoban53:before{content:'\\e610'}," +
            ".icon-shichang:before{content:'\\e600'}," +
            ".icon-shouye:before{content:'\\e605'}," +
            ".icon-tishilian:before{content:'\\e629'}," +
            ".icon-fabu:before{content:'\\e606'}," +
            ".icon-pinglun:before{content:'\\e60c'}," +
            ".icon-zan1:before{content:'\\e611'}," +
            ".icon-chengshi:before{content:'\\e61b'}," +
            ".icon-lianjie:before{content:'\\e620'}," +
            ".icon-yulan1:before{content:'\\e785'}," +
            ".icon-renshu:before{content:'\\e61f'}," +
            ".icon-huizongzuoyoutuodong:before{content:'\\e623'}," +
            ".icon-404:before{content:'\\e627'}," +
            ".icon-iconmingxinganli:before{content:'\\e652'}," +
            ".icon-wenda:before{content:'\\e626'}," +
            ".icon-top:before{content:'\\e624'}," +
            ".icon-ui:before{content:'\\e625'}," +
            ".icon-fengexian:before{content:'\\e63a'}," +
            ".icon-jiacu:before{content:'\\e62f'}," +
            ".icon-kiss:before{content:'\\e6cd'}," +
            ".icon-biaoqing1:before{content:'\\e63b'}," +
            ".icon-emwdaima:before{content:'\\e62a'}," +
            ".icon-jifen:before{content:'\\e632'}," +
            ".icon-aqrenzheng:before{content:'\\e62d'}," +
            ".icon-pinglun1:before{content:'\\e631'}," +
            ".icon-yxj-expression:before{content:'\\e628'}," +
            ".icon-tongzhi:before{content:'\\e647'}," +
            ".icon-pinglun2:before{content:'\\e62c'}," +
            ".icon-jiaoliu:before{content:'\\e6b7'}," +
            ".icon-renzheng:before{content:'\\e62e'}";

    @GetMapping("/icons")
    public String[] icon() {
        return iconStr.split(",");
    }
}
