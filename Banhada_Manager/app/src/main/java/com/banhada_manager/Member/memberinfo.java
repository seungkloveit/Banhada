package com.banhada_manager.Member;

public class memberinfo {

    String mname;
    String mid ;
    String mphone;
    String mmail;
    String maddr;

    public memberinfo(String name, String id, String tel, String mail, String addr) {
        mname = name;
        mid =id;
        mphone = tel;
        mmail = mail;
        maddr = addr;
    }


    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMmail() {
        return mmail;
    }

    public void setMmail(String mmail) {
        this.mmail = mmail;
    }

    public String getMaddr() {
        return maddr;
    }

    public void setMaddr(String maddr) {
        this.maddr = maddr;
    }
}
