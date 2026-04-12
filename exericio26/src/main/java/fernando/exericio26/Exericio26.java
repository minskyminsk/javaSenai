
package fernando.exericio26;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Exericio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        
        while (true){
            if (i >= 1 || i <= -1){
                System.out.print("digite um número inteiro positivo ou negativo: ");
                i = sc.nextInt();
                if (i > 0){
                    System.out.println("\no número digitado é POSITIVO \n");
                    System.out.println("digite outro ou digite 0 (zero) para parar\n");
                } else if (i < 0) {
                    System.out.println("\no número digitado é NEGATIVO \n");
                    System.out.println("digite outro ou digite 0 (zero) para parar\n");
                }
            } else {
                System.out.print("parei contigo...");
                break;
            }
        }
    }
}