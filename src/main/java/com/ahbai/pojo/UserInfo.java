package com.ahbai.pojo;

public class UserInfo {
    /**
     * userid` int(11) NOT NULL AUTO_INCREMENT,
     *   `username` varchar(30) DEFAULT NULL,
     *   `password` varchar(30) DEFAULT NULL,
     *   `regemail` varchar(100) DEFAULT NULL,
     *   `phone` varchar(15) DEFAULT NULL,
     *   `icon` varchar(255) DEFAULT NULL,
     *   PRIMARY KEY (`userid`)
     * ) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='Ӄ�r/>
     */
    private int userId;
    private String userName;
    private String password;
    private String regEmail;
    private String phone;
    private String icon;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegEmail() {
        return regEmail;
    }

    public void setRegEmail(String regEmail) {
        this.regEmail = regEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public UserInfo() {
    }

    public UserInfo(int userId, String userName, String password, String regEmail, String phone, String icon) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.regEmail = regEmail;
        this.phone = phone;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", regEmail='" + regEmail + '\'' +
                ", phone='" + phone + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
