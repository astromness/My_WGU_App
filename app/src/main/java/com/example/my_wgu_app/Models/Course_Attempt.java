package com.example.my_wgu_app.Models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.List;

@Entity(tableName = "attempts")
public class Course_Attempt {
    @PrimaryKey(autoGenerate = true)
    private int attempt_id;
    private Student student;
    private Course course;
    private Date end;
    private Date start;
    private String note;
    private List<Assessment_Attempt> assessments;

    public Course_Attempt(int attempt_id, Student student, Course course, Date end, Date start, String note, List<Assessment_Attempt> assessments) {
        this.attempt_id = attempt_id;
        this.student = student;
        this.course = course;
        this.end = end;
        this.start = start;
        this.note = note;
        this.assessments = assessments;
    }

    public Course_Attempt( Student student, Course course, Date end, Date start, String note, List<Assessment_Attempt> assessments) {
        this.student = student;
        this.course = course;
        this.end = end;
        this.start = start;
        this.note = note;
        this.assessments = assessments;
    }

    public Course_Attempt() {
    }

    public int getAttempt_id() {
        return attempt_id;
    }

    public void setAttempt_id(int attempt_id) {
        this.attempt_id = attempt_id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Assessment_Attempt> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Assessment_Attempt> assessments) {
        this.assessments = assessments;
    }
}
