package com.sxdx.customer.test.userVm;

/**
 * @author 毕必成
 * @description 测试登录
 * @data 2020-02-2020/2/20
 **/
public class UserVM {
    private String username;
    private String password;

//    public void setUserName(String username) {
//        this.username = username;
//    }
//
//    public void setPassWord(String password) {
//        this.password = password;
//    }
//
//    public String getUserName() {
//        return username;
//    }
//
//    public String getPassWord() {
//        return password;
//    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserVM{" +
                "userName='" + username + '\'' +
                ", passWord='" + password + '\'' +
                '}';
    }
}
