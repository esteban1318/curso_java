package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora implements ActionListener {

    CalculadoraModelo modelo;
    GuiCalculadora_1 vista;

    public ControladorCalculadora(CalculadoraModelo modelo, GuiCalculadora_1 vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.asignarEscuchas(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getBsuma()) {
            try {
                int n1 = Integer.parseInt(vista.getTfNumero1().getText());
                int n2 = Integer.parseInt(vista.getTfNumero2().getText());

                modelo.suma(n1, n2);
                vista.settResultado("" + modelo.suma(n1, n2));
            } catch (NumberFormatException ex2) {
                double n1, n2;
                n1 = Double.parseDouble(vista.getTfNumero1().getText());
                n2 = Double.parseDouble(vista.getTfNumero2().getText());

                modelo.suma(n1, n2);
                vista.settResultado("" + modelo.suma(n1, n2));
            }
        }
        if (e.getSource() == vista.getBresta()) {
            try {
                int n1 = Integer.parseInt(vista.getTfNumero1().getText());
                int n2 = Integer.parseInt(vista.getTfNumero2().getText());

                modelo.resta(n1, n2);
                vista.settResultado("" + modelo.resta(n1, n2));

            } catch (NumberFormatException ex2) {
                double n1 = Double.parseDouble(vista.getTfNumero1().getText());
                double n2 = Double.parseDouble(vista.getTfNumero2().getText());

                modelo.resta(n1, n2);
                vista.settResultado("" + modelo.resta(n1, n2));
            }
        }
        if (e.getSource() == vista.getBmultiplicacion()) {
            try {
                int n1 = Integer.parseInt(vista.getTfNumero1().getText());
                int n2 = Integer.parseInt(vista.getTfNumero2().getText());
                
                modelo.multiplicacion(n1, n2);
                vista.settResultado(""+modelo.multiplicacion(n1, n2));

            } catch (NumberFormatException ex2) {
                double n1 = Double.parseDouble(vista.getTfNumero1().getText());
                double n2 = Double.parseDouble(vista.getTfNumero2().getText());
                
                modelo.multiplicacion(n1, n2);
                vista.settResultado(""+modelo.multiplicacion(n1, n2));
            }
        }
    }
}
