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
public class Ejercicio3 {
    
    public static void main(String[] args){
    
        Scanner entry = new Scanner(System.in);
        
        int par = 0, impar = 0;
        
        for(int i = 0; i <= 4; i++){
        
            System.out.println("Número " + Integer.toString(i + 1) + ":");
            
            if((entry.nextInt() % 2) == 0){
                
                par++;
            }else{
                
                impar++;
            }
            
        }
        
        System.out.println("-------------");
        System.out.println("Cantidad de números pares: " + Integer.toString(par));
        System.out.println("Cantidad de números impares: " + Integer.toString(impar));
        
    }
    
}
