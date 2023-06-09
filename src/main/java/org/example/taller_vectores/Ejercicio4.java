package org.example.taller_vectores;

import java.util.Scanner;

//Pedir por teclado el tamaño de un arreglo de números y pedir
// los valores numéricos con los que se rellena. Los valores no se
// pueden repetir, por lo tanto, deberá de encargarse de buscar
// cada número que lea y verificar que no se haya leído antes.
// Mostrar el arreglo con los valores al final.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();
        int[] arreglo = new int[tamano];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
                arreglo[i] = scanner.nextInt();

            for (int j = 0; j<i; j++){
                if( arreglo[i] == arreglo[j]){
                    System.out.println("El número ingresado ya se encuentra registrado: " );
                    i--;
                }
            }
        }
        int a = 0;
        for (int j = 0; j<tamano; j++){
            a = arreglo[j];
            System.out.println("Los numeros del arreglo son: " + a);
        }
    }

}
