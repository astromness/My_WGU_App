package com.example.my_wgu_app.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "Terms")
public class Term {
    @PrimaryKey
    private int term_number;
    @PrimaryKey
    @ColumnInfo(name = "student_id")
    private Student student;
    private String title;
    private List<Course> planned_courses;
    private List<Course_Attempt> courses;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getTerm_number() {
        return term_number;
    }

    public void setTerm_number(int term_number) {
        this.term_number = term_number;
    }

    public List<Course> getPlanned_courses() {
        return planned_courses;
    }

    public void setPlanned_courses(List<Course> planned_courses) {
        this.planned_courses = planned_courses;
    }

    public List<Course_Attempt> getCourses() {
        return courses;
    }

    public void setCourses(List<Course_Attempt> courses) {
        this.courses = courses;
    }

    public String getTitle() {
        if (this.title == null)
            return "Term " + term_number;

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Term() {
    }

    public Term(int term_number, Student student, String title, List<Course> planned_courses, List<Course_Attempt> courses) {
        this.term_number = term_number;
        this.student = student;
        this.planned_courses = planned_courses;
        this.courses = courses;
        this.title = title;
    }
}
