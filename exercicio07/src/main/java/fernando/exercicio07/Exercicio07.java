
package fernando.exercicio07;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // captura do nome
        System.out.println("qual é o seu nome? ");
        String nome = sc.next();
        
        // captura do ano
        System.out.println("em que ano você nasceu? ");
        int ano = sc.nextInt();
        
        // cálculo da idade
        int idade = 2026 - ano;
        
        // outrput
        
        System.out.println("---------------------------------------");
        System.out.println("nome: " + nome + "\nidade: " + idade);
    }
}
