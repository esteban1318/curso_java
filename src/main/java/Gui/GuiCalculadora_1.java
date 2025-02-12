package Gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GuiCalculadora_1 extends JFrame {

    private static GuiCalculadora_1 instancia;
    JPanel pDatos;
    JPanel pBotones;
    JPanel pResultado;
    JLabel numero1;
    JLabel numero2;
    JTextField tNumero1, tNumero2, tResultado;
    JButton bsuma, bresta, bmultiplicacion, bdivision;
    Container cPrincipa;

    int resultado;

    public static GuiCalculadora_1 getInstancia() {
        if (instancia == null) {
            instancia = new GuiCalculadora_1();
        }
        return instancia;
    }

    public void initComponents() {
        pDatos = new JPanel();
        pDatos.setBackground(new Color(0xD4E6F1));
        pBotones = new JPanel();
        pBotones.setBackground(new Color(0xD4E6F1));
        pResultado = new JPanel();
        pResultado.setBackground(new Color(0xD4E6F1));
        numero1 = new JLabel("numero 1:");
        numero2 = new JLabel("numero 2:");
        tNumero1 = new JTextField(10);
        tNumero2 = new JTextField(10);
        tResultado = new JTextField(20);
        tResultado.setEditable(true);
        bsuma = new JButton("Suma");
        bresta = new JButton("Resta");
        bmultiplicacion = new JButton("Multiplicacion");
        bdivision = new JButton("Division");

//se agrega primer panel al panel principal
        pDatos.setLayout(new GridLayout(2, 2));
        pDatos.add(numero1);
        pDatos.add(tNumero1);
        pDatos.add(numero2);
        pDatos.add(tNumero2);
        pDatos.setBorder(BorderFactory.createTitledBorder("Ingrese  datos"));
//se agrega segundo panel
        pBotones.add(bsuma);
        pBotones.add(bresta);
        pBotones.add(bmultiplicacion);
        pBotones.add(bdivision);
        pBotones.setBorder(BorderFactory.createTitledBorder("Operaciones"));
//se agrega tercer panel
        pResultado.add(tResultado);
        pResultado.setBorder(BorderFactory.createTitledBorder("Resultado"));

    }

    private void bsumaActionPerformed(java.awt.event.ActionEvent evt) {
        int n1 = Integer.parseInt(tNumero1.getText());
        int n2 = Integer.parseInt(tNumero2.getText());
        resultado = n1 + n2;
        tResultado.setText(String.valueOf(resultado));
    }

    private GuiCalculadora_1() {
        initComponents();
        cPrincipa = getContentPane();
        cPrincipa.setLayout(new GridLayout(3, 1));
        cPrincipa.add(pDatos);
        cPrincipa.add(pBotones);
        cPrincipa.add(pResultado);
        setSize(500, 400);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    public void asignarEscuchas(ActionListener evento) {
        bsuma.addActionListener(evento);
        bresta.addActionListener(evento);
        bmultiplicacion.addActionListener(evento);
        bdivision.addActionListener(evento);
    }

    public JTextField getTfNumero1() {
        return tNumero1;
    }

    public JTextField getTfNumero2() {
        return tNumero2;
    }

    public JTextField gettResultado() {
        return tResultado;
    }

    public JButton getBresta() {
        return bresta;
    }

    public JButton getBmultiplicacion() {
        return bmultiplicacion;
    }

    public JButton getDdivision() {
        return bdivision;
    }

    public JButton getBsuma() {
        return bsuma;
    }

    public void settResultado(String dato) {
        this.tResultado.setText(dato);
    }

    public static void main(String[] args) {
        GuiCalculadora_1 vista = GuiCalculadora_1.getInstancia();
        CalculadoraModelo modelo = new CalculadoraModelo();
        ControladorCalculadora controlador=new ControladorCalculadora(modelo, vista);
    }

}
