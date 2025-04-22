package com.example.a24032025;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExerciseActivity extends AppCompatActivity {

    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        root = findViewById(R.id.lytMain);
        generateLayout();
        generateLayout();
    }

    void generateLayout() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(
                100,
                50
        );
        params.weight = 0.5f;
        params.gravity = Gravity.CENTER_HORIZONTAL;
        LinearLayout layout = (LinearLayout) LinearLayout.inflate(this, R.layout.item_prueba, null);
        layout.setLayoutParams(params);
        Button btnAdd = new Button(this);
        btnAdd.setLayoutParams(buttonParams);
        btnAdd.setBackgroundColor(getResources().getColor(R.color.black, getTheme()));

        layout.addView(btnAdd);

        root.addView(layout);
    }

}