package com.techone.instagramclone;

import androidx.dynamicanimation.animation.SpringAnimation;

public class PostModel {

    private int profileDP;
    private String username;
    private int menu;
    private int post;
    private int comment;
    private int share;
    private int save;
    private  String likes;
    private  String userNameincaptions;
    private  String caption;
    private  String comments;
    private  String commentusername;
    private  int profileDP_belowcomment;
    private  String addcomment;
    private  String time;

    public PostModel(String username,int profileDP, int post, String likes,  String caption) {
        this.profileDP = profileDP;
        this.username = username;
        this.likes = likes;
        this.caption = caption;
        this.post=post;
    }

    public int getProfileDP() {
        return profileDP;
    }

    public void setProfileDP(int profileDP) {
        this.profileDP = profileDP;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getUserNameincaptions() {
        return userNameincaptions;
    }

    public void setUserNameincaptions(String userNameincaptions) {
        this.userNameincaptions = userNameincaptions;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCommentusername() {
        return commentusername;
    }

    public void setCommentusername(String commentusername) {
        this.commentusername = commentusername;
    }

    public int getProfileDP_belowcomment() {
        return profileDP_belowcomment;
    }

    public void setProfileDP_belowcomment(int profileDP_belowcomment) {
        this.profileDP_belowcomment = profileDP_belowcomment;
    }

    public String getAddcomment() {
        return addcomment;
    }

    public void setAddcomment(String addcomment) {
        this.addcomment = addcomment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
