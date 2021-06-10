package com.banhada.product;

public class MealKitListItem {
    int imgView;
    String text1;
    String text2;

    MealKitListItem(int imgView, String text1, String text2){
        this.imgView=imgView;
        this.text1=text1;
        this.text2=text2;
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
    public String getText2(){
        return text2;
    }
    public void setText2(){
        this.text2=text2;
    }
}
