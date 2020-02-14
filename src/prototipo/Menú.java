package prototipo;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Menú extends javax.swing.JFrame {

    public Menú() {
        initComponents();
        jPanelModulos.setTabPlacement(SwingConstants.LEFT);
        this.setTitle("Menú - SiGCIF-PRIMAX");
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        jPanelModulos = new javax.swing.JTabbedPane();
        jPanelCliente = new javax.swing.JTabbedPane();
        jPanelConsultarCli = new javax.swing.JPanel();
        jLabelConsultaCli = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelActualizarCli = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jPanelRegistroCli = new javax.swing.JPanel();
        jTextRegCI = new javax.swing.JTextField();
        jTextNombresRegCli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextApellidosRegCli = new javax.swing.JTextField();
        jTextDireccionRegCli = new javax.swing.JTextField();
        jTextTelefonoRegCli = new javax.swing.JTextField();
        jTextPlacaRegCli = new javax.swing.JTextField();
        jBotonRegistrarCli = new javax.swing.JButton();
        jComboRegTipoCli = new javax.swing.JComboBox<>();
        jPanelInventario = new javax.swing.JTabbedPane();
        jPanelConsultaInv = new javax.swing.JPanel();
        jLabelBusqInv = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField15 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanelRegistrarInv = new javax.swing.JPanel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jBotonRegistrarInv = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelVentas = new javax.swing.JTabbedPane();
        jPanelConsultarVentas = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jTextField28 = new javax.swing.JTextField();
        jBotonIniciarSesion1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanelRegistrarVentas = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jBotonIniciarSesion5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jBotonAñadirProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelModulos.addTab("Cliente", jPanelCliente);

        jPanelCliente.addTab("Registro", jPanelRegistroCli);

        jLabel1.setText("Tipo de cliente");

        jLabel2.setText("CC                   ");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Dirección");

        jLabel6.setText("Teléfono");

        jLabel7.setText("Placa");

        jBotonRegistrarCli.setText("Registrar cliente");

        jBotonRegistrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegistrarCliActionPerformed(evt);
            }
        });

        jComboRegTipoCli.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Tipo de cliente", "Estándar", "Pre-pago", "Pos-pago" }));
        jComboRegTipoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboRegTipoCliActionPerformed(evt);
            }

            private void jcomboRegTipoCliActionPerformed(ActionEvent evt) {
            }
        });



        jTextNombresRegCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombresRegCliKeyTyped(evt);
            }
        });    

        jTextTelefonoRegCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoRegCliKeyTyped(evt);
            }
        });   

        javax.swing.GroupLayout jPanelRegistroCliLayout = new javax.swing.GroupLayout(jPanelRegistroCli);
        jPanelRegistroCli.setLayout(jPanelRegistroCliLayout);
        jPanelRegistroCliLayout.setHorizontalGroup(
            jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroCliLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(178, 178, 178)
                .addGroup(jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextRegCI)
                    .addComponent(jTextNombresRegCli)
                    .addComponent(jComboRegTipoCli, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextTelefonoRegCli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPlacaRegCli)
                    .addComponent(jTextDireccionRegCli)
                    .addComponent(jTextApellidosRegCli))
                .addGap(165, 165, 165))
            .addGroup(jPanelRegistroCliLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jBotonRegistrarCli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRegistroCliLayout.setVerticalGroup(
            jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroCliLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jComboRegTipoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextRegCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombresRegCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextApellidosRegCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextDireccionRegCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextTelefonoRegCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextPlacaRegCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBotonRegistrarCli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


    jPanelCliente.addTab("Consulta", jPanelConsultarCli);

        jLabelConsultaCli.setText("Seleccione el elemento de búsqueda");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "Nombres", "Apellidos", "Placa" }));

        jButton2.setText("Buscar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CC", "Nombres", "Apellidos", "Dirección", "Teléfono", "Placa"
            }
        ));


        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Teléfono");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Placa");
        }

        javax.swing.GroupLayout jPanelConsultarCliLayout = new javax.swing.GroupLayout(jPanelConsultarCli);
        jPanelConsultarCli.setLayout(jPanelConsultarCliLayout);
        jPanelConsultarCliLayout.setHorizontalGroup(
            jPanelConsultarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarCliLayout.createSequentialGroup()
                .addGroup(jPanelConsultarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultarCliLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelConsultarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelConsultarCliLayout.createSequentialGroup()
                                .addComponent(jLabelConsultaCli)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelConsultarCliLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelConsultarCliLayout.setVerticalGroup(
            jPanelConsultarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarCliLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanelConsultarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultaCli)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
       
    jPanelCliente.addTab("Actualización", jPanelActualizarCli);

         jLabel9.setText("Seleccione el elemento de búsqueda");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "Nombres", "Apellidos", "Placa" }));

        jButton3.setText("Buscar");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CC", "Nombres", "Apellidos", "Dirección", "Teléfono", "Placa"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(4).setHeaderValue("Teléfono");
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Placa");
        }

        jLabel10.setText("Tipo de cliente");

        jLabel12.setText("Apellidos");

        jLabel13.setText("Nombres");

        jLabel14.setText("Dirección");

        jLabel15.setText("Teléfono");

        jLabel16.setText("Placa");

        jButton4.setText("Actualizar");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo de cliente", "Estándar","Pre-pago", "Pos-pago" }));

        jButton5.setText("Editar");

        javax.swing.GroupLayout jPanelActualizarCliLayout = new javax.swing.GroupLayout(jPanelActualizarCli);
        jPanelActualizarCli.setLayout(jPanelActualizarCliLayout);
        jPanelActualizarCliLayout.setHorizontalGroup(
            jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelActualizarCliLayout.createSequentialGroup()
                            .addGap(269, 269, 269)
                            .addComponent(jButton4)
                            .addGap(118, 118, 118))
                        .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                                    .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        

                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel13))
                                    .addGap(93, 93, 93)
                                    .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField11)
                                        .addComponent(jTextField10)
                                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField12)
                                        .addComponent(jTextField13)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel10))))
                    .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelActualizarCliLayout.setVerticalGroup(
            jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelActualizarCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelActualizarCliLayout.createSequentialGroup()
                        .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addGap(24, 24, 24))
        );
       

