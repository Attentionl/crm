package com.sxdx.basic.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李今朝
 * @className MessageUtil
 * @version1.0
 * @description 用来统一作为response的返回类
 * @createdTime 2020/2/6 21:15
 */
public class MessageUtil {

    /**
     * @param msg
     * @name: success
     * @description: 用于返回处理成功的消息, 不携带返回数据
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/6 21:17
     * @auther: 李今朝
     */
    public static Message success(String msg) {
        Message message = new Message();
        message.setCode(200);
        message.setMessage(msg);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }

    /**
     * @param msg
     * @name: success
     * @description: 用于返回处理成功的消息, 携带返回数据
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/6 21:17
     * @auther: 李今朝
     */
    public static Message success(String msg, String key, Object value) {
        Message message = new Message();
        message.setCode(200);
        message.setMessage(msg);
        message.setTimestamp(System.currentTimeMillis());
        return message.addData(key, value);
    }

    /**
     * @param msg
     * @name: error
     * @description: TODO 用于返回处理错误的信息
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/6 21:42
     * @auther: 李今朝
     */
    public static Message error(String msg) {
        Message message = new Message();
        message.setCode(500);
        message.setMessage(msg);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }

    /**
     * @param msg
     * @name: error
     * @description: TODO 告知用户权限不足
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/6 21:42
     * @auther: 李今朝
     */
    public static Message forbidden(String msg) {
        Message message = new Message();
        message.setCode(403);
        message.setMessage(msg);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }

    /**
     * @param msg
     * @name: error
     * @description: TODO 返回未授权的提示
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/6 21:42
     * @auther: 李今朝
     */
    public static Message unAuthorized(String msg) {
        Message message = new Message();
        message.setCode(401);
        message.setMessage(msg);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }

    public static Message success(Object data){
        Message message = new Message();
        message.setCode(200);
        message.setMessage("success");
        HashMap map = (HashMap) data;
        message.setMap(map);
//        message.setTimestamp(new Date().getTime());
        return message;
    }

}
