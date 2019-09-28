package com.example.my_wgu_app.Database.DataAccessObjects;

import com.example.my_wgu_app.Models.Assessment;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AssessmentDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long insertAssessment(Assessment assess);

    @Query("select * from assessments where id = :id")
    Assessment getAssessmentById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Assessment> assessments);

}
