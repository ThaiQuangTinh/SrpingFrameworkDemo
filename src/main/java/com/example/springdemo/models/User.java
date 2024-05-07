package com.example.springdemo.models;

public class User {

    private int UserID;

    private  String Username;

    private  String Email;

    private  String Password;

    private String AvatarURL;

    private  String Description;

    private  int RoleID;

    private boolean CanPost;

    private boolean CanComment;

    public User(int userID, String username, String email, String password, String avatarURL, String description, int roleID, boolean canPost, boolean canComment) {
        UserID = userID;
        Username = username;
        Email = email;
        Password = password;
        AvatarURL = avatarURL;
        Description = description;
        RoleID = roleID;
        CanPost = canPost;
        CanComment = canComment;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAvatarURL() {
        return AvatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        AvatarURL = avatarURL;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int roleID) {
        RoleID = roleID;
    }

    public boolean isCanPost() {
        return CanPost;
    }

    public void setCanPost(boolean canPost) {
        CanPost = canPost;
    }

    public boolean isCanComment() {
        return CanComment;
    }

    public void setCanComment(boolean canComment) {
        CanComment = canComment;
    }
}
