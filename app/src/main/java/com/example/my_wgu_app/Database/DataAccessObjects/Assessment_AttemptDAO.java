package com.example.my_wgu_app.Database.DataAccessObjects;

import com.example.my_wgu_app.Models.Assessment_Attempt;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Assessment_AttemptDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAssessmentAttempt(Assessment_Attempt assess);

    @Query("select * from assessment_attempts where student_id = :student_id and assessment_id = ':assessment_id' and attempt_number = :attempt")
    Assessment_Attempt getAssessmentAttempt(int student_id, int assessment_id, int attempt);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Assessment_Attempt> attempts);
}
