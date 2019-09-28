package com.example.my_wgu_app.Database.DataAccessObjects;

import com.example.my_wgu_app.Models.Term;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TermDAO {

    @Query("Select * from terms where term_number = :term and student_id = :student_id")
    Term getTermByStudentTerm(int term,int student_id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTerm(Term term);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Term> terms);
}
