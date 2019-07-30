package Models;

import Utilities.Course_Status;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.List;

@Entity(tableName = "courses")
public class Course {
    @PrimaryKey
    private String id;
    private int credit_units;
    private String name;
    @ColumnInfo(name = "assessment_id")
    private Assessment assess;
    private Course_Status status;
    private String note;
    private List<Mentor> mentors;
    private Date end;
    private Date start;

    public Course() {
    }

    public Course(String id, int credit_units, String name, Assessment assess, Course_Status status, String note, List<Mentor> mentors, Date end, Date start) {
        this.id = id;
        this.credit_units = credit_units;
        this.name = name;
        this.assess = assess;
        this.status = status;
        this.note = note;
        this.mentors = mentors;
        this.end = end;
        this.start = start;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCredit_units() {
        return credit_units;
    }

    public void setCredit_units(int credit_units) {
        this.credit_units = credit_units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Assessment getAssess() {
        return assess;
    }

    public void setAssess(Assessment assess) {
        this.assess = assess;
    }

    public Course_Status getStatus() {
        return status;
    }

    public void setStatus(Course_Status status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
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


}
