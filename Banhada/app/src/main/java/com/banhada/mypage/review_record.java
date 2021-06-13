package com.banhada.mypage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class review_record {

    int imageView;
    String content;
    float rating;
    public review_record(int imageView, String content, float rating){
        this.imageView = imageView;
        this.content = content;
        this.rating = rating;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
