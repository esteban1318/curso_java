
package Interfaces;

import javax.swing.SwingUtilities;

public class MainSwing {
    public static void main(String[] args) {
        /*
           SwingUtilities.invokeLater(() -> {
            // Crear la ventana 
           java_swing operacion=new java_swing();
            operacion.setVisible(true);
            
        });
        */
        
        /*
        SwingUtilities.invokeLater(() ->{
                Agenda op=new Agenda();
                op.setVisible(true);
        }); 
        */
        sobreCarga op=new sobreCarga();
        String s=op.sumar(3);
        System.out.println(s);
    }
    
}
