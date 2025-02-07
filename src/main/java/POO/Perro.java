package POO;

import javax.swing.JOptionPane;

public class Perro extends Agenda implements Animal,interface2{

   

    @Override
    public void ladrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void HacerRuido() {
        throw new UnsupportedOperationException("miau"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ruido() {
        return Animal.super.ruido();
    }

    @Override
    public void saludar() {
        throw new UnsupportedOperationException("hola, good morning"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void main(String[] args) {
       

        
        

    }

}
