package com.scs.web.blog.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * @author li_cao
 * @ClassName ProvinceList
 * @Description TODO
 * @Date 2019/11/17
 * @Version 1.0
 **/
@Data
public class ProvinceList {
    private List<Province> provinceList;

    public List<Province> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<Province> provinceList) {
        this.provinceList = provinceList;
    }
}