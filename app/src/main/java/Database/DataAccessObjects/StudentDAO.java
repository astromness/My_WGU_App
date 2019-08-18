package Database.DataAccessObjects;

import Models.Course;
import Models.Student;
import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDAO {
    @Query("select * from students where id = :id ")
    Student getStudentById(int id);
}
