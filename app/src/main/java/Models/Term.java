package Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

import java.util.List;

@Entity(tableName = "Terms")
public class Term {

    private int id;
    @ColumnInfo(name = "student")
    private int student_id;
    private int term_number;
    private char status;
    private List<Course> planned_courses;
    private List<Course_Attempt> courses;

}
