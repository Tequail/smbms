package com.githup.mybatis.dao;

import com.githup.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findUser();

    /**
     * 根据用户姓名进行模糊查询用户信息
     * @param name
     * @return
     */
    User findUserByUserName(String name);

    /**
     * 根据角色id和用户名进行查询用户
     * @param user
     * @return
     */
    User findUserByUserNameAndUserRole(User user);

    /**
     * 根据map集合信息来查询用户信息
     * @param map
     * @return
     */
    User findUserByMap(Map<String, Object> map);

    /**
     * 注解param  就可以将参数注入到 UserMapper.xml文件里面
     * 根据姓名和角色Id查询用户信息
     * @param name
     * @param role
     * @return
     */
    User findUserByUserNameAndUserRole1(@Param("userName") String name,@Param("userRole") int role);
}
