package com.example.my_wgu_app;

import com.example.my_wgu_app.Database.ApplicationDatabase;
import android.content.Context;
import android.util.Log;
import androidx.room.Room;
import androidx.test.InstrumentationRegistry;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.example.my_wgu_app.Database.DataAccessObjects.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class DatabaseTest {
    public static final String TAG = "Junit";
    private ApplicationDatabase mDb;
    private ProgramDAO programDAO;

    @Before
    public void createDB() {
        Context context = InstrumentationRegistry.getTargetContext();
        mDb = Room.inMemoryDatabaseBuilder(context,ApplicationDatabase.class).build();
//        mDAO = mDb.noteDao();

        Log.i(TAG, "createDB");


    }

    @After
    public void closeDB() {
        mDb.close();
        Log.i(TAG,"closeDB");
    }

    @Test
    public void createAndRetrieveNotes() {
//        mDAO.insertAll(SampleData.getNotes());
//        int count = mDAO.getCount();
//        Log.i(TAG, "createAndRetrieveNotes: count-" + count);
//        assertEquals(SampleData.getNotes().size(),count);


    }
}
