package com.practice1.String1;

public class userLogin {
    private String username = "biscuit";
    private String password = "gundam19980505";
    public String confirmUsername;
    public String confirmPassword;

    public userLogin(){}

    public userLogin(String username,String password){
        confirmUsername = username;
        confirmPassword = password;
        confirm(confirmUsername,confirmPassword);
    }

    public boolean confirm(String username,String password){
        if(confirmUsername.equals(username)&&confirmPassword.equals(password)){
            return true;
        }else {
            System.out.println("用户名或密码有误。");
            return false;
        }
    }
}
