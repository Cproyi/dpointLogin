package com.dpointLogin.dpointLogin.common;

/**
 * @author 
 *
 * @param <T>
 */
public class Result<T> {

    /**
     * 0 - success
     * -1 - failed
     */
    private Integer code;
    
    private String msg;
    
    private T data;
    
    private Result(Integer code,String msg,T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    
    public Result<T> result(Integer code,String msg,T data) {
        return new Result<T>(code,msg,data);
    }
    
    public Result<T> result(String msg,T data) {
        return new Result<T>(0,msg,data);
    }
    
    public Result<T> result(T data) {
        return new Result<T>(0,"success",data);
    }
    
    public Result<T> result(Integer code,String msg) {
        return new Result<T>(code,msg,null);
    }
    
    public Result<T> result(String msg) {
        return new Result<T>(0,msg,null);
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
