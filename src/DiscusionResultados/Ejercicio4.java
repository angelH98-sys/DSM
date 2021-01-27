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
public class Ejercicio4 {
    
    public static void main(String[] args){
    
        Scanner entry = new Scanner(System.in);
        
        System.out.println("Ingresar cantidad de puntos a procesar:");
        
        int points = entry.nextInt();
        int x = 0, y = 0; 
        int quadrant1 = 0, quadrant2 = 0, quadrant3 = 0, quadrant4 = 0, axis = 0;
        
        for(int i = 0; i < points; i++){
            
            System.out.println("---> Punto " + Integer.toString(i + 1));
            System.out.println("Coordenada X: ");
            x = entry.nextInt();
            
            System.out.println("Coordenada Y: ");
            y = entry.nextInt();
            
            if(x == 0){
            
                if(y == 0){
            
                    axis++;
                }else if(y > 0){

                    quadrant1++;
                }else{

                    quadrant4++;
                }
                
            }else if(x > 0){
                
                if(y >= 0){

                    quadrant1++;
                }else{

                    quadrant4++;
                }
            
            }else{
                
                if(y >= 0){

                    quadrant2++;
                }else{

                    quadrant3++;
                }
            
            }
            
        }
        
        System.out.println("-------------------");
        System.out.println("Cantidad de puntos en cuadrante 1: " 
                + Integer.toString(quadrant1));
        System.out.println("Cantidad de puntos en cuadrante 2: " 
                + Integer.toString(quadrant2));
        System.out.println("Cantidad de puntos en cuadrante 3: " 
                + Integer.toString(quadrant3));
        System.out.println("Cantidad de puntos en cuadrante 4: " 
                + Integer.toString(quadrant4));
        System.out.println("Cantidad de puntos en el eje: " 
                + Integer.toString(axis));
        
    }
    
}
