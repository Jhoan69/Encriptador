package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class OrdenarNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 100; i++) {
            if (i %3 != 0) {
                System.out.println(i);
            }
        }
    }
}


