
package fernando.exercicio18;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // solicitar o número de maçãs
        System.out.println("quantas maçãs deseja?");
        float macas = sc.nextFloat();
        // preço das maçãs
        float precoInteiro = 0.3f;
        float precoDesconto = 0.25f;
        
        // o desconto é aplicado se a quantidade de maçãs for >= 12
        if (macas >= 12){
            macas *= precoDesconto;
            System.out.printf("total com desconto: R$%.2f", macas);
        } else {
            macas *= precoInteiro;
            System.out.printf("total: R$%.2f", macas);
        }
    }
}
