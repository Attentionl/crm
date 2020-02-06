package com.sxdx.basic.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李今朝
 * @className Message
 * @version1.0
 * @description 用于Controller返回数据类
 * @createdTime 2020/2/6 21:11
 */
public class Message {

    /**
     * 保存状态码
     */
    private Integer code;
    /**
     * 保存提示信息，成功，失败等等
     */
    private String message;
    /**
     * 用于保存返回的数据
     */
    private Map map = new HashMap();
    /**
     * 用于记录放回数据的时间戳
     */
    private Long timestamp;

    /**
     * @name: addData
     * @description: TODO用于链式添加数据
     * @param key
     * @param value
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/6 21:32
     * @auther: 李今朝
     */
    public Message addData(String key, Object value){
        this.getMap().put(key,value);
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
