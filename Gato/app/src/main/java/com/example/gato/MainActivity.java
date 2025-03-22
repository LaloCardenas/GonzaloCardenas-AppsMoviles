package com.example.gato;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;

    Player player1;
    Player player2;

    boolean playerOne;

    Grid grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        player1 = new Player("Player 1");
        player2 = new Player("Player 2");

        grid = new Grid();
        grid.initGrid();

        img1 = findViewById(R.id.img1);
        img1.setOnClickListener(v -> {
            img1.setImageResource(getIcon());
            grid.board[0][0] = getChar();
            playerOne = !playerOne;
            grid.traverseGrid();
        });

        img2 = findViewById(R.id.img2);
        img2.setOnClickListener(v -> {
            img2.setImageResource(getIcon());
            grid.board[0][1] = getChar();
            playerOne = !playerOne;
        });

        img3 = findViewById(R.id.img3);
        img3.setOnClickListener(v -> {
            img3.setImageResource(getIcon());
            grid.board[0][2] = getChar();
            playerOne = !playerOne;
        });

        img4 = findViewById(R.id.img4);
        img4.setOnClickListener(v -> {
            img4.setImageResource(getIcon());
            grid.board[1][0] = getChar();
            playerOne = !playerOne;
        });

        img5 = findViewById(R.id.img5);
        img5.setOnClickListener(v -> {
            img5.setImageResource(getIcon());
            grid.board[1][1] = getChar();
            playerOne = !playerOne;
        });

        img6 = findViewById(R.id.img6);
        img6.setOnClickListener(v -> {
            img6.setImageResource(getIcon());
            grid.board[1][2] = getChar();
            playerOne = !playerOne;
        });

        img7 = findViewById(R.id.img7);
        img7.setOnClickListener(v -> {
            img7.setImageResource(getIcon());
            grid.board[2][0] = getChar();
            playerOne = !playerOne;
        });

        img8 = findViewById(R.id.img8);
        img8.setOnClickListener(v -> {
            img8.setImageResource(getIcon());
            grid.board[2][1] = getChar();
            playerOne = !playerOne;
        });

        img9 = findViewById(R.id.img9);
        img9.setOnClickListener(v -> {
            img9.setImageResource(getIcon());
            grid.board[2][2] = getChar();
            playerOne = !playerOne;
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    void imprimeGanador() {
        Toast.makeText(this, "El ganador es: ", Toast.LENGTH_LONG).show();
    }

    int getIcon() {
        return (playerOne) ? R.drawable.baseline_clear_24: R.drawable.baseline_circle_24;
    }

    char getChar() {
        return (playerOne) ? 'x' : 'o';
    }

}