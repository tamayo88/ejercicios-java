
package recursividaddecbin;
 import java.util.*;
/**
 *
 * @author usuario
 */
public class RecursividadDecBin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduzca un numero mayor de 0: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println();
        System.out.print("Binario: ");
        decBin(n);
        System.out.println();
    }

    public static void decBin(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            decBin(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
    
}