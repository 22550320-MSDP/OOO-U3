/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_unchecked_exception;

import java.util.Scanner;

/**
 *
 * @author Danna Paola Maldonado Sepúlveda
 */
public class EVA3_1_UNCHECKED_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exception aritmetica
        // division entre 0
        /*System.out.println("INICIANDO EL PROGRAMA");
        int x = 5, y=0;
        System.out.println("INICIALIZANDO LAS VARIABLES");
        int r = x/y;
        System.out.println("CALCULANDO LA DIVISON");
        System.out.println("Division =" + r);*/
        
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO");
        int NUM = input.nextInt();
        System.out.println("tu numero es" + NUM);
        
         //INPUT MISMATCH EXCEPTION (ERROR DE CAPTURA)
   
   System.out.println("Introduzca un número:");
     int num = input.nextInt();
   
   
   
   //INDEX-OUT-OF-BONDS EXCEPTION
   int[] arreglo = new int [5]; //0 - (N-1)
      arreglo[0] = 100;
      arreglo[1] = 200;
      arreglo[2] = 300;
      arreglo[3] = 400;
      arreglo[4] = 500;
      arreglo[5] = 600; //Error de lógica.
     
   
   //NULL-POINTER EXCEPTION
      Prueba objP= null;
        System.out.println("Valor de x: " +objP.x); 
    }
    
}
