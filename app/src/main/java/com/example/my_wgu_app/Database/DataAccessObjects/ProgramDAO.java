package com.example.my_wgu_app.Database.DataAccessObjects;

import com.example.my_wgu_app.Models.Program;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProgramDAO {

    @Query("Select * from programs where id = :id")
    Program getProgramById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertProgram(Program program);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Program> programs);

}
