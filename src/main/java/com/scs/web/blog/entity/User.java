package com.scs.web.blog.entity;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 * @author li_cao
 * @ClassName User
 * @Description TODO
 * @Date 2019/11/15
 * @Version 1.0
 **/
@Data
public class User {
    private Long id;
    private String mobile;
    private String password;
    private String nickname;
    private String avatar;
    private String gender;
    private LocalDate birthday;
    private String address;
    private String introduction;
    //个人中心背景图
    private String banner;
    //邮箱
    private String email;
    //主页
    private String homepage;
    private Short follows;
    private Short fans;
    private Short articles;
    private LocalDateTime createTime;
    private Short status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Short getFollows() {
        return follows;
    }

    public void setFollows(Short follows) {
        this.follows = follows;
    }

    public Short getFans() {
        return fans;
    }

    public void setFans(Short fans) {
        this.fans = fans;
    }

    public Short getArticles() {
        return articles;
    }

    public void setArticles(Short articles) {
        this.articles = articles;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}