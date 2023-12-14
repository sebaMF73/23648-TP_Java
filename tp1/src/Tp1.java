
import java.io.IOException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Tp1 extends javax.swing.JFrame {

    PreparedStatement ps;
    public Tp1() {
        initComponents();
        this.setLocationRelativeTo(null);
        Usuario usr=new Usuario();
        usr.llenarTabla(tablaUsuarios);
       
    }

    private void limpiarTextos(){
         txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtCiudad.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        txtCiudad = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar2 = new javax.swing.JButton();
        tablaUsiarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");
        jLabel2.setToolTipText("");

        jLabel3.setText("Edad");
        jLabel3.setToolTipText("");

        jLabel4.setText("Ciudad");

        txtId.setEditable(false);
        txtId.setFocusable(false);

        btnActualizar.setBackground(new java.awt.Color(255, 204, 0));
        btnActualizar.setText("Limpiar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Oradores");

        btnInsertar.setBackground(new java.awt.Color(255, 204, 0));
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnActualizar2.setBackground(new java.awt.Color(255, 204, 0));
        btnActualizar2.setText("Cambiar");
        btnActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId)
                            .addComponent(txtNombre)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(txtCiudad))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar)
                    .addComponent(btnActualizar2))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        tablaUsiarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout tablaUsiariosLayout = new javax.swing.GroupLayout(tablaUsiarios);
        tablaUsiarios.setLayout(tablaUsiariosLayout);
        tablaUsiariosLayout.setHorizontalGroup(
            tablaUsiariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        tablaUsiariosLayout.setVerticalGroup(
            tablaUsiariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablaUsiariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablaUsiarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablaUsiarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtCiudad.setText("");
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        Usuario usr=new Usuario();
        
        usr.seleccionar(tablaUsuarios, txtId, txtNombre, txtEdad, txtCiudad);
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        Conexion con=new Conexion();
        Usuario user=new Usuario();
        try{
        ps=con.conectar().prepareStatement("insert into users (nombre,edad,ciudad) values (?,?,?);");
        ps.setString(1, txtNombre.getText());
        ps.setString(2, txtEdad.getText());
        ps.setString(3, txtCiudad.getText());
        int resultado=ps.executeUpdate();
        //ps.executeUpdate(); se puede hacer de las dos formas
        if (resultado>0){
            JOptionPane.showMessageDialog(null, "Se ha insertado un Usuario correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error, no se pudo agregar un usuario nuevo: "+resultado);
        }
        con.cerrarConexion();
        user.llenarTabla(tablaUsuarios);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        try{
       user.CrearXML();
       }catch (IOException e){}
        limpiarTextos();
       
        
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar2ActionPerformed
       Conexion con=new Conexion();
       Usuario user=new Usuario();
       try{
       
       ps=con.conectar().prepareStatement("update users set nombre=?,edad=?,ciudad=? where id=?");
       ps.setString(1, txtNombre.getText());
       ps.setString(2,txtEdad.getText());
       ps.setString(3, txtCiudad.getText());
       ps.setString(4,txtId.getText());
       int resultado=ps.executeUpdate();
        //ps.executeUpdate(); se puede hacer de las dos formas
        if (resultado>0){
            JOptionPane.showMessageDialog(null, "Se ha Actualizado un Usuario correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error, no se pudo actialzar el usuario actual: "+resultado);
        }
       
       con.cerrarConexion();
               
       }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error. "+e);
       }
       user.llenarTabla(tablaUsuarios);
       try{
       user.CrearXML();
       }catch (IOException e){}
        limpiarTextos();
    }//GEN-LAST:event_btnActualizar2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion con=new Conexion();
       Usuario user=new Usuario();
       try{
       
       ps=con.conectar().prepareStatement("delete from users where id=?");
       ps.setString(1, txtId.getText());
       
       int resultado=ps.executeUpdate();
        //ps.executeUpdate(); se puede hacer de las dos formas
        if (resultado>0){
            JOptionPane.showMessageDialog(null, "Se ha Eliminado un Usuario correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error, no se pudo eliminar el usuario actual: "+resultado);
        }
       con.cerrarConexion();
               
       }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error. "+e);
       }
       user.llenarTabla(tablaUsuarios);
       try{
       user.CrearXML();
       }catch (IOException e){}
        limpiarTextos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tp1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tablaUsiarios;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
