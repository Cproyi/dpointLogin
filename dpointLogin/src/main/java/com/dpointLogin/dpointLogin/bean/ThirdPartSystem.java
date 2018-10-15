package com.dpointLogin.dpointLogin.bean;

import java.io.Serializable;

/**
 * @author cproyi
 *
 */
public class ThirdPartSystem implements Serializable{

    private static final long serialVersionUID = -2357215045084930440L;

    private String id;
    
    private String name;
    
    private String createTime;
    /**
     * 注册地址
     */
    private String url;
    
    /**
     * 客户端令牌接收接口
     */
    private String callback_token_accept_url;
    
    /**
     * 客户端令牌验证结果接收接口
     */
    private String callback_token_verify_url;
    
    /**
     * 客户端令牌注销接受接口
     */
    private String callback_cancel_url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCallback_token_accept_url() {
        return callback_token_accept_url;
    }

    public void setCallback_token_accept_url(String callback_token_accept_url) {
        this.callback_token_accept_url = callback_token_accept_url;
    }

    public String getCallback_token_verify_url() {
        return callback_token_verify_url;
    }

    public void setCallback_token_verify_url(String callback_token_verify_url) {
        this.callback_token_verify_url = callback_token_verify_url;
    }

    public String getCallback_cancel_url() {
        return callback_cancel_url;
    }

    public void setCallback_cancel_url(String callback_cancel_url) {
        this.callback_cancel_url = callback_cancel_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
