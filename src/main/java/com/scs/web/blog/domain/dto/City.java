package com.scs.web.blog.domain.dto;

import lombok.Data;
/**
 * @author li_cao
 * @ClassName City
 * @Description TODO
 * @Date 2019/11/15
 * @Version 1.0
 **/
@Data
public class City {
    private String name;
    private String level;

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
}
