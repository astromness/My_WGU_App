package Models;

import Utilities.Financial_Status;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "students")
public class Student extends Person {
    private Financial_Status status;
    @PrimaryKey
    private int id;

    public Student() {
    }

    public Student(Date created, String first, String last, Date dob, String address, String city, String state, String email, String phone, Financial_Status status, int id) {
        super(created, first, last, dob, address, city, state, email, phone);
        this.status = status;
        this.id = id;
    }

    public Financial_Status getStatus() {
        return status;
    }

    public void setStatus(Financial_Status status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStudentId() {
        return "=SMMYYF{00000000,id}";
    }

    public void setId(int id) {
        this.id = id;
    }


}
