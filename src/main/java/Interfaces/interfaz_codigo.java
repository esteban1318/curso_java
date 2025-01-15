
package Interfaces;



import java.awt.BorderLayout;
import javax.swing.*;


public class interfaz_codigo{
    public static void main(String [] args){
        
        JFrame frame=new JFrame();
        ejercicio_2 operacion=new ejercicio_2();
        frame.setContentPane(operacion.getOp());
        
        frame.setVisible(true);
        System.out.println("hola mundo");
        
    }
}
