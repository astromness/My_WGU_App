package Models;

import Utilities.Course_Status;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.List;

@Entity(tableName = "attempts")
public class Course_Attempt extends Course {
    @PrimaryKey(autoGenerate = true)
    private int attempt_id;

    private int student_id;
    private Date end;
    private Date start;
    private Course_Status status = Course_Status.Planned;
    private String note;

    public Course_Attempt(String id, int credit_units, String name, Assessment assess, List<Mentor> mentors, int attempt_id, int student_id, Date end, Date start, Course_Status status, String note) {
        super(id, credit_units, name, assess, mentors);
        this.attempt_id = attempt_id;
        this.student_id = student_id;
        this.end = end;
        this.start = start;
        this.status = status;
        this.note = note;
    }

    public Course_Attempt(@NotNull Course myCourse,int student_id, int attempt_id, Date end, Date start, String note) {
        super(myCourse.getId(),myCourse.getCredit_units(),myCourse.getName(),myCourse.getAssess(),myCourse.getMentors());
        this.attempt_id = attempt_id;
        this.student_id = student_id;
        this.end = end;
        this.start = start;
        this.note = note;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Course_Attempt() {
    }

    public int getAttemptId() {
        return attempt_id;
    }

    public void setAttempt_id(int id) {
        this.attempt_id = id;
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
}
