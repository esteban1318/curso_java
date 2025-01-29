package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.CodeSigner;
import javax.imageio.ImageIO;

public class java_swing extends JFrame {

    public java_swing() {

        setTitle("AGENDA");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        crearPanel();

        setVisible(true);

    }

    /**
     *
     */
    final public void crearPanel() {
        JPanel panel = new JPanel() {//creo un jpanel
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                try {
                    BufferedImage imagen = ImageIO.read(new File("C:\\Users\\USUARIO\\Downloads\\6854056.jpg"));
                    g2d.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

                    Color colorPanelInicio = Color.decode("#2471a3");
                    Color colorPanelCenter = Color.decode("#154360");
                    Color colorPanelFinal = Color.decode("#000033");

                    float[] distancias = {0.0f, 0.5f, 1.0f};
                    Color[] colores = {colorPanelInicio, colorPanelCenter, colorPanelFinal};

                    LinearGradientPaint gradiente = new LinearGradientPaint(0, 0, getWidth(), getHeight(), distancias, colores);
                    g2d.setComposite(AlphaComposite.SrcOver.derive(0.6f));
                    g2d.setPaint(gradiente);

                    g2d.fillRect(0, 0, getWidth(), getHeight());

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        panel.setLayout(null);//se establece null para poder agregar mas elementos y que no haya conflicto
        add(panel);//agregar el panel al jframe
        //creacion de lebel
        JLabel panel2=new JLabel();
        
        panel2.setBounds(300, 350, 120, 30);
        try{
            BufferedImage imagen2= ImageIO.read(new File("C:\\Users\\USUARIO\\Downloads\\imagen1.jpg"));
            ImageIcon icono = new ImageIcon(imagen2.getScaledInstance(panel2.getWidth(), panel2.getHeight(), Image.SCALE_SMOOTH));
             panel2.setIcon(icono);
        }catch(IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar la segunda imagen: " + e.getMessage());
        }
        panel.add(panel2);
        
    }
}
