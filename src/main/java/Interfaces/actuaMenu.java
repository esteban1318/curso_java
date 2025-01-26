package Interfaces;

import POO.GestionDeRestaurante;
import POO.GestionMenu;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class actuaMenu extends javax.swing.JFrame {

    private ArrayList<GestionMenu> lista;
    private DefaultListModel<String> modelo;
    crearMenu uso = new crearMenu("", 0);
    ventana2 anterior;
    String namePlato;
    double pricePlato;

    public actuaMenu(ArrayList<GestionMenu> lista, DefaultListModel<String> modelo, ventana2 anterior) {
        initComponents();
        setLocationRelativeTo(null);

        this.lista = lista;
        this.modelo = modelo;
        this.anterior=anterior;

        JlistBusqueda.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JlistBusqueda = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        JTplatoNuevo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTprecioNuevo = new javax.swing.JTextField();
        buttonActualizar = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(89, 122, 115));
        jPanel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        JlistBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        JlistBusqueda.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(JlistBusqueda);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Nuevo plato");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Nuevo precio");

        buttonActualizar.setText("Actualizar");
        buttonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarActionPerformed(evt);
            }
        });

        buttonBack.setText("Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTplatoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTprecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(buttonBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonActualizar)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTplatoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTprecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActualizar)
                    .addComponent(buttonBack))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarActionPerformed
        int selectedIndex = JlistBusqueda.getSelectedIndex();

        if (selectedIndex == -1) {
            // No hay un elemento seleccionado
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un plato de la lista para modificar.");
            return;
        }
        String platoNuevo = JTplatoNuevo.getText();
        String precioTexto = JTprecioNuevo.getText();
        if (platoNuevo.isEmpty() || precioTexto.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un nombre y un precio.");
            return;
        }
        try {
            double precioNuevo = Double.parseDouble(precioTexto);

            // Modifica el elemento en el ArrayList
            GestionDeRestaurante platoActual = lista.get(selectedIndex);
            platoActual.setNombrePlato(platoNuevo);  // Método que debes tener en tu clase `GestionMenu`
            platoActual.setPrecio(precioNuevo); // Método que debes tener en tu clase `GestionMenu`

            // Actualiza el elemento en el modelo del JList
            modelo.set(selectedIndex, platoNuevo + " - $" + precioNuevo);

            // Limpia los campos de texto
            JTplatoNuevo.setText("");
            JTprecioNuevo.setText("");

            javax.swing.JOptionPane.showMessageDialog(this, "Plato actualizado correctamente.");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.");
        }

    }//GEN-LAST:event_buttonActualizarActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        setVisible(false);
        anterior.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

    @Override
    public String toString() {
        return namePlato + "- $" + pricePlato;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTplatoNuevo;
    private javax.swing.JTextField JTprecioNuevo;
    private javax.swing.JList<String> JlistBusqueda;
    private javax.swing.JButton buttonActualizar;
    private javax.swing.JButton buttonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
