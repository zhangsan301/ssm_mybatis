package com.sikiedu.mapper;

import com.sikiedu.bean.Country;
import com.sikiedu.bean.CountryVo;

import java.util.List;

public interface CountryMapper {
    //查询所有
    List<Country> selectAll();
    //查询所有的CountryVo
    List<CountryVo> selectAllCountryVo();




}
