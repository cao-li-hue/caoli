package com.scs.web.blog.util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.scs.web.blog.domain.dto.City;
import com.scs.web.blog.domain.dto.Province;
import com.scs.web.blog.domain.dto.ProvinceList;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
 /**
 * @author li_cao
 * @ClassName DataUtil
 * @Description TODO
 * @Date 2019/11/15
 * @Version 1.0
 **/
 public class DataUtil {


     /**
      * 生成手机号
      *
      * @return
      */
     public static String getMobile() {

         StringBuilder stringBuilder = new StringBuilder("139");
         Random random = new Random();
         for (int i = 0; i < 8; i++) {
             int num = random.nextInt(10);
             stringBuilder.append(num);
         }
         return stringBuilder.toString();
     }

     /**
      * 生成密码并用MD5加密
      *
      * @return
      */
     public static String getPassword() {
         Random random = new Random();
         StringBuilder stringBuilder = new StringBuilder();
         for (int i = 0; i < 6; i++) {
             int num = random.nextInt(10);
             stringBuilder.append(num);
         }
         return DigestUtils.md5Hex(stringBuilder.toString());
     }

     /**
      * 生成性别
      *
      * @return
      */
     public static String getGender() {
         Random random = new Random();
         String[] genders = new String[]{"男", "女"};
         int index = random.nextInt(2);
         return genders[index];
     }

     /**
      * 生成生日
      *
      * @return
      */
     public static LocalDate getBirthday() {
         LocalDate now = LocalDate.now();
         Random random = new Random();
         int bound = random.nextInt(6666);
         return now.minusDays(bound);
     }
 }
