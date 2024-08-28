

package com.mycompany.matrizrandom;


public class MatrizRandom {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
        int size = 100;
     
        int [][] matriz = new int [size][size];
        
        for (int i = 0; i <matriz.length; i++) {
            
            for (int j = 0; j <matriz.length; j++) {
       
                matriz [i][j] = (int) (Math.random()*10);
                System.out.print("| " +matriz[i][j] );
            }
             System.out.println(" ");
        }
        
        long endTime = System.nanoTime() - startTime;
        System.out.println("El tiempo en nanosegundos es: " + endTime);
    }
}
