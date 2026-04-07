
package fernando.exercicio4;

/**
 *
 * @author fernando
 */
public class Exercicio4 {

    public static void main(String[] args) {
        // resultado esperado: 'Nome: [nome], Nascimento: [dia]/[mês]/[ano]'
        String nome = "fernando";
        int dia = 15;
        int mes = 05;
        int ano = 2000;
        String data = (dia + "/" + mes + "/" + ano);
        System.out.println("nome: " + nome + ", nascimento: " + data);
    }
}
