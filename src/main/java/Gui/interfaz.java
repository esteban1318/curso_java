package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.*;
import java.awt.Container;

public class interfaz extends JFrame {
    
    JPanel panel1;
    JPanel pBotones;
    JTextArea area;
    JScrollPane barras;
    JLabel etiqueta;
    JLabel etiquetaImagen;
    JButton boton1;
    JButton boton2;
    Container panelFrame;
    JTextField campo;
    
    public interfaz() {
        initComponents();
        panelFrame = getContentPane();
        panelFrame.setLayout(new BorderLayout());
        panelFrame.add(panel1, BorderLayout.CENTER);
        panelFrame.add(pBotones, BorderLayout.NORTH);
        setLocation(150, 0);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void initComponents() {
        panel1 = new JPanel();
        pBotones = new JPanel();
        pBotones.setLayout(new GridLayout(2, 1));
        area = new JTextArea("Area de texto" );
        area.select(2, 10);
        /*
        ImageIcon icono=new ImageIcon("C:\\Users\\USUARIO\\Downloads\\archivo-de-busqueda.png");
        etiquetaImagen= new JLabel(icono);
         */
        area.setEditable(false);
        area.setText("hola mundo");
        area.append("\ncomo estan");
        
        barras = new JScrollPane(area);
        etiqueta = new JLabel("nombre:", JLabel.CENTER);
        
        panel1.add(etiqueta);
        campo = new JTextField(10);
        panel1.add(campo);
        panel1.add(barras);
        boton1 = new JButton("Suma");
        boton2 = new JButton("Resta");
        pBotones.add(boton1);
        pBotones.add(boton2);
        
    }
    
    public static void main(String[] args) {
        interfaz miGUI = new interfaz();
        
    }
}
