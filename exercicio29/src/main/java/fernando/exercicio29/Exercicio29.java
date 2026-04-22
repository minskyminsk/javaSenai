package fernando.exercicio29;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
    
/**
 *
 * @author fernando
 */
public class Exercicio29 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.#");

        int continuar;
 
        do{
        try {
            // receber String -> tratar String com .replace() -> converter String em double
            String kgStr = (JOptionPane.showInputDialog("qual o seu peso em kg? ex.: 70.5"));
            kgStr = kgStr.replace(",", ".");
            double kg = Double.parseDouble(kgStr);
            // receber String -> tratar String com .replace() -> converter String em double
            String alturaStr = (JOptionPane.showInputDialog("qual a sua altura? ex.: 1.70"));
            alturaStr = alturaStr.replace(",", ".");
            double altura = Double.parseDouble(alturaStr);
            // calculo do imc
            double imc = kg / (altura * altura);

            if (imc < 18.5) {
                JOptionPane.showMessageDialog(null, "seu imc é " + df.format(imc) + ": você está abaixo do peso ideal");
            } else if (imc < 25) {
                JOptionPane.showMessageDialog(null, "seu imc é " + df.format(imc) + ": parabéns! você está em seu peso ideal");
            } else if (imc < 30) {
                JOptionPane.showMessageDialog(null, "seu imc é " + df.format(imc) + ": você está com sobrepeso");
            } else if (imc < 35) {
                JOptionPane.showMessageDialog(null, "seu imc é " + df.format(imc) + ": obesidade grau 1");
            } else if (imc < 40) {
                JOptionPane.showMessageDialog(null, "seu imc é " + df.format(imc) + ": obesidade grau 2");
            } else if (imc >= 40) {
                JOptionPane.showMessageDialog(null, "seu imc é " + df.format(imc) + ": obesidade grau 3");
            }
                                    
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "você deve digitar apenas números");
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "até logo... e obrigado pelos peixes!");
        }
        
        continuar = JOptionPane.showConfirmDialog(null, "deseja realizar uma nova consulta?", "continuar", JOptionPane.YES_NO_OPTION);
        
        } while (continuar == JOptionPane.YES_OPTION);
            JOptionPane.showMessageDialog(null, "até logo... e obrigado pelos peixes");
            
    }
}
