package com.example.gato;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Conecta4Activity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    ImageView img10;
    ImageView img11;
    ImageView img12;
    ImageView img13;
    ImageView img14;
    ImageView img15;
    ImageView img16;

    boolean playerOne;

    Grid4x4 grid;

    Brain brain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_conecta4);

        grid = new Grid4x4();
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
            grid.board[0][3] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img4.setClickable(false);
        });

        img5 = findViewById(R.id.img5);
        img5.setOnClickListener(v -> {
            img5.setImageResource(brain.getIcon(playerOne));
            grid.board[1][0] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img5.setClickable(false);
        });

        img6 = findViewById(R.id.img6);
        img6.setOnClickListener(v -> {
            img6.setImageResource(brain.getIcon(playerOne));
            grid.board[1][1] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img6.setClickable(false);
        });

        img7 = findViewById(R.id.img7);
        img7.setOnClickListener(v -> {
            img7.setImageResource(brain.getIcon(playerOne));
            grid.board[1][2] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img7.setClickable(false);
        });

        img8 = findViewById(R.id.img8);
        img8.setOnClickListener(v -> {
            img8.setImageResource(brain.getIcon(playerOne));
            grid.board[1][3] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img8.setClickable(false);
        });

        img9 = findViewById(R.id.img9);
        img9.setOnClickListener(v -> {
            img9.setImageResource(brain.getIcon(playerOne));
            grid.board[2][0] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img9.setClickable(false);
        });

        img10 = findViewById(R.id.img10);
        img10.setOnClickListener(v -> {
            img10.setImageResource(brain.getIcon(playerOne));
            grid.board[2][1] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img10.setClickable(false);
        });

        img11 = findViewById(R.id.img11);
        img11.setOnClickListener(v -> {
            img11.setImageResource(brain.getIcon(playerOne));
            grid.board[2][2] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img11.setClickable(false);
        });

        img12 = findViewById(R.id.img12);
        img12.setOnClickListener(v -> {
            img12.setImageResource(brain.getIcon(playerOne));
            grid.board[2][3] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img12.setClickable(false);
        });

        img13 = findViewById(R.id.img13);
        img13.setOnClickListener(v -> {
            img13.setImageResource(brain.getIcon(playerOne));
            grid.board[3][0] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img13.setClickable(false);
        });

        img14 = findViewById(R.id.img14);
        img14.setOnClickListener(v -> {
            img14.setImageResource(brain.getIcon(playerOne));
            grid.board[3][1] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img14.setClickable(false);
        });

        img15 = findViewById(R.id.img15);
        img15.setOnClickListener(v -> {
            img15.setImageResource(brain.getIcon(playerOne));
            grid.board[3][2] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img15.setClickable(false);
        });

        img16 = findViewById(R.id.img16);
        img16.setOnClickListener(v -> {
            img16.setImageResource(brain.getIcon(playerOne));
            grid.board[3][3] = brain.getChar(playerOne);
            if (grid.verifyWinner(brain.getChar(playerOne))) {
                brain.imprimeGanador(brain.getChar(playerOne), this);
            };
            playerOne = !playerOne;
            img16.setClickable(false);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}