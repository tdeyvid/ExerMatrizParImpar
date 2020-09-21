/*
 Capture do teclado valores para preenchimento de uma matriz M 3x3. 
Após a captura imprima a matriz criada e encontre a quantidade de números pares, 
a quantidade de números ímpares.
 */
package exermatrizparimpar;

import java.util.Random;
import java.util.Scanner;

public class ExerMatrizParImpar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Entre com posição [" + i + "," + j + "] ");
                numeros[i][j] = teclado.nextInt();
            }
        }
        int qtdPar = 0;
        int qtdImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] % 2 == 0) {
                    qtdPar++;
                } else {
                    qtdImpar++;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidades de pares: " + qtdPar);
        System.out.println("Quantidades de impares: " + qtdImpar);

    }

}
