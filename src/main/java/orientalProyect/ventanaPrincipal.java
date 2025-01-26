package orientalProyect;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        JTFbusqueda.setEditable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JTFbusqueda = new javax.swing.JTextField();
        ButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadosTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 31, 38));

        JTFbusqueda.setEditable(false);
        JTFbusqueda.setBackground(new java.awt.Color(63, 63, 82));
        JTFbusqueda.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        JTFbusqueda.setForeground(new java.awt.Color(204, 204, 255));
        JTFbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFbusquedaActionPerformed(evt);
            }
        });

        ButtonSearch.setText("BUSCAR");
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });

        resultadosTabla.setBackground(new java.awt.Color(14, 34, 67));
        resultadosTabla.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        resultadosTabla.setForeground(new java.awt.Color(153, 0, 0));
        resultadosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id-apartamento", "numero_apartamento", "id_torre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        resultadosTabla.setSelectionForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(resultadosTabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                    .addComponent(JTFbusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
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

    private void JTFbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFbusquedaActionPerformed

    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        String tecladoBusqueda = JTFbusqueda.getText().trim();

        if (!tecladoBusqueda.isEmpty()) {
            Connection conn = dbConexion.conectar();

            if (conn != null) {
                String query = "SELECT * FROM apartamentos WHERE numero_apartamento LIKE ? OR id_torre LIKE ?";

                try (PreparedStatement pst = conn.prepareStatement(query)) {
                    // Se agregan los parámetros de búsqueda (por nombre o número de apartamento)
                    pst.setString(1, "%" + tecladoBusqueda + "%");
                    pst.setString(2, "%" + tecladoBusqueda + "%");

                    ResultSet rs = pst.executeQuery();

                    DefaultTableModel modeloTabla = (DefaultTableModel) resultadosTabla.getModel();
                    modeloTabla.setRowCount(0); // Limpiar la tabla antes de mostrar los nuevos resultados

                    while (rs.next()) {
                        // Agregar los resultados a la tabla. Asegúrate de que las columnas se ajusten a tu consulta
                        Object[] fila = new Object[3];
                        fila[0] = rs.getInt("id_apartamento"); // Suponiendo que tienes un campo "id" en la tabla
                        fila[1] = rs.getString("numero_apartamento"); // El nombre del propietario
                        fila[2] = rs.getString("id_torre"); // El número de apartamento
                        
                        modeloTabla.addRow(fila);

                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error en la consulta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            }else{
                JOptionPane.showMessageDialog(this,"mala conexion");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ingrese una busqueda");
        }

    }//GEN-LAST:event_ButtonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSearch;
    public javax.swing.JTextField JTFbusqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resultadosTabla;
    // End of variables declaration//GEN-END:variables
}
