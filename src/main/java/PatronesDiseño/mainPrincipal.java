
package PatronesDiseño;

import javax.swing.JOptionPane;


public class mainPrincipal {
     public static void main(String[] args) {
        pSingleton op = pSingleton.getInstancia();
        
        
       String  tecladoUsuario=JOptionPane.showInputDialog(null,"ingrese ususario");
        if(tecladoUsuario.equals(op.usuario)){
            JOptionPane.showMessageDialog(null, "bienvenido "+op.usuario);
        }
    }
}