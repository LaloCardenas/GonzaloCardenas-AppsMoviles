package com.example.basededatos;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    interface OnUserDBSave{
        void onSavedUser(User user);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initDB( user -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                getMainExecutor().execute(() -> Toast
                        .makeText(MainActivity.this, user.firstName, Toast.LENGTH_LONG).show());
            }

        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void initDB(OnUserDBSave onUserDBSave) {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                        AppDatabase.class, "database-name").build();

                UserDao userDao = db.userDao();
                User user1 = new User();
                user1.uid = new Random().nextInt();
                user1.firstName = "Pancho";
                user1.lastName = "Ramones";
                userDao.insertAll(user1);

                List<User> lista =  userDao.getAll();
                onUserDBSave.onSavedUser(lista.get(0));
            }
        });
    }
}