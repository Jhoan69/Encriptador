package org.example;

import java.util.Arrays;
import java.util.Objects;

public class ArraysFile {
    public static void main (String[] args){

        String[] productos = {"Camara", "Espejo", "Portatil", "Samsung Edge", "Memoria SSD", "Ryzen 5 4000"};
        Integer[] numeros = {5, 7, 3, 8, 9, 12, 54, 2, 1};
        int total = productos.length;
        int l = numeros.length;
        bubbleSort(productos);
        for(int i = 0; i< total; i++){
            System.out.println("producto  = " + productos[i]);
        }
    }

    public static void bubbleSort(Object[] arreglo){

        int l = arreglo.length;

        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l -1 -i; j++) {
                if ( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
    }
}
