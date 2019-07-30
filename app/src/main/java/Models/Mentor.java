package Models;

import Utilities.Financial_Status;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "mentors")
public class Mentor extends Person {
    @PrimaryKey
    private int id;

    public Mentor(Date created, String first, String last, Date dob, String address, String city, String state, String email, String phone, int id) {
        super(created, first, last, dob, address, city, state, email, phone);
        this.id = id;
    }

    public Mentor() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String get_student_id() {
        return "MMMYYF{00000000,id}";
    }
}
