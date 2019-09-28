package com.example.my_wgu_app.Database.DataAccessObjects;

import com.example.my_wgu_app.Models.Course_Attempt;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CourseAttemptDAO {

    @Query("Select * from attempts where attempt_id = :id")
    Course_Attempt getCourseAttemptById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAttempt(Course_Attempt attempt);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Course_Attempt> course_attempts);

}
