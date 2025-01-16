package Interfaces;

import java.awt.BorderLayout;
import javax.swing.*;

public class interfaz_codigo {

    public static void main(String[] args) {

        // Crear la ventana
        JFrame frame = new JFrame("Mi Ventana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600 ); // Tamaño de la ventana

        // Crear la instancia de ejercicio_2
        ejercicio_2 operacion = new ejercicio_2();

        // Agregar el panel al JFrame
        frame.add(operacion.getOp());
        
        
        

        // Mostrar la ventana
        frame.setVisible(true);
    }
}


