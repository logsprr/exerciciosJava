
package exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        banda internet;
        internet = new banda();
        try{
            internet.calculavelocidade();
        }
        catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro de digitação : " + erro.toString());
        }
        
    }
    
}
