
package fernando.exercicio17;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Exercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // solicitar um valor numérico.
        System.out.println("digite um valor positivo ou negativo");
        double valor = sc.nextDouble();
        
        
        // verificar se o valor é positivo ou negativo.
        // positivo.
        if (valor > 0){
            System.out.println("O valor informado é positivo");
        }// negativo.
        else if (valor < 0){
            System.out.println("O valor informado é negativo");
        }// igual a zero
        else {
            System.out.println("o valor informado é igual a 0 (zero)");
        }
    }
}
