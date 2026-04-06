
package fernando.exercicio12;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // valor do salário em reais.
        System.out.print("digite o seu salário: \nR$");
        double salario = sc.nextDouble();
        
        // exibir valor do adiantamento do salário, considerando 40% do total.
        double adiantamento = salario * 0.4;
        salario -= adiantamento;
        System.out.println("valor do adiantamento: R$" + adiantamento);
                
        // exibir valor do desconto em folha, correspondente a 8% do total.
        double desconto = salario * 0.08;
        System.out.println("total de descontos: R$" + desconto);
        
        
        // exibir valor final a ser recebido pelo usuário ao final do mês, após os descontos.
        salario -= desconto;
        System.out.println("salário final: R$" + salario);
    }
}
