package Interfaces;

import POO.GestionMenu;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;

public class ventana2 extends javax.swing.JFrame {

    private ArrayList<GestionMenu> lista;

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
        elimiPlato = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlMenu = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
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

        elimiPlato.setText("Eliminar plato");

        jlMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlMenu);

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(crearMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actualizarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(elimiPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(424, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(crearMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(verMenu)
                        .addGap(18, 18, 18)
                        .addComponent(actualizarMenu)
                        .addGap(18, 18, 18)
                        .addComponent(elimiPlato))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMenuActionPerformed
        // TODO add your handling code here:
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
    public DefaultListModel<String> getModelo() {

        return (DefaultListModel<String>) jlMenu.getModel();
    }

    private void limpiarJlist() {
        DefaultListModel<String> modelo = (DefaultListModel<String>) jlMenu.getModel();
        modelo.clear();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton actualizarMenu;
    private javax.swing.JButton crearMenu;
    private javax.swing.JButton elimiPlato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlMenu;
    private javax.swing.JButton verMenu;
    // End of variables declaration//GEN-END:variables
}
