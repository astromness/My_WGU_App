package com.example.my_wgu_app.Database;

import com.example.my_wgu_app.Database.DataAccessObjects.*;
import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class ApplicationDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "AppDatabase.db";
    private static volatile ApplicationDatabase instance;
    private static final Object LOCK = new Object();

    public abstract MetaDAO MetaDAO();
    public abstract AssessmentDAO AssementDAO();
    public abstract CourseAttemptDAO CourseAttemptDAO();
    public abstract CourseDAO CourseDAO();
    public abstract MentorDAO MentorDAO();
    public abstract ProgramDAO ProgramDAO();
    public abstract StudentDAO StudentDAO();
    public abstract TermDAO TermDAO();
    public abstract Assessment_AttemptDAO AssessmentAttemptDAO();

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
