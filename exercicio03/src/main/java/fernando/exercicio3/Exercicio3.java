
package fernando.exercicio3;

/**
 *
 * @author fernando
 */
public class Exercicio3 {

    public static void main(String[] args) {
        // calcular área do retangulo (comprimento * largura)
        final int COMPRIMENTO = 40;
        final int LARGURA = 10;
        int area = COMPRIMENTO * LARGURA;
        System.out.println("calculo de área = " + area);
        
        // calcular perímetro do retangulo (soma dos 4 lados)
        int perimetro = (COMPRIMENTO * 2) + (LARGURA * 2);
        System.out.println("calculo do perímetro " + perimetro);
    }
}
