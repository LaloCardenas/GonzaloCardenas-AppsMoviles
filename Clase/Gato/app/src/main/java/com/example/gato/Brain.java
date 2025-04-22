package com.example.gato;

import android.content.Context;
import android.widget.Toast;

public class Brain {

    void imprimeGanador(char player, Context context) {
        Toast.makeText(context, "El ganador es: " + player, Toast.LENGTH_LONG).show();
    }

    int getIcon(boolean playerOne) {
        return (playerOne) ? R.drawable.baseline_clear_24: R.drawable.baseline_circle_24;
    }

    char getChar(boolean playerOne) {
        return (playerOne) ? 'x' : 'o';
    }

}
