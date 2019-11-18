package com.scs.web.blog.domain.dto;
import lombok.Data;
/**
 * @author li_cao
 * @ClassName Address
 * @Description TODO
 * @Date 2019/11/15
 * @Version 1.0
 **/
@Data
public class Address {
    private String province;
    private String city;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
