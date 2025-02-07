package PatronesDiseño;

import javax.swing.JOptionPane;

public class pSingleton {

    private static pSingleton instancia;
    String usuario = "poveda1318";

    private pSingleton() {
    }

    public static pSingleton getInstancia() {
        if (instancia == null) {
            instancia = new pSingleton();
        }
        return instancia;
    }

    public void principal() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "****Menu****\n\n" + "1. Saludar\n" + "2.restar\n"
                    + ""
                    + "ingrese opcion"));
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "hola");
            }

        } while (opcion != 0);
    }

}
