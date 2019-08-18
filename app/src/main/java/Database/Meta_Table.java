package Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "meta_data")
public class Meta_Table {
    @PrimaryKey
    private String meta_name;
    private String meta_value;

    public String getMeta_name() {
        return meta_name;
    }

    public void setMeta_name(String meta_name) {
        this.meta_name = meta_name;
    }

    public String getMeta_value() {
        return meta_value;
    }

    public void setMeta_value(String meta_value) {
        this.meta_value = meta_value;
    }

    public Meta_Table() {
    }

    public Meta_Table( String meta_name, String meta_value) {
        this.meta_name = meta_name;
        this.meta_value = meta_value;
    }
}
