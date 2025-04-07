package com.example.a24032025;

import static android.view.ViewGroup.LayoutParams.FILL_PARENT;
import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnAgrega;
    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root = findViewById(R.id.lytMain);
        btnAgrega = findViewById(R.id.btnAgrega);
        btnAgrega.setOnClickListener(v -> {
            generaImagen();
        });
    }

    void generaImagen() {
        // Aqui se genera el inflado de vista
        LinearLayout lytItemPrueba = (LinearLayout) LinearLayout.inflate(this, R.layout.item_prueba, null);
        ImageView img = new ImageView(this);

        // Aqui se genera la imagen
        img.setImageResource(R.mipmap.ic_launcher);
        img.setScaleType(ImageView.ScaleType.FIT_XY);
        img.setMinimumHeight(100);
        img.setMinimumWidth(MATCH_PARENT);

        // Aqui se agrega la imagen al layout inflado
        lytItemPrueba.setGravity(Gravity.CENTER);
        lytItemPrueba.addView(img);

        // Aqui se agrega el layout inflado a la vista root
        root.addView(lytItemPrueba);
        lytItemPrueba.setMinimumWidth(MATCH_PARENT);
        lytItemPrueba.setBackgroundColor(getResources().getColor(R.color.black, getTheme()));
    }
}