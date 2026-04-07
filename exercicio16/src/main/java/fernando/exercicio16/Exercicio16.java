
package fernando.exercicio16;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // solicitar o valor de uma compra
        System.out.print("qual o valor da compra? R$");
        float compra = sc.nextFloat();
        float desconto = compra * 0.15f;
        
        // Verificar se o valor é superior a R$ 150,00. 
        // Se for, conceder um desconto de 15% sobre o valor da compra e exibir o valor com o desconto aplicado.
        if (compra > 150){
            compra -= desconto;
            System.out.println("você recebeu um desconto de 15% \nvalor com desconto R$" + compra);
        } 
        
        // Caso o valor seja igual ou inferior a R$ 150,00, exibir a mensagem "Sem desconto".
        else {
            System.out.println("valor não aplicável a desconto. \ntotal R$" + compra + "\n");
            System.out.println("em compras acima de R$150.00 você recebe o desconto de 15%");
        }
        
    }
}
