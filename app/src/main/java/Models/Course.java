package Models;

import Utilities.Course_Status;

import java.util.Date;
import java.util.List;

public class Course {
    private String id;
    private int credit_units;
    private String name;
    private Assessment assess;
    private Course_Status status;
    private String note;
    private List<Mentor> mentors;
    private Date end;
    private Date start;

}
