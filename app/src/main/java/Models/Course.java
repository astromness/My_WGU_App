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
    private List<Mentor> mentors;

    public Course() {
    }

    public Course(String id, int credit_units, String name, Assessment assess, List<Mentor> mentors) {
        this.id = id;
        this.credit_units = credit_units;
        this.name = name;
        this.assess = assess;
        this.mentors = mentors;
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

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
    }


}
