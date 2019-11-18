package com.scs.web.blog.domain.dto;
import lombok.Data;

import java.util.List;
import java.util.Set;
/**
 * @author li_cao
 * @ClassName Provinces
 * @Description TODO
 * @Date 2019/11/15
 * @Version 1.0
 **/
@Data
public class Province {
    private String name;
    private String level;
    private String code;
    private List<City> cities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}