
package fernando.exercicio11;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // conversor de moedas.
        // informar o valor em reais.
        System.out.println("digite o valor em reais");
        double reais = sc.nextDouble();
        
        // calcular o valor em euros.
        double euros = reais * 5.95;
        System.out.println("o valor em euros é igual a €"+ euros);
        
        System.out.println("========================================================================");
        // calcular valor em dólares.
        double dolares = reais * 5.15;
        System.out.println("o valor em dólares americanos é igual a $" + dolares);
                     
        
    }
}
