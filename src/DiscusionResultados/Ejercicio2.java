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
public class Ejercicio2 {
    
    public static void main(String[] args){
    
        Scanner entry = new Scanner(System.in);
        
        int aproved = 0, failed = 0;
        
        for(int i = 0; i <= 9; i++){
        
            System.out.println("Nota " + Integer.toString(i + 1) + ":");
            
            if(entry.nextInt() >= 7){
                
                aproved++;
            }else{
                
                failed++;
            }
            
        }
        
        System.out.println("-------------");
        System.out.println("Notas mayores o iguales a 7: " + Integer.toString(aproved));
        System.out.println("Notas menores a 7: " + Integer.toString(failed));

    
    }
    
}
