package com.sikiedu.mapper;

import com.sikiedu.bean.User;
import com.sikiedu.bean.UserVo;

import java.util.List;

public interface UserMapper {

    //1.接口方法名需要与mapper.xml的要调用的sql语句的id一致
    //2.接口的形参类型需要与mapper.xml parameterType一致
    //3.接口的返回值需要与mapper.xml resultType一致
    //4.mapper.xml中namespace要与接口的全包名一致
    //5.注意mapper动态代理开发中,根据返回值类型来自动选择

    //通过id查询一个用户
    public User selectUserById(Integer id);

   //通过用户名模糊查询,获取用户列表
   public List<User> selectUserByName(String name);

   //通过UserVo的id查询一个用户
   public User selectUserByUserVoId(UserVo vo);

   //查询用户总条数
    public Integer selectUserCount();

    //查询所有用户的包装类
    public List<UserVo> selectAllUserVo();

    //多条件查询,通过用户对象中的条件查询用户列表
    public List<User> selectUserListByUser(User u);

    //多条件查询,通过用户对象中的条件查询用户列表Trim
    public List<User> selectUserListByUserTrim(User u);

    //更新用户表
    public void updateSetUser(User u);

    //使用多个id获取用户列表 by list
    public List<User> selectUserByList(List<Integer> idList);

    //使用多个id获取用户列表
    public List<User> selectUserByIds(Integer[] ids);

    //使用多个id获取用户列表 by userVo
    public List<User> selectUserListByUserVo(UserVo vo);



}
