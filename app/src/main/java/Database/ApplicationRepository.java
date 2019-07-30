package Database;

import android.content.Context;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ApplicationRepository {
    private static ApplicationRepository ourInstance;

    private ApplicationDatabase mDb;
    private Executor executor = Executors.newSingleThreadExecutor();

    public static ApplicationRepository getInstance(Context context) {
        if (ourInstance == null) {
            ourInstance = new ApplicationRepository(context);
        }
        return ourInstance;
    }

    private ApplicationRepository(Context context) {
        mDb = ApplicationDatabase.getInstance(context);
    }
}
