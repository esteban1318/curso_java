package Interfaces;

import POO.GestionDeRestaurante;
import POO.GestionMenu;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;


import javax.swing.JOptionPane;

public class ventana2 extends javax.swing.JFrame {

    public ArrayList<GestionMenu> lista;

    public ventana2() {
        initComponents();
        setLocationRelativeTo(null);
        

        DefaultListModel<String> modelo = new DefaultListModel<>();
        jlMenu.setModel(modelo);
        
        
       

        lista = new ArrayList<>();
        limpiarJlist();
        jlMenu.setVisible(false);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        crearMenu = new javax.swing.JButton();
        verMenu = new javax.swing.JButton();
        actualizarMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlMenu = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("opciones de administrador");

        crearMenu.setText("Crear menu");
        crearMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        crearMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuActionPerformed(evt);
            }
        });

        verMenu.setText("Ver menu");
        verMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMenuActionPerformed(evt);
            }
        });

        actualizarMenu.setText("actualizar menu");
        actualizarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMenuActionPerformed(evt);
            }
        });

        jlMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlMenu);

        jButton1.setText("Search");

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel1))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonEliminar)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(verMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actualizarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(Panel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(verMenu)
                        .addGap(18, 18, 18)
                        .addComponent(crearMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(actualizarMenu)
                        .addGap(19, 19, 19))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButtonEliminar)
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMenuActionPerformed
   this.setVisible(false);
   DefaultListModel<String> modelo=(DefaultListModel<String>)  jlMenu.getModel();
   actuaMenu ventana4=new actuaMenu(lista, modelo, this);
ventana4.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_actualizarMenuActionPerformed

    private void crearMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuActionPerformed
        this.setVisible(false);
        DefaultListModel<String> modelo = (DefaultListModel<String>) jlMenu.getModel();
        crearMenu ventana3 = new crearMenu(lista, modelo, this);
        ventana3.setVisible(true);


    }//GEN-LAST:event_crearMenuActionPerformed

    private void verMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMenuActionPerformed

        DefaultListModel<String> modelo = (DefaultListModel<String>) jlMenu.getModel();
        modelo.clear(); // Limpia el modelo antes de agregar los nuevos elementos

        // Agrega los elementos de la lista al modelo
        for (GestionMenu plato : lista) {
            modelo.addElement(plato.toString());

        }

        // Si la lista está vacía, muestra un mensaje
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El menú está vacío.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            jlMenu.setVisible(true);
            JOptionPane.showMessageDialog(this, "Menú cargado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_verMenuActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
DefaultListModel<String> modelo = (DefaultListModel<String>) jlMenu.getModel();
        int selectedIndex = jlMenu.getSelectedIndex();

        if (selectedIndex == -1) {
            // No hay un elemento seleccionado
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un plato de la lista para modificar.");
            return;
        }else{
        modelo.removeElementAt(selectedIndex);
        JOptionPane.showMessageDialog(this,"plato eliminado exotosamente");
        }
       
         
    }//GEN-LAST:event_jButtonEliminarActionPerformed
   

   public void limpiarJlist() {
        DefaultListModel<String> modelo = (DefaultListModel<String>) jlMenu.getModel();
        modelo.clear();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton actualizarMenu;
    private javax.swing.JButton crearMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> jlMenu;
    private javax.swing.JButton verMenu;
    // End of variables declaration//GEN-END:variables
}
