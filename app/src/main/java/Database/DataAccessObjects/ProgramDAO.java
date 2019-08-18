package Database.DataAccessObjects;

import Models.Program;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface ProgramDAO {

    @Query("Select * from programs where id = :id")
    Program getProgramById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertProgram(Program mentor);

}
