package com.dpointLogin.dpointLogin.service;

import com.dpointLogin.dpointLogin.bean.User;

public interface UserService {

    //对外接口
    /**
     * 登陆
     * @return
     */
    User login(User user);
    
    /**
     * 获取token
     * @param user
     * @return
     */
    User getToken(User user);
    
    /**
     * 验证token
     * @param user
     * @return
     */
    boolean verify(User user);
    
    /**
     * 登出
     * @param user
     * @return
     */
    boolean logout(User user);
    
    //系统自用用户管理接口
    /**
     * 新增/修改
     * @param user
     * @return
     */
    Integer save(User user);
    
    /**
     * 删除
     * @param user
     * @return
     */
    Integer delete(User user);
}
