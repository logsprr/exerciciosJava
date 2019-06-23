
package exercicio;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           ValorV1V2 opera;
           opera = new ValorV1V2();
       
           opera.operaçao();
       }
       catch(NumberFormatException erro){
           System.out.println(" Houve um erro de digitação :" 
                   + erro.toString());
       }
       
    }
    
}
