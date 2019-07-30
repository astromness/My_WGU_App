package Database.DataAccessObjects;

import Models.Assessment;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface AssessmentDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long insertAssessment(Assessment assess);

    @Query("select * from assessments where id = :id")
    Assessment getAssessmentById(int id);

    
}
