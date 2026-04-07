
package fernando.exercicio19;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Exercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // receber idade.
        System.out.print("informe a sua idade: ");
        int idade = sc.nextInt();
        
        // se >= 18 <= 70 é obrigatório
        if (idade >= 18 && idade <= 70){
            System.out.println("o voto é obrigatório");
        }
        // se >= 16 e <= 17 é facultativo
        else if (idade == 16 || idade == 17 ){
            System.out.println("o voto é facultativo");            
        }
        // se < 16 não apto
        else if(idade < 16){
            int resta = 18 - idade;
            System.out.printf("você não está apto ao voto, faltam %d para excer o voto obrigatório", resta);
        }
        // e se for uma múmia?
        else if(idade > 119){
            System.out.println("amigo, você já morreu!");
    }
    }
}
