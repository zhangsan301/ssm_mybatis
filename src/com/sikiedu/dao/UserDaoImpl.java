package com.sikiedu.dao;

import com.sikiedu.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class UserDaoImpl implements UserDao {

   private SqlSessionFactory ssf;

    public UserDaoImpl(SqlSessionFactory ssf) {
        this.ssf = ssf;
    }

    public User getUserById(Integer id) {

    //生产一个sqlSession
    SqlSession session =ssf.openSession();
    //操作数据库
    return session.selectOne("UserMapper.selectUserById",id);
   }






}
