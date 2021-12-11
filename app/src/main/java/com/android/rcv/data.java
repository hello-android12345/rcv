package com.android.rcv;

public class data
{
    String title,des,img_url;

    public data(String title, String des, String img_url) {
        this.title = title;
        this.des = des;
        this.img_url = img_url;
    }

    public data() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
