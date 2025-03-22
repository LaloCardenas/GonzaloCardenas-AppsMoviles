package com.example.gato;

import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<Integer> xCords = new ArrayList<Integer>();
    ArrayList<Integer> yCords = new ArrayList<Integer>();

    public Player(String name) {
        this.name = name;
    }
}
