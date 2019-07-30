package Models;

import androidx.room.ColumnInfo;

import java.util.Date;

public class Person {
    private Date created;
    @ColumnInfo(name="first_name")
    private String first;
    @ColumnInfo(name="last_name")
    private String last;
    @ColumnInfo(name = "date_of_birth")
    private Date dob;
    private String address;
    private String city;
    private String state;
    private String email;
    private String phone;

    public Person(Date created, String first, String last, Date dob, String address, String city, String state, String email, String phone) {
        this.created = created;
        this.first = first;
        this.last = last;
        this.dob = dob;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phone = phone;
    }

    public Person() {
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String get_name() {
        return this.first+" "+this.last;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
