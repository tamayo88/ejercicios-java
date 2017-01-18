/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertirdigito;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class InvertirDigito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int num;
        do{
        System.out.println("Introduce el numero de 5 digitos");
                  Scanner sc2 = new Scanner(System.in);
                   num = sc2.nextInt();
        }while(num<9999 && num>99999);
        String str = String.valueOf(num) ;
String rpta = "" ;

char[] valor = str.toCharArray();

for (int i = valor.length-1; i>-1; i--) {
rpta+= valor[i]+ "";
}
System.out.println(rpta);
    }
    
}
