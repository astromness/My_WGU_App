package Models;

import Utilities.Financial_Status;

import java.util.Date;

public class Mentor extends Person {
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