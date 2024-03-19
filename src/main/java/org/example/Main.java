package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int l = arr.length;

        int[] nuevoArreglo = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // Llenamos el arreglo con números del 1 al 10
        }


        /*Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
        Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
        el segundo, el antepenúltimo, el tercero, y así sucesivamente.*/
        //alterarOrden(arr);

        for (int i = 0; i < l / 2; i++) {
            // Colocamos el último elemento en la posición 0, el primero en la última posición,
            // el penúltimo en la posición 1, el segundo en la penúltima posición, y así sucesivamente
            nuevoArreglo[i * 2] = arr[l - 1 - i];
            nuevoArreglo[(i * 2) + 1] = arr[i];
        }

        for (int i = 0; i < l; i++) {
            System.out.println("numero "+i+" = " + nuevoArreglo[i]);
        }
    }

    public static void alterarOrden(int[] arreglo) {
        int longitud = arreglo.length;
        int[] nuevoArreglo = new int[longitud];

        // Iteramos sobre la mitad del arreglo original
        for (int i = 0; i < longitud / 2; i++) {
            // Colocamos el último elemento en la posición 0, el primero en la última posición,
            // el penúltimo en la posición 1, el segundo en la penúltima posición, y así sucesivamente
            nuevoArreglo[i * 2] = arreglo[longitud - 1 - i];
            nuevoArreglo[(i * 2) + 1] = arreglo[i];
        }

        // Si la longitud del arreglo es impar, colocamos el elemento central en su posición original
        if (longitud % 2 != 0) {
            nuevoArreglo[longitud / 2] = arreglo[longitud / 2];
        }

        // Copiamos los elementos del nuevo arreglo al original
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = nuevoArreglo[i];
        }
    }
}