jPanelModulos.addTab("Inventario", jPanelInventario);

    jPanelInventario.addTab("Registro", jPanelRegistrarInv);

        jLabel25.setText("Código del producto:");

        jLabel26.setText("Nombre del producto:");

        jLabel27.setText("Precio unitario del producto:");

        jBotonRegistrarInv.setText("Registrar");

        jLabel46.setText("Descripción:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane7.setViewportView(jTextArea1);


        javax.swing.GroupLayout jPanelRegistrarInvLayout = new javax.swing.GroupLayout(jPanelRegistrarInv);
        jPanelRegistrarInv.setLayout(jPanelRegistrarInvLayout);
        jPanelRegistrarInvLayout.setHorizontalGroup(
            jPanelRegistrarInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarInvLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanelRegistrarInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarInvLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistrarInvLayout.createSequentialGroup()
                        .addGroup(jPanelRegistrarInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel25))
                        .addGap(104, 104, 104)
                        .addGroup(jPanelRegistrarInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField23)
                            .addComponent(jTextField22)
                            .addComponent(jTextField24))))
                .addGap(165, 165, 165))
            .addGroup(jPanelRegistrarInvLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jBotonRegistrarInv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRegistrarInvLayout.setVerticalGroup(
            jPanelRegistrarInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarInvLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanelRegistrarInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelRegistrarInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarInvLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46))
                    .addGroup(jPanelRegistrarInvLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addComponent(jBotonRegistrarInv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


    jPanelInventario.addTab("Consulta", jPanelConsultaInv);

        jLabelBusqInv.setText("Seleccione el elemento de búsqueda:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código de producto", "Nombre del producto" }));

        jButton6.setText("Buscar");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código del producto", "Nombre del producto", "Precio del producto", "Descripción"
            }
        ));
        jScrollPane3.setViewportView(jTable3);


        javax.swing.GroupLayout jPanelConsultaInvLayout = new javax.swing.GroupLayout(jPanelConsultaInv);
        jPanelConsultaInv.setLayout(jPanelConsultaInvLayout);
        jPanelConsultaInvLayout.setHorizontalGroup(
            jPanelConsultaInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaInvLayout.createSequentialGroup()
                .addGroup(jPanelConsultaInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaInvLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelConsultaInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelConsultaInvLayout.createSequentialGroup()
                                .addComponent(jLabelBusqInv)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelConsultaInvLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelConsultaInvLayout.setVerticalGroup(
            jPanelConsultaInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaInvLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanelConsultaInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBusqInv)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton6)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

jPanelModulos.addTab("Ventas", jPanelVentas);

    jPanelVentas.addTab("Registro", jPanelRegistrarVentas);

        jLabel39.setText("Fecha:");

        jLabel40.setText("Cliente:");

        jLabel41.setText("Productos:");

        jBotonIniciarSesion5.setText("Registrar");

        jLabel17.setText("Día");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel18.setText("Mes");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel19.setText("Año");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Descripción", "Precio unitario", "Precio total"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jBotonAñadirProducto.setText("Añadir producto");
        jBotonAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAñadirProductoActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jPanelRegistrarVentasLayout = new javax.swing.GroupLayout(jPanelRegistrarVentas);
        jPanelRegistrarVentas.setLayout(jPanelRegistrarVentasLayout);
        jPanelRegistrarVentasLayout.setHorizontalGroup(
            jPanelRegistrarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarVentasLayout.createSequentialGroup()
                .addGroup(jPanelRegistrarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarVentasLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jBotonIniciarSesion5))
                    .addGroup(jPanelRegistrarVentasLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanelRegistrarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBotonAñadirProducto)
                            .addGroup(jPanelRegistrarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelRegistrarVentasLayout.createSequentialGroup()
                                    .addGroup(jPanelRegistrarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel40))
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanelRegistrarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelRegistrarVentasLayout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel41)))))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanelRegistrarVentasLayout.setVerticalGroup(
            jPanelRegistrarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarVentasLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanelRegistrarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jBotonAñadirProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotonIniciarSesion5)
                .addGap(124, 124, 124))
        );

    jPanelVentas.addTab("Consulta", jPanelConsultarVentas);

        jLabel31.setText("Seleccione el elemento de búsqueda");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numero", "Cliente", "Fecha" }));

        jBotonIniciarSesion1.setText("Buscar");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Cliente", "Fecha", "Total"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jLabel43.setText("Productos:");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Descripción", "Precio unitario", "Precio total"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        javax.swing.GroupLayout jPanelConsultarVentasLayout = new javax.swing.GroupLayout(jPanelConsultarVentas);
        jPanelConsultarVentas.setLayout(jPanelConsultarVentasLayout);
        jPanelConsultarVentasLayout.setHorizontalGroup(
            jPanelConsultarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarVentasLayout.createSequentialGroup()
                .addGroup(jPanelConsultarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultarVentasLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jBotonIniciarSesion1))
                    .addGroup(jPanelConsultarVentasLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelConsultarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel43)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelConsultarVentasLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanelConsultarVentasLayout.setVerticalGroup(
            jPanelConsultarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarVentasLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanelConsultarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jBotonIniciarSesion1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );




        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelModulos))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombresRegCliKeyTyped(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();//creo variable y condicion 
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    
    } 

    

    private void jTextTelefonoRegCliKeyTyped(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();//creo variable y condicion 
        if(c<'0' || c>'9') evt.consume();
    } 
  

    private void jBotonAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAñadirProductoActionPerformed
        Añadir_producto a1 = new Añadir_producto();
        a1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotonAñadirProductoActionPerformed

    private void jBotonRegistrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAñadirProductoActionPerformed
        
        String tipoCli, CC, nombres, apellidos, direccion, telefono, placa;

        tipoCli = jComboRegTipoCli.getSelectedItem().toString();
        CC = jTextRegCI.getSelectedText();
        nombres = jTextNombresRegCli.getSelectedText();
        apellidos = jTextApellidosRegCli.getSelectedText();
        direccion = jTextDireccionRegCli.getSelectedText();
        telefono = jTextTelefonoRegCli.getSelectedText();
        placa = jTextPlacaRegCli.getSelectedText();

        if (jTextNombresRegCli.getText().equals("") || (jTextDireccionRegCli.getText().equals("")) || (jTextTelefonoRegCli.getText().equals("")) || (jTextPlacaRegCli.getText().equals(""))
        || (jTextRegCI.getText().equals("")) || (jComboRegTipoCli.getSelectedItem().equals("Tipo de cliente"))) {
         
         javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","             ADVERTENCIA",javax.swing.JOptionPane.WARNING_MESSAGE);
         jTextNombresRegCli.requestFocus();
     }


    }
    //private void jBoron 
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?")==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

   public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonRegistrarCli;
    private javax.swing.JButton jBotonRegistrarInv;
    private javax.swing.JButton jBotonIniciarSesion1;
    private javax.swing.JButton jBotonIniciarSesion5;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jBotonAñadirProducto;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboRegTipoCli;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabelBusqInv;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelConsultaCli;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelRegistroCli;
    private javax.swing.JPanel jPanelConsultarCli;
    private javax.swing.JPanel jPanelActualizarCli;
    private javax.swing.JPanel jPanelConsultaInv;
    private javax.swing.JPanel jPanelRegistrarInv;
    private javax.swing.JPanel jPanelConsultarVentas;
    private javax.swing.JPanel jPanelRegistrarVentas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jPanelModulos;
    private javax.swing.JTabbedPane jPanelCliente;
    private javax.swing.JTabbedPane jPanelInventario;
    private javax.swing.JTabbedPane jPanelVentas;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextRegCI;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextNombresRegCli;
    private javax.swing.JTextField jTextApellidosRegCli;
    private javax.swing.JTextField jTextDireccionRegCli;
    private javax.swing.JTextField jTextTelefonoRegCli;
    private javax.swing.JTextField jTextPlacaRegCli;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    
    public void asignarOperador(){
        //jPanelCliente.setVisible(false);
       // jPanelCliente.setEnabled(false);
        //jPanelCliente.remove(1);
        jPanelModulos.remove(0);
    }
}
