package com.example.post;

public class postdata {
    String title,description,date,like,comment,share;
    int icon,post_image,moree;

    public postdata(String title, String description, String date, String like, String comment, String share, int icon, int post_image, int moree) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.like = like;
        this.comment = comment;
        this.share = share;
        this.icon = icon;
        this.post_image = post_image;
        this.moree = moree;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getPost_image() {
        return post_image;
    }

    public void setPost_image(int post_image) {
        this.post_image = post_image;
    }

    public int getMoree() {
        return moree;
    }

    public void setMoree(int moree) {
        this.moree = moree;
    }
}
