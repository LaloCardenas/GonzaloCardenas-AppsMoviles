package com.example.contactosapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    Contact contact;
    TextView txvName;
    TextView txvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        txvName = findViewById(R.id.txvName);
        txvPhone = findViewById(R.id.txvPhone);

        String phoneNumber = getIntent().getStringExtra(BundleConstants.CONTACT_PHONE);

        if (phoneNumber != null) {
            ContactStore contactStore = new ContactStore();
            contact = contactStore.findContactByPhone(phoneNumber);

            txvPhone.setText(contact.getPhone());
            txvName.setText(contact.getName());
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}