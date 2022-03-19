
package calculadorab;

import java.util.Scanner;

/**
 *
 * @author aldan
 */


public class CalculadoraB {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculadora miCalculadora = new Calculadora(10,5);
        
        double suma =  miCalculadora.sumar();
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+ miCalculadora.restar());
        System.out.println("La multiplicacion es: "+ miCalculadora.multiplicar());
        System.out.println("La division es: "+ miCalculadora.dividir());
        System.out.println("La potencia es: "+ miCalculadora.potencia());
        System.out.println("La raiz es: "+ miCalculadora.raiz());
    }
    
}
