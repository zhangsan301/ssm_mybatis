package com.sikiedu.test;

import com.sikiedu.bean.Country;
import com.sikiedu.bean.CountryVo;
import com.sikiedu.bean.User;
import com.sikiedu.bean.UserVo;
import com.sikiedu.mapper.CountryMapper;
import com.sikiedu.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class MapperTest {

    @Test
    public void Test1() throws IOException {
        String resource ="sqlMapConfig.xml";
        //读取配置文件
        InputStream in = Resources.getResourceAsStream(resource);

        //创建sqlSessionfactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);

        //生产一个sqlSession
        SqlSession session = ssf.openSession();

        UserMapper mapper=session.getMapper(UserMapper.class);

        User user =mapper.selectUserById(1);
        System.out.println(user);
    }
}
