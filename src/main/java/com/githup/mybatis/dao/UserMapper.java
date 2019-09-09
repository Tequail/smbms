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

    /**
     * 根据用户名查找用户
     * @param i
     * @return
     */
    List<User> findUserListByGender(int i);

    /**
     * 根据用户名和角色id查询用户
     * @param name
     * @param roleId
     * @return
     */
    User findUserByUserNameAndUserRole2(@Param("userName") String name,@Param("userRole") int roleId);

    /**
     * 增加用户信息
     * @return
     */
    int addUser();

    /**
     * 根据用户信息修改用户
     * @param user
     * @return
     */
    int updateUserNameAndUserCode(User user);

    /**
     * 根据姓名删除用户
     * @param name
     * @return
     */
    int deleteUserByUserName(@Param("userName") String name);

    /**
     * 根据用户名和角色id查询用户信息和角色信息
     * @param name
     * @param role
     * @return
     */
    User queryUserAndRoleByUserNameAndUserRole(@Param("userName") String name,@Param("userRole") int role);

    /**
     * 根据用户名和用户id查询用户信息角色信息地址信息
     * @param name
     * @param role
     * @return
     */
    User queryUserAndAddressAndRoleByUserNameAndUserRole(@Param("userName") String name,@Param("userRole") Integer role);
}
