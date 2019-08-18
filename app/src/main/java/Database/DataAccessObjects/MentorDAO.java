package Database.DataAccessObjects;

import Models.Mentor;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MentorDAO {

    @Query("Select * from mentors where id = :id")
    Mentor getMentorById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMentor(Mentor mentor);

}
