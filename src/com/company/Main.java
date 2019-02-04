package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tableLength = 5;
        int[] table = new int[tableLength];
        int[] mirrorTable = new int[tableLength];
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            int generateNumber = random.nextInt(10);
            table[i] = generateNumber;
            mirrorTable[tableLength - 1 - i] = generateNumber;
        }
        System.out.println(Arrays.toString(table));
        System.out.println(Arrays.toString(mirrorTable));
    }
}

