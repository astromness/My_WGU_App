package Database.DataAccessObjects;

import Database.Meta_Table;
import androidx.room.*;

@Dao
public interface MetaDAO {
    @Query("select * from meta_data where meta_name = :meta_id")
    Meta_Table getMetaData(String meta_id);

    @Query("select meta_value from meta_data where meta_name = :meta_id")
    String getMetaValue(String meta_id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMetaData(Meta_Table mt);

    @Delete
    void deleteMetaData(Meta_Table mt);
}
