package Models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "programs")
public class Program {
    @PrimaryKey
    private int id;
    private String name;
    private String description;
    private List<Course> courseList;

    public Program() {
    }

    public Program(int id, String name, String description, List<Course> courseList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.courseList = courseList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
