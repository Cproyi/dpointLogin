package com.dpointLogin.dpointLogin.service;

import com.dpointLogin.dpointLogin.bean.ThirdPartSystem;
import com.dpointLogin.dpointLogin.common.Result;

/**
 * @author : cproyi
 * @desc : 系统管理，管理系统
 */
public interface ThirdPartSystemService {

    /**
     * 系统注册接口
     * @return
     */
    Result<String> registry(ThirdPartSystem tpSys);
    
    /**
     * 系统注销接口
     * @return
     */
    Result<String> cancel (ThirdPartSystem tpSys);
    
}
