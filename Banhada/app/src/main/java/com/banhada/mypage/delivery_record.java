package com.banhada.mypage;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class delivery_record {
    String name, ordernum,state;
    int imageView;

    public delivery_record(String name, String ordernum, String state, int imageView){
        this.name = name;
        this.ordernum = ordernum;
        this.state = state;
        this.imageView = imageView;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}