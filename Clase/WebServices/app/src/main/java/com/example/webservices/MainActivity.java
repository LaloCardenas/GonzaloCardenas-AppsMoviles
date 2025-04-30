package com.example.webservices;

import android.os.Bundle;
import android.os.StrictMode;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView txvContacts;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("http://ccardoso.multics.org")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();

        txvContacts = findViewById(R.id.txvContacts);
        imagen = findViewById(R.id.imagen);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        ContactService service  = retrofit.create(ContactService.class);

        Call<List<Contact>> contactList = service.listContacts();
        try {
            Response<List<Contact>> response =  contactList.execute();
            List<Contact> contacts = response.body();
            assert contacts != null;
            txvContacts.setText(contacts.toString());
            //Glide.with(this).load(contacts.get(0).imagenUrl).into(imagen);
            Picasso.get().load(contacts.get(0).imagenUrl).into(imagen);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}