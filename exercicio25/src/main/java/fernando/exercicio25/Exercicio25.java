
package fernando.exercicio25;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Exercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // traduzir o exemplo em Portugol para Java
        System.out.print("digite o nome de uma cidade: ");
        String cidade = sc.next();
        
        // switch-case
        switch (cidade) {
            case "Jundiaí", "Santos", "Mauá", "Diadema" ->  {
                System.out.println("é uma cidade de São Paulo.");
            }
            case "Monte Verde", "Camanducaia", "Pouso Alegre" ->  {
                System.out.println("é uma cidade de Minas Gerais");
            }
            default -> System.out.println("é uma cidade não listada no programa");
        }
    }
}
