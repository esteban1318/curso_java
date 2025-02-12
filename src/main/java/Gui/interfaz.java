package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.*;
import java.awt.Container;
import java.awt.GridBagLayout;

public class interfaz extends JFrame {

    JPanel panel1, pCombos;
    JPanel pBotones;
    JTextArea area;
    JScrollPane barras;
    JLabel etiqueta;
    JLabel etiquetaImagen;
    JButton boton1;
    JButton boton2;
    Container panelFrame;
    JTextField campo;
    JCheckBox cbUno, cbDos;
    JRadioButton op1, op2, op3;
    ButtonGroup organizar;

    public interfaz() {
        initComponents();
        panelFrame = getContentPane();

        panelFrame.setLayout(new BorderLayout());
        panelFrame.add(panel1, BorderLayout.CENTER);
        panelFrame.add(pBotones, BorderLayout.NORTH);
        panelFrame.add(pCombos, BorderLayout.EAST);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void initComponents() {
        panel1 = new JPanel();
        pBotones = new JPanel();
        pCombos = new JPanel();
        pBotones.setLayout(new GridLayout(2, 1));
        area = new JTextArea("area de texto");


        /*
        ImageIcon icono=new ImageIcon("C:\\Users\\USUARIO\\Downloads\\archivo-de-busqueda.png");
        etiquetaImagen= new JLabel(icono);
         */
        area.setEditable(false);
        area.setText("hola mundo");
        area.append("\ncomo estan");
        area.setSize(10, 10);

        barras = new JScrollPane(area);
        etiqueta = new JLabel("nombre:", JLabel.CENTER);

        panel1.add(etiqueta);
        campo = new JTextField(10);
        cbUno = new JCheckBox("OPcion 1");
        cbDos = new JCheckBox("opcion 2");
        organizar=new ButtonGroup();
        op1 = new JRadioButton("nadar");
        op2 = new JRadioButton("cantar");
        op3 = new JRadioButton("programar");
        organizar.add(op1);
        organizar.add(op2);
        organizar.add(op3);
        pCombos.setLayout(new GridLayout(6, 1));
        pCombos.add(cbUno);
        pCombos.add(cbDos);
        pCombos.add(new JLabel("radio opciones"));
        pCombos.add(op1);
        pCombos.add(op2);
        pCombos.add(op3);
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
