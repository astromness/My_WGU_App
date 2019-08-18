package Models;

import Utilities.Financial_Status;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Entity(tableName = "students")
public class Student extends Person {
    private Financial_Status status;
    @PrimaryKey
    private int id;
    @ColumnInfo(name="program")
    private int program_id;

    public Student() {
    }

    public int getProgram_id() {
        return program_id;
    }

    public void setProgram_id(int program_id) {
        this.program_id = program_id;
    }

    public Student(Date created, String first, String last, Date dob, String address, String city, String state, String email, String phone, Financial_Status status, int id, int program_id) {
        super(created, first, last, dob, address, city, state, email, phone);
        this.status = status;
        this.id = id;
        this.program_id = program_id;
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
