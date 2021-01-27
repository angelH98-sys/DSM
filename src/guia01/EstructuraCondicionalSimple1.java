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
public class EstructuraCondicionalSimple1 {
    
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        float sueldo;
        System.out.print("Ingrese el sueldo:");
        sueldo = teclado.nextFloat();
        if (sueldo > 3000) {
        System.out.println("Esta persona debe abonar impuestos");
        }
        
    }
    
}
