/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pro3;

/**
 *
 * @author river
 */
public class Pro3 {

    public static void main(String[] args) {
       
 int M = 6, T = 1, K = -10;

        // Mostrar valores iniciales
        System.out.println("Valores iniciales:");
        System.out.println("M = " + M);
        System.out.println("T = " + T);
        System.out.println("K = " + K);

        // Evaluar y mostrar resultados
        System.out.println("\nResultados de las expresiones:");
        System.out.println("1. M > T: " + evaluarMayorQue(M, T));
        System.out.println("2. T / K == -5: " + evaluarDivisionIgual(M, T, K));
        System.out.println("3. (M + T == 7) || (M - T == 5): " + evaluarCondicionCompuesta(M, T));
    }

    // Método para evaluar M > T
    public static boolean evaluarMayorQue(int M, int T) {
        return M > T;
    }

    // Método para evaluar T / K == -5
    public static boolean evaluarDivisionIgual(int M, int T, int K) {
        if (K == 0) {
            System.out.println("Error: División entre cero no permitida.");
            return false; // Devuelve falso si el divisor es 0
        }
        return T / K == -5;
    }

    // Método para evaluar (M + T == 7) || (M - T == 5)
    public static boolean evaluarCondicionCompuesta(int M, int T) {
        return (M + T == 7) || (M - T == 5);
    }
}