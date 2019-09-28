package com.example.my_wgu_app.Database.DataAccessObjects;

import com.example.my_wgu_app.Models.Student;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDAO {
    @Query("select * from students where id = :id ")
    Student getStudentById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Student student);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Student> students);
}
