package webProgramming.recommendTravel.dto;

import jakarta.persistence.Column;

public class UserRequest {

    private String userid;
    //    @Column(nullable = false, length = 25)
    @Column
    private String username;
    //    @Column(nullable = false, length = 25)
    @Column
    private String password;
    //    @Column(length = 100)
    @Column
    private String email;
    //    @Column(length = 4)
    @Column
    private String mbti_type;

    //getters and setters

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMbti_type() {
        return mbti_type;
    }

    public void setMbti_type(String mbti_type) {
        this.mbti_type = mbti_type;
    }





}
