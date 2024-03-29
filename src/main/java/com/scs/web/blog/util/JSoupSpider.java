package com.scs.web.blog.util;

import com.scs.web.blog.entity.User;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * @author li_cao
 * @ClassName JSoupSpider
 * @Description TODO
 * @Date 2019/11/7
 * @Version 1.0
 **/
public class JSoupSpider {
    private static Logger logger = LoggerFactory.getLogger(JSoupSpider.class);

    /**
     * 爬取简书网热门作者数据
     *
     * @return
     */
    public static List<User> getUsers() {
        Document document = null;
        List<User> userList = new ArrayList<>(100);
        for (int i = 1; i <= 3; i++) {
            try {
                document = Jsoup.connect("https://www.jianshu.com/recommendations/users?utm_source=desktop&utm_medium=index-users&page=" + i).get();
            } catch (IOException e) {
                logger.error("连接失败");
            }
            Elements divs = document.getElementsByClass("col-xs-8");
            divs.forEach(div -> {
                Element wrapDiv = div.child(0);
                Element link = wrapDiv.child(0);
                Elements linkChildren = link.children();
                String introduction = linkChildren.get(2).text();
                if (!introduction.equals("") && introduction != null) {
                    User user = new User();
                    user.setMobile(DataUtil.getMobile());
                    user.setPassword(DataUtil.getPassword());
                    user.setGender(DataUtil.getGender());
                    user.setAvatar("https:" + linkChildren.get(0).attr("src"));
                    user.setNickname(linkChildren.get(1).text());
                    user.setIntroduction(introduction);
                    user.setBirthday(DataUtil.getBirthday());
//                    user.setAddress(DataUtil.getAddress());
//                    user.setCreateTime(DataUtil.getCreateTime());
                    userList.add(user);
                }

            });
        }
        return userList;
    }

}
