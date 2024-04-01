package com.javaee.mybatis.entity;

import java.util.Date;

public class HelthInfo {

    private int id;
    private int student_id;
    private Date check_date; //检查时间
    private String heart;
    private String liver;
    private String lung;
    private String note; //描述信息

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Date getCheck_date() {
        return check_date;
    }

    public void setCheck_date(Date check_date) {
        this.check_date = check_date;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getLiver() {
        return liver;
    }

    public void setLiver(String liver) {
        this.liver = liver;
    }

    public String getLung() {
        return lung;
    }

    public void setLung(String lung) {
        this.lung = lung;
    }

    @Override
    public String toString() {
        return "HelthInfo{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", check_date=" + check_date +
                ", heart='" + heart + '\'' +
                ", liver='" + liver + '\'' +
                ", lung='" + lung + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
