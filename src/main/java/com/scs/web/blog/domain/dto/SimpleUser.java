package com.scs.web.blog.domain.dto;
import lombok.Data;
/**
 * @author li_cao
 * @ClassName SimpleUser
 * @Description TODO
 * @Date 2019/11/17
 * @Version 1.0
 **/
@Data
public class SimpleUser {
    private Long id;
    private String nickname;
    private String avatar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
