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
public class SumaProductoNumeros {
    
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma, producto;
        System.out.print("Ingrese primer valor:");
        num1 = teclado.nextInt();
        System.out.print("Ingrese segundo valor");
        num2 = teclado.nextInt();
        suma = num1 + num2;
        producto = num1 * num2;
        System.out.print("La suma de los dos valores es:");
        System.out.println(suma);
        System.out.print("El producto de los dos valores es:");
        System.out.println(producto);
        
    }
}
