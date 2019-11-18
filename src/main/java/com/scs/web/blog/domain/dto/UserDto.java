package com.scs.web.blog.domain.dto;
import lombok.Data;
/**
 * @author li_cao
 * @ClassName UserDto
 * @Description TODO
 * @Date 2019/11/15
 * @Version 1.0
 **/
@Data
public class UserDto {
    private String mobile;
    private String password;

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

    public UserDto(String mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }

    public UserDto() {
    }
}