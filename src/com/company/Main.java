package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] table = new int[5];
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(10);
            System.out.println(table[i]);
        }
        for (int j = 0; j < table.length; j++) {
            int mirror = table.length - j - 1;
            System.out.println(table[mirror]);
        }
    }
}
