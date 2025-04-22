package com.example.gato;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
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

    boolean playerOne;

    Grid3x3 grid;

    Brain brain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        grid = new Grid3x3();
        grid.initGrid();

        brain = new Brain();

        img1 = findViewById(R.id.img1);
        img1.setOnClickListener(v -> {
            img1.setImageResource(brain.getIcon(playerOne));
            grid.board[0][0] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img1.setClickable(false);
        });

        img2 = findViewById(R.id.img2);
        img2.setOnClickListener(v -> {
            img2.setImageResource(brain.getIcon(playerOne));
            grid.board[0][1] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img2.setClickable(false);
        });

        img3 = findViewById(R.id.img3);
        img3.setOnClickListener(v -> {
            img3.setImageResource(brain.getIcon(playerOne));
            grid.board[0][2] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img3.setClickable(false);
        });

        img4 = findViewById(R.id.img4);
        img4.setOnClickListener(v -> {
            img4.setImageResource(brain.getIcon(playerOne));
            grid.board[1][0] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img4.setClickable(false);
        });

        img5 = findViewById(R.id.img5);
        img5.setOnClickListener(v -> {
            img5.setImageResource(brain.getIcon(playerOne));
            grid.board[1][1] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img5.setClickable(false);
        });

        img6 = findViewById(R.id.img6);
        img6.setOnClickListener(v -> {
            img6.setImageResource(brain.getIcon(playerOne));
            grid.board[1][2] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img6.setClickable(false);
        });

        img7 = findViewById(R.id.img7);
        img7.setOnClickListener(v -> {
            img7.setImageResource(brain.getIcon(playerOne));
            grid.board[2][0] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img7.setClickable(false);
        });

        img8 = findViewById(R.id.img8);
        img8.setOnClickListener(v -> {
            img8.setImageResource(brain.getIcon(playerOne));
            grid.board[2][1] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img8.setClickable(false);
        });

        img9 = findViewById(R.id.img9);
        img9.setOnClickListener(v -> {
            img9.setImageResource(brain.getIcon(playerOne));
            grid.board[2][2] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img9.setClickable(false);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

}