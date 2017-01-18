/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccivector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author usuario
 */
public class FibonacciVector {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    int a;
        do{
        System.out.println("Introduzca el numero de elementos que quiere mostrar de la serie Fibonacci");
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String n = br.readLine(); 
           a = Integer.parseInt(n);
         
                  
         }while (a<=0);
          
           int[] v =new int[a];
       
            v[0]=0;
           v[1]=1;
           
           for(int i=2;i<=a-1;i++)
           {
              
            v[i]=v[i-1]+v[i-2];   
           }
           System.out.println("Los primeros "+a+" elementos de la serie de Fibonacci son");
            for(int i=0;i<=a-1;i++)
           {
              System.out.print ("  "+v[i]);
             System.out.print (" ");
                     
           }
           
    }
}
