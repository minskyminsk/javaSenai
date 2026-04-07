
package fernando.exercicio08;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // receber volts (V)
        System.out.println("quantos volts tem o seu aparelho?");
        int volts = sc.nextInt();
        
        // receber amperes (A)
        System.out.println("quantos amperes tem o seu aparelho?");
        int amperes = sc.nextInt();
        
        // calcular a potencia: P = V x A
        int potencia = volts * amperes;
        
        // mostrar
        System.out.println("pontência consumida: " + potencia + "w");
        
        
        // exercício 09 (ou 8,5);
        // agora, calcular quantos amperes baseado na potência e tensão digitados
        
        int corrente = potencia / volts;
        System.out.println("corrente = " + corrente);
    }
}
