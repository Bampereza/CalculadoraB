
package calculadorab;

/**
 *
 * @author aldan
 */
public class Calculadora {
  
    private double operando1;
    private double operando2;
    
    public Calculadora(){
        
        
    }
    
    public Calculadora(double operando1, double operando2){
      this.operando1 = operando1;
      this.operando2 = operando2;
     
    }
    
    public double sumar(){
        double suma = this.operando1 + this.operando2;
        return suma;
    }
    
     public double restar(){
        double resta = this.operando1 - this.operando2;
        return resta;
     }
     
     public double multiplicar(){
        double multiplicacion = this.operando1 * this.operando2;
        return multiplicacion;
     }
     
     public double dividir(){
        double division = operando1 / operando2;
        return division;
     }
     
     public double potencia(){//No logre encontrar la funcion 
        double potencia = operando1 / operando2;
        return potencia;
     }
     
     public double raiz(){ //No logre encontrar la funcion
        double raiz = operando1 / operando2;
        return raiz;
     }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }
     
}
