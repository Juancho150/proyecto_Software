package prototipo;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setTitle("SiGCIF-PRIMAX");        
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboUsuario = new javax.swing.JComboBox<>();
        jLabelidentificacion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCCField = new javax.swing.JTextField();
        jContraseñaField = new javax.swing.JPasswordField();
       // jContraseña = new java.swing.JPasswordField();
        jBotonIniciarSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Bienvenido");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Sistema de gestión de combustible e inventario y facturación");

        jLabel2.setText("Seleccione tipo de usuario");

        jComboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Administrador", "Operador" }));
        jComboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboUsuarioActionPerformed(evt);
            }
        });


        jLabelidentificacion.setText("CI/RUC/Pasaporte");

        jLabel4.setText("Contraseña:");

        jBotonIniciarSesion.setText("Iniciar sesión");
        jBotonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonIniciarSesionActionPerformed(evt);
            }
        });

        jLabel5.setText("Recuperar contraseña");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelidentificacion)
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboUsuario, 0, 139, Short.MAX_VALUE)
                            .addComponent(jCCField)
                            .addComponent(jContraseñaField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jBotonIniciarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                       // .addComponent(jLabel5)
                        ))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelidentificacion)
                    .addComponent(jCCField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jContraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBotonIniciarSesion)
                .addGap(18, 18, 18)
                //.addComponent(jLabel5)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// FIN de initComponents
   public String validarIngreso(int index, String CI, String pass){

        String retorno = "";

        if(index == SELECCIÓN){
            retorno = "No se ha seleccionado usuario";
        }else{
            /*if(index==ADMINISTRADOR){
                //retorno="Se ha seleccionado Administrador";
                this.setVisible(false);
                Menú m1=new Menú();
                m1.setVisible(true);
                m1.setEnabled(true);
            }else{
                retorno="Se ha seleccionado Operador";
            }*/
            validarPass(index, CI, pass);
        }

        return retorno;
    }

    public void validarPass(int index, String CI, String pass){

        switch (index) {
            case 1:
                if(pass.equals(PASS_ADMIN)&&CI.equals(CI_ADMIN)){
                this.setVisible(false);
                Menú m1=new Menú();
                m1.setVisible(true);
                m1.setEnabled(true);
                }else if(intentos == 3){
                    JOptionPane.showMessageDialog(null, "Ha excedido el numero de intentos. Vuelva mas tarde");
                    System.exit(0);
                }else{
                    JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto. Asegúrese de introducir correctamente sus datos. \n Quedan " + (3 - intentos) + " intentos.");
                    jCCField.setText("");
                    jContraseñaField.setText("");
                    intentos = intentos + 1;
                }
                break;
                
            case 2:
                if(pass.equals(PASS_USER)&&CI.equals(CI_USER)){
                JOptionPane.showMessageDialog(null, "Ha iniciado sesión como operador operador");
                this.setVisible(false);
                Menú m1=new Menú();
                m1.setVisible(true);
                m1.setEnabled(true);
                m1.asignarOperador();
                }else{
                    JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto. Asegúrese de introducir correctamente sus datos.");
                }
                break;
        }

    }


    private void jBotonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonIniciarSesionActionPerformed
      
        /*if(evt.getSource()==jBotonIniciarSesion){
            JOptionPane.showMessageDialog(null, "despacho");
        }*/

        //Para validar mi ingreso cuento con esos 2 parametros
       // String res = validarIngreso(jComboUsuario.getSelectedIndex(), jContraseñaField.getText());
        
        String res = validarIngreso(jComboUsuario.getSelectedIndex(), jCCField.getText(), jContraseñaField.getText());

        //JOptionPane.showMessageDialog(null, res);

        
        
    }//GEN-LAST:event_jBotonIniciarSesionActionPerformed

     private void jComboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
    
        String seleccion=(String)jComboUsuario.getSelectedItem();
        int indice=jComboUsuario.getSelectedIndex();

        if(evt.getSource()==jComboUsuario){
            if(indice==0){
                jLabelidentificacion.setVisible(false);
            }else{
                jLabelidentificacion.setVisible(true);
            }
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(JOptionPane.showConfirmDialog(null,"¿Está seguro?")==0){
            System.exit(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        recuperarcontraseña r1 = new recuperarcontraseña();
        r1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonIniciarSesion;
    private javax.swing.JComboBox<String> jComboUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelidentificacion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jCCField;
    private javax.swing.JTextField jContraseñaField;
    // End of variables declaration//GEN-END:variables


    final int SELECCIÓN = 0;
    final int ADMINISTRADOR = 1;
    final int OPERADOR = 2;

    final String PASS_ADMIN = "1234";
    final String PASS_USER = "123";
    final String CI_ADMIN = "0503018707";
    final String CI_USER = "1711112969";
    int intentos;

}
