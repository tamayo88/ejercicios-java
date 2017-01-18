
package invertirdigito;

import java.util.Scanner;

public class InvertirDigito {
    public static void main(String[] args) {
     //variable num guardara valor que se pedira por teclado
       int num;
        // Bucle do while para controlar que el usuario introduzca un numero de 5 digitos
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
