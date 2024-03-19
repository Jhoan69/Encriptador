package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramaManejoNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int l = a.length;

        System.out.println("ingrese un numero");
        for (int i = 0; i < l; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }

        for (int i = 0; i<l/2; i++){
            int aux = i;
            a[i+1] = a[(l-1)-i];
            a[i+1] = aux;

        }

        /*for (int i = 0; i <= 4; i++) {
            System.out.println(a[9 - i]); // y el i-ésimo por el final
            System.out.println(a[i]); // mostramos el i-ésimo número por el principio
        }

        for (int n = 0; n<l; n++){
            System.out.println("numeros "+n+" = " + a[n]);
        }*/

        for (int n = 0; n<l; n++) {
            System.out.println("numeros " + n + " = " + a[n]);
        }
    }
}

