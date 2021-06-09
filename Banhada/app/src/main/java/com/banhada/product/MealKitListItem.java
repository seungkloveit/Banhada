package com.banhada.product;

public class MealKitListItem {
    int imgView;
    String text1;

    MealKitListItem(int imgView, String text1){
        this.imgView=imgView;
        this.text1=text1;
    }
    public int getImgView(){
        return imgView;
    }
    public void setImgView(int imgView){
        this.imgView=imgView;
    }
    public String getText1(){
        return text1;
    }
    public void setText1(){
        this.text1=text1;
    }
}
