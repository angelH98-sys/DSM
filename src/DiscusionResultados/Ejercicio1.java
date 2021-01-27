/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscusionResultados;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio1 {
    
    public static void main(String[] args){
    
        Scanner entry = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Ingrese un número:");
        num1 = entry.nextInt();
        System.out.println("Ingrese un número:");
        num2 = entry.nextInt();
        
        System.out.println("------------------------");
        
        if((num1 % num2) == 0){
            //Si el primer número es divisible por el segundo
            System.out.print("El número "
                    + Integer.toString(num1)
                    + " es divisible por "
                    + Integer.toString(num2) + "\n");
        
        }else{
            System.out.print("El número "
                        + Integer.toString(num1)
                        + " no es divisible por "
                        + Integer.toString(num2) + "\n");

        }
        
        System.out.println("------------------------");

        if((num2 % num1) == 0){
            //Si el segundo número es divisible por el primero
            System.out.print("El número "
                    + Integer.toString(num2)
                    + " es divisible por "
                    + Integer.toString(num1) + "\n");
        
        }else{
            System.out.print("El número "
                        + Integer.toString(num2)
                        + " no es divisible por "
                        + Integer.toString(num1) + "\n");

        }
        
    }
    
}
