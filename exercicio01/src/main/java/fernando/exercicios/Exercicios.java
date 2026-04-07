
package fernando.exercicios;

/**
 *
 * @author fernando
 */
public class Exercicios {
        // exercício: calcular amperes do disjuntor do chuveiro
    public static void main(String[] args) {
        // ampere = potência (w) / volts (v)
        // chuveiro 1: 8500w 220v
        int potenciaChuveiro = 8500;
        int voltsChuveiro = 220;
        int ampere = potenciaChuveiro / voltsChuveiro;
        System.out.println("Para um chuveiro de 8500w, disjuntor de " + ampere + " amperes.");
        
        // chuveiro 2: 5000w 220v
        potenciaChuveiro = 5000;
        ampere = potenciaChuveiro / voltsChuveiro;
        // voltsChuveiro e ampere segue igual
        System.out.println("Para um chuveiro de 5000 w, disjuntor de " + ampere + " amperes.");
        
        // chuveiro 3: 7500w 220v
        potenciaChuveiro = 7500;
        ampere = potenciaChuveiro / voltsChuveiro;
        System.out.println("Para um chuveiro de 7500w, disjuntor de " + ampere + " amperes.");
    }
}
