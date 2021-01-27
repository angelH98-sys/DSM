/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia01;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EstructuraRepetitivaFor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int suma, f, valor, promedio;
        suma = 0;
        for (f = 1; f <= 10; f++) {
            System.out.print("Ingrese valor:");
            valor = teclado.nextInt();
            suma = suma + valor;
        }
        System.out.print("La suma es:");
        System.out.println(suma);
        promedio = suma / 10;
        System.out.print("El promedio es:");
        System.out.print(promedio);

    }

}
