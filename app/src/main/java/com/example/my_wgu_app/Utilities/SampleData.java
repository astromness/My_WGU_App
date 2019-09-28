package com.example.my_wgu_app.Utilities;

import com.example.my_wgu_app.Models.*;

import java.util.ArrayList;
import java.util.List;

public class SampleData {
    private String setup_tag="setup_data";
    private Program software_development = new Program();
//    private Program clown_school = new Program();
//    private Program biology = new Program();
    private List<Course> it_courses = new ArrayList<>();
    private List<Mentor> it_mentors = new ArrayList<>();
//    private List<Course> cs_courses = new ArrayList<>();
//    private List<Mentor> cs_mentors = new ArrayList<>();
//    private List<Course> b_courses = new ArrayList<>();
//    private List<Mentor> b_mentors = new ArrayList<>();
    private List<Course> generals = new ArrayList<>();
    private List<Mentor> gen_mentors = new ArrayList<>();
    private Utilities u = new Utilities();

    Student s1 = new Student();
//    Student s2 = new Student();
//    Student s3 = new Student();

    public SampleData() {
    }

    private List<Student> get_students() {
        List<Student> students = new ArrayList<>();

        s1.setId(1);
        s1.setProgram(software_development);
        s1.setCreated(u.string_to_Date("03/15/2016"));
        s1.setDob(u.string_to_Date("12/22/1991"));
        s1.setAddress("13127 S That Place");
        s1.setCity("Clinton");
        s1.setState("UT");
        s1.setPhone("801-870-1513");
        s1.setFirst("Austin");
        s1.setLast("Stromness");
        s1.setStatus("Good");

        students.add(s1);
        return students;
    }

    private List<Term> get_terms() {
        List<Term> terms= new ArrayList<>();
        List<Course> term_courses = new ArrayList<>();
        List<Course_Attempt> term_course_attempts = new ArrayList<>();
        List<Assessment_Attempt> assessments = new ArrayList<>();

        term_courses.add(it_courses.get(0));
        term_courses.add(it_courses.get(1));
        term_courses.add(it_courses.get(2));
        term_courses.add(it_courses.get(3));

        assessments.add(new Assessment_Attempt(1,"Pass",82,it_courses.get(0).getAssess(),s1,u.string_to_Date("04/20/2016")));
        term_course_attempts.add(new Course_Attempt(s1,it_courses.get(0),u.string_to_Date("04/25/2016"),u.string_to_Date("04/01/2016"),"The First Course I attempted at WGU",assessments));
        assessments.clear();
        assessments.add(new Assessment_Attempt(1,"Pass",80,it_courses.get(1).getAssess(),s1,u.string_to_Date("05/23/2016")));
        term_course_attempts.add(new Course_Attempt(s1,it_courses.get(1),u.string_to_Date("05/30/2016"),u.string_to_Date("04/25/2016"),null,assessments));
        assessments.clear();
        assessments.add(new Assessment_Attempt(1,"Pass",89,it_courses.get(2).getAssess(),s1,u.string_to_Date("07/10/2016")));
        term_course_attempts.add(new Course_Attempt(s1,it_courses.get(2),u.string_to_Date("07/11/2016"),u.string_to_Date("05/30/2016"),null,assessments));
        assessments.clear();
        assessments.add(new Assessment_Attempt(1,"Pass",85,it_courses.get(3).getAssess(),s1,u.string_to_Date("09/01/2016")));
        term_course_attempts.add(new Course_Attempt(s1,it_courses.get(3),u.string_to_Date("09/05/2016"),u.string_to_Date("07/11/2016"),null,assessments));

        terms.add(new Term(1,s1,null,term_courses,term_course_attempts));

        term_courses.add(it_courses.get(4));
        term_courses.add(it_courses.get(5));
        term_courses.add(it_courses.get(6));
        term_courses.add(it_courses.get(7));

        assessments.add(new Assessment_Attempt(1,"Fail",60,it_courses.get(4).getAssess(),s1,u.string_to_Date("10/20/2016")));
        assessments.add(new Assessment_Attempt(2,"Pass",80,it_courses.get(4).getAssess(),s1,null));
        term_course_attempts.add(new Course_Attempt(s1,it_courses.get(4),u.string_to_Date("10/25/2016"),u.string_to_Date("10/01/2016"),"The First Course I attempted at WGU",assessments));
        assessments.clear();
        assessments.add(new Assessment_Attempt(1,"Pass",80,it_courses.get(5).getAssess(),s1,u.string_to_Date("11/23/2016")));
        term_course_attempts.add(new Course_Attempt(s1,it_courses.get(5),u.string_to_Date("11/30/2016"),u.string_to_Date("11/25/2016"),null,assessments));
        assessments.clear();
        assessments.add(new Assessment_Attempt(1,"Pass",89,it_courses.get(6).getAssess(),s1,u.string_to_Date("01/10/2017")));
        term_course_attempts.add(new Course_Attempt(s1,it_courses.get(6),u.string_to_Date("01/11/2017"),u.string_to_Date("11/30/2016"),null,assessments));
        assessments.clear();
        assessments.add(new Assessment_Attempt(1,"Pass",85,it_courses.get(7).getAssess(),s1,u.string_to_Date("03/01/2017")));
        term_course_attempts.add(new Course_Attempt(s1,it_courses.get(7),u.string_to_Date("03/05/2016"),u.string_to_Date("01/11/2016"),null,assessments));

        terms.add(new Term(2,s1,"My Second Term",term_courses,term_course_attempts));

        return terms;
    }

