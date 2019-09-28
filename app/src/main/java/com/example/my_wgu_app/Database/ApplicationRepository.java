package com.example.my_wgu_app.Database;

import android.content.Context;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ApplicationRepository {
    private static ApplicationRepository ourInstance;

    private ApplicationDatabase mDb;
    private Executor executor = Executors.newSingleThreadExecutor();
//    live data definitions here.....

    public static ApplicationRepository getInstance(Context context) {
        if (ourInstance == null) {
            ourInstance = new ApplicationRepository(context);
        }
        return ourInstance;
    }

    private ApplicationRepository(Context context) {
        mDb = ApplicationDatabase.getInstance(context);
    }

    public Meta_Table get_meta(String meta_id) {
        return mDb.MetaDAO().getMetaData(meta_id);
    }

    public void save_meta(final Meta_Table meta) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                mDb.MetaDAO().insertMetaData(meta);
            }
        });
    }


}
