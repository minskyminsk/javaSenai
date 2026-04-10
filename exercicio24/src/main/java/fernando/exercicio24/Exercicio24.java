
package fernando.exercicio24;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Exercicio24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite o número do serviço desejado:");
        System.out.println("1 - clínico geral \n2 - dermatologia \n3 - odontologia \n4 - banho e tosa");
        int escolha = sc.nextInt();
        System.out.println("você possui convênio? ");
        System.out.println("1 - sim \n2 - não");
        int convenio = sc.nextInt();
        System.out.println("\n===========================================================\n");
        
        if (convenio == 2){
            switch (escolha) {
                case 1 -> System.out.print("valor do serviço: R$100,00");
                case 2 -> System.out.print("valor do serviço: R$150,00");
                case 3 -> System.out.print("valor do serviço: R$120,00");
                case 4 -> System.out.print("valor do serviço: R$120,00");
                }     
        } else if (convenio == 1){
            switch (convenio){
                case 1 -> System.out.print("valor do serviço: R$80,00");
                case 2 -> System.out.print("valor do serviço: R$120,00");
                case 3 -> System.out.print("valor do serviço: R$96,00");
                case 4 -> System.out.print("valor do serviço: R$96,00");
            }
        }
    }
}