    private List<Program> get_programs() {
        List<Program> programs = new ArrayList<>();

        software_development.setName("Software Development");
        software_development.setDescription("Learn the skills to program valuable and quality software ");

//       Just some generals that i took at Weber before I went to WGU
        generals.add(new Course("MA-101", 3, "Algebra", new Assessment("Algebra", 90, "Objective"), it_mentors));
        generals.add(new Course("MA-105", 3, "Trigonometry", new Assessment("Trigonometry", 90, "Objective"), it_mentors));
        generals.add(new Course("MA-201", 4, "Calculus", new Assessment("Calculus", 90, "Objective"), it_mentors));
        generals.add(new Course("EN-101", 3, "Intro to English ", new Assessment( "English 101", 90, "Performance"), it_mentors));
        generals.add(new Course("EN-201", 4, "College English", new Assessment("College English", 90, "Performance"), it_mentors));
        generals.add(new Course("CO-101", 3, "Intro to Communications", new Assessment("Communications 101", 90, "Performance"), it_mentors));

        it_courses.add(new Course("SD-101", 3, "Intro to Computer Science", new Assessment( "Computer Science", 90, "Objective"), it_mentors));
        it_courses.add(new Course("SD-102", 3, "Java Programming", new Assessment( "Java Programming", 90, "Performance"), it_mentors));
        it_courses.add(new Course("SD-103", 3, "Intro to Web Development", new Assessment( "Web Development", 90, "Objective"), it_mentors));
        it_courses.add(new Course("SD-104", 3, "C++ Programming", new Assessment( "C++ Programming", 90, "Objective"), it_mentors));
        it_courses.add(new Course("SD-201", 3, "Data Structures and Algorithms", new Assessment( "Data Structures", 90, "Objective"), it_mentors));
        it_courses.add(new Course("SD-202", 3, "Software Development", new Assessment( "Software Development", 90, "Performance"), it_mentors));
        it_courses.add(new Course("SD-203", 3, "Computational Structures", new Assessment( "Computational Structures", 90, "Objective"), it_mentors));
        it_courses.add(new Course("SD-204", 3, "Mobile Development", new Assessment( "Mobile Development", 90, "Performance"), it_mentors));
        it_courses.add(new Course("SD-205", 3, "Server Client Development", new Assessment( "Server Client Development", 90, "Objective"), it_mentors));
        it_courses.add(new Course("SD-206", 3, "Capstone", new Assessment( "Capstone", 90, "Performance"), it_mentors));

        it_courses.addAll(generals);

        software_development.setCourseList(it_courses);

        programs.add(software_development);
//        programs.add(clown_school);

        return programs;
    }

    private List<Mentor> get_mentors() {

        it_mentors.add(new Mentor(u.string_to_Date("01/01/2017"), "Tim", "Lee", u.string_to_Date("06/08/1955"), "5086 Education Way", "That One Place", "UT", "8019480001",1));
        it_mentors.add(new Mentor(u.string_to_Date("01/01/2017"), "Steve", "Woz", u.string_to_Date("08/11/1950"), "5087 Education Way", "Here", "UT", "8019480002",2));

        gen_mentors.add(new Mentor(u.string_to_Date("01/01/2017"), "Johnny", "Test", u.string_to_Date("18/09/1964"), "123 University Way", "Helper", "UT", "8019480003",3));

        List<Mentor> mentors = new ArrayList<>();
        mentors.addAll(it_mentors);
        mentors.addAll(gen_mentors);

        return mentors;


    }

}
