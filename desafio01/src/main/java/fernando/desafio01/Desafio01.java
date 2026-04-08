
package fernando.desafio01;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author fernando
 */
public class Desafio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#00,00%");
        
        System.out.print("informe seu nome: ");
        String nome = sc.next();
        System.out.print("informe a sua frequência: ");
        float frequencia = sc.nextFloat();
        System.out.print("Informe a sua nota: ");
        int nota = sc.nextInt();
        
        System.out.println("========================================================");
        
        System.out.printf("nome: %s\n", nome);
        System.out.println("frequencia: " + df.format(frequencia));
        System.out.printf("nota: %d\n", nota);
        System.out.println("========================================================");
        if (frequencia >= 75 && nota >= 50){
            System.out.println("situação: APROVADO para Certificação.");
        } else {
            System.out.println("situação: REPROVADO. certificado negado.");
        }
    }
}

                                                                   //minskyminsk