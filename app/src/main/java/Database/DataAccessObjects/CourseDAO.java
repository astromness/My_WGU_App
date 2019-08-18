package Database.DataAccessObjects;

import Models.Course;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CourseDAO {

    @Query("Select * from courses where id = :id")
    Course getCourseById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCourse(Course course);

    @Query("select id from courses where id not in (select id from attempts where student_id = ':student_id' and status = 'Passed')")
    List<String> getRemainingCoursesBySutdentId(String student_id);

}
