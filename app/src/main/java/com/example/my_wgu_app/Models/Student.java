package com.example.my_wgu_app.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Entity(tableName = "students")
public class Student extends Person {
    private String status;
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name="program")
    private Program program;
    private List<Term> terms;

    public Student() {
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Student(Date created, String first, String last, Date dob, String address, String city, String state, String phone, String status, int id, Program program, List<Term> terms) {
        super(created, first, last, dob, address, city, state, phone);
        this.status = status;
        this.id = id;
        this.program = program;
        this.terms = terms;
    }

    public List<Term> getTerms() {
        return terms;
    }

    public void setTerms(List<Term> terms) {
        this.terms = terms;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStudentId() {
        return  String.format(Locale.getDefault(),"S%tm%ty%08d",this.getDob(),this.getCreated(),this.id);
    }

    public void setId(int id) {
        this.id = id;
    }


    public static void main(String[] args) {
        Student stu = new Student();
        String dateToParse= "22/12/1991";
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        stu.setCreated(new Date());

        try {
            stu.setDob(formatter.parse(dateToParse));
        }
        catch (ParseException e){
            System.out.println(e);
        }
        stu.setId(506480);


        System.out.println(stu.getStudentId());
        stu.setId(506480000);
        System.out.println(stu.getStudentId());


    }
}
