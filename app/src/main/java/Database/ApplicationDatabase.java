package Database;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class ApplicationDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "AppDatabase.db";
    private static volatile ApplicationDatabase instance;
    private static final Object LOCK = new Object();

    public static ApplicationDatabase getInstance(Context context) {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = Room.databaseBuilder(context.getApplicationContext(),
                            ApplicationDatabase.class, DATABASE_NAME).build();
                }
            }
        }

        return instance;
    }
}
