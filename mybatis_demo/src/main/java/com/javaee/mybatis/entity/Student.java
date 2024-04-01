package com.javaee.mybatis.entity;

import java.util.List;

/***
 * 学生
 */
public class Student {

    private int id;
    private String cnname;
    private char sex;
    private String note;

    private IdCard idCard; //学生证

    private List<HelthInfo> helthInfos; //学生的体检记录

    public List<HelthInfo> getHelthInfos() {
        return helthInfos;
    }

    public void setHelthInfos(List<HelthInfo> helthInfos) {
        this.helthInfos = helthInfos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", cnname='" + cnname + '\'' +
                ", sex=" + sex +
                ", note='" + note + '\'' +
                ", idCard=" + idCard +
                ", helthInfos=" + helthInfos +
                '}';
    }
}
