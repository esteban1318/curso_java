
package Gui;

public class CalculadoraModelo{
    public double suma(double n1,double n2)
    {
        
        return n1+n2;
    }
    public int suma(int n1,int n2)
    {
        
        return n1+n2;
    }
    
    public double resta(double n1, double n2){
        return n1-n2;
    }
    public int resta(int n1,int n2){
        return n1-n2;
    }
    public double multiplicacion(double n1, double n2){
        return n1*n2;
    }
    public int multiplicacion(int n1, int n2){
        return n1*n2;
    }
    public double division(double n1, double n2){
        if(n2==0){
            return Double.NaN;
        }return n1/n2;
    }
}
