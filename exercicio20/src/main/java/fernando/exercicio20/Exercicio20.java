
package fernando.exercicio20;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // calculadora de nota com if e else
        System.out.println("digite a 1° nota");
        float n1 = sc.nextFloat();
        
        System.out.println("digite a 2° nota");
        float n2 = sc.nextFloat();
        
        System.out.println("digite a 3° nota");
        float n3 = sc.nextFloat();
        
        System.out.println("digite a 4° nota");
        float n4 = sc.nextFloat();
        
        float media = (n1 + n2 + n3 + n4)/4;
        System.out.printf("nota final: %.2f \n", media);
        // aprovado ou reprovado?
        if (media >= 7){
            System.out.println("aluno aprovado! parabéns, recruta. comemore!");
        }else {
            System.out.println("aluno reprovado... melhore.");
        }
    }
}
