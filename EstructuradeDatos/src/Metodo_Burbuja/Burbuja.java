package Metodo_Burbuja;

import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a ordenar: ");

        int n = Teclado.nextInt();
        int arreglo[] = new int[n];
        int aux;

        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el número " + "(" + (i + 1) + ")" + ": ");
            arreglo[i] = Teclado.nextInt();

        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }

            }
        }
        //mostrar datos ordenados
        System.out.println("Arreglo ordenado:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");

        }
    }

}
