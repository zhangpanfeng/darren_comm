package com.darren.comm.client.user.service;

import java.util.List;

import com.darren.comm.user.po.User;
import com.darren.comm.vo.ResultHandle;

/**
 * 用户服务接口
 * 
 * @author zhangpanfeng
 * 
 */
public interface UserClientService {
    /**
     * 查询所有的用户
     * 
     * @return 所有的用户
     */
    ResultHandle<List<User>> findAllUsers();

    /**
     * 创建用户
     * 
     * @param user
     *            用户信息
     * @return 用户ID
     */
    ResultHandle<String> saveUser(User user);

    /**
     * 根据用户名和密码查用户
     * 
     * @param userName
     *            用户名
     * @param password
     *            密码
     * @return 用户信息
     */
    ResultHandle<User> findUserByNameAndPassword(String userName, String password);
}
