
package fernando.exercicio10;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //
        System.out.println("digite o 1° número");
        int n1 = sc.nextInt();
        
        System.out.println("digite o 2° número");
        int n2 = sc.nextInt();
        
        System.out.println("digite o 3° número");
        int n3 = sc.nextInt();
        
        System.out.println("digite o 4° número");
        int n4 = sc.nextInt();
        
        System.out.println("digite o 5° número");
        int n5 = sc.nextInt();
        
        int soma = (n1 + n2 + n3 + n4 + n5);
        System.out.println("a soma de todos dos 5 números é igual a " + soma);
        }
    }
