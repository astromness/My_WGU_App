package com.example.my_wgu_app.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "assessment_attempts")
public class Assessment_Attempt {
    @PrimaryKey
    @ColumnInfo(name = "student_id")
    private Student student;
    @PrimaryKey
    private int attempt_number;
    @PrimaryKey
    @ColumnInfo(name = "assessment_id")
    private Assessment assessment;
    private String status;
    private int correct;
    private Date goal_date;

    public Assessment_Attempt(int attempt_number, String status, int correct, Assessment assessment, Student student, Date goal_date) {
        this.attempt_number = attempt_number;
        this.status = status;
        this.correct = correct;
        this.assessment = assessment;
        this.student = student;
        this.goal_date = goal_date;
    }

    public Assessment_Attempt() {
    }

    public Date getGoal_date() {
        return goal_date;
    }

    public void setGoal_date(Date goal_date) {
        this.goal_date = goal_date;
    }

    public int getAttempt_number() {
        return attempt_number;
    }

    public void setAttempt_number(int attempt_number) {
        this.attempt_number = attempt_number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public Assessment getAssessment() {
        return assessment;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }
}
