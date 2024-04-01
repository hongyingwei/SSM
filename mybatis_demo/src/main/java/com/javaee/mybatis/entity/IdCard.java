package com.javaee.mybatis.entity;

import java.util.Date;

public class IdCard {

    private int id;
    private int student_id;//学生ID
    private String natives;
    private Date issue_date;
    private Date end_date;
    private String note;

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

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    public Date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", natives='" + natives + '\'' +
                ", issue_date=" + issue_date +
                ", end_date=" + end_date +
                ", note='" + note + '\'' +
                '}';
    }
}