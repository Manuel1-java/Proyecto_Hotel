package Vista;

import Controlador.ControladorEmpleadosAgregar;
import java.awt.Color;

public class AgregarEmpleado extends javax.swing.JFrame {

    public AgregarEmpleado() {
        initComponents();
        this.setLocation(450,175); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBotones2 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        calendario = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtCorreoE = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtNControl = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cboCarrera = new javax.swing.JComboBox<>();
        txtContraseña = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelBotones2.setBackground(new java.awt.Color(255, 255, 255));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotones2Layout = new javax.swing.GroupLayout(PanelBotones2);
        PanelBotones2.setLayout(PanelBotones2Layout);
        PanelBotones2Layout.setHorizontalGroup(
            PanelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotones2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        PanelBotones2Layout.setVerticalGroup(
            PanelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotones2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resort.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("OASIS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setText("Nombre (s):");

        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Ej. Ian Andrés");
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNombreMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNombreMouseReleased(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel21.setText("Apellido P:");

        jLabel22.setText("Apellido M:");

        jLabel27.setText("Fecha de Nacimiento:");

        txtApellidoP.setForeground(new java.awt.Color(153, 153, 153));
        txtApellidoP.setText("Ej. López");
        txtApellidoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtApellidoPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtApellidoPMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtApellidoPMouseReleased(evt);
            }
        });
        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPKeyTyped(evt);
            }
        });

        txtApellidoM.setForeground(new java.awt.Color(153, 153, 153));
        txtApellidoM.setText("Ej. Rosas");
        txtApellidoM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtApellidoMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtApellidoMMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtApellidoMMouseReleased(evt);
            }
        });
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });

        calendario.setForeground(new java.awt.Color(153, 153, 153));
        calendario.setText("Ej. 2000-01-01");
        calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calendarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calendarioMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                calendarioMouseReleased(evt);
            }
        });
        calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarioActionPerformed(evt);
            }
        });

        jLabel36.setText("Correo Electronico");

        txtCorreoE.setForeground(new java.awt.Color(153, 153, 153));
        txtCorreoE.setText("Ej. ianandres111@gmail.com");
        txtCorreoE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCorreoEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCorreoEMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCorreoEMouseReleased(evt);
            }
        });
        txtCorreoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoEActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Información general");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoM)
                                    .addComponent(txtApellidoP)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calendario))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel30))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel36)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36))
                    .addComponent(txtCorreoE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(294, 294, 294))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel35.setText("Captura de Puesto");
        jPanel6.add(jLabel35);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("En caso aplicar para recepcionista agregue una contraseña");

        jLabel37.setText("Contraseña");

        jLabel34.setText("Clave única");

        txtNControl.setForeground(new java.awt.Color(153, 153, 153));
        txtNControl.setText("Ej. 22161128");
        txtNControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNControlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNControlMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNControlMouseReleased(evt);
            }
        });
        txtNControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNControlKeyTyped(evt);
            }
        });

        jLabel31.setText("Puesto");

        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Recepcionista", "Camarerista", "Intendencia", "Jardinería", "Lavandería", "Botón" }));
        cboCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCarreraActionPerformed(evt);
            }
        });

        txtContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtContraseña.setText("********");
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseReleased(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Informacion de Hotel");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNControl))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelBotones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        ControladorEmpleadosAgregar.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ControladorEmpleadosAgregar.guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCorreoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoEActionPerformed

    private void txtNControlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNControlMouseEntered
        // TODO add your handling code here:
        if(txtNControl.getText().equals("")){
            txtNControl.setText("Ej. 22161128");
            txtNControl.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNControlMouseEntered

    private void txtNControlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNControlMouseExited
        // TODO add your handling code here:
        if(txtNControl.getText().equals("")){
            txtNControl.setText("Ej. 22161128");
            txtNControl.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNControlMouseExited

    private void txtNControlMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNControlMouseReleased
        // TODO add your handling code here:
        if(txtNControl.getText().equals("Ej. 22161128") || txtNControl.getText().equals("")){
            txtNControl.setText("");
            txtNControl.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNControlMouseReleased

    private void txtNControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNControlKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtNControlKeyTyped

    private void cboCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCarreraActionPerformed

    private void txtNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseEntered
        // TODO add your handling code here:
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Ej. Ian Andrés");
            txtNombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreMouseEntered

    private void txtNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseExited
        // TODO add your handling code here:
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Ej. Ian Andrés");
            txtNombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreMouseExited

    private void txtNombreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseReleased
        // TODO add your handling code here:
        if(txtNombre.getText().equals("Ej. Ian Andrés") || txtNombre.getText().equals("")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreMouseReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoPMouseEntered
        // TODO add your handling code here:
        if(txtApellidoP.getText().equals("")){
            txtApellidoP.setText("Ej. López");
            txtApellidoP.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtApellidoPMouseEntered

    private void txtApellidoPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoPMouseExited
        // TODO add your handling code here:
        if(txtApellidoP.getText().equals("")){
            txtApellidoP.setText("Ej. López");
            txtApellidoP.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtApellidoPMouseExited

    private void txtApellidoPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoPMouseReleased
        // TODO add your handling code here:
        if(txtApellidoP.getText().equals("Ej. López") || txtApellidoP.getText().equals("")){
            txtApellidoP.setText("");
            txtApellidoP.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtApellidoPMouseReleased

    private void txtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoPKeyTyped

    private void txtApellidoMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMMouseEntered
        // TODO add your handling code here:
        if(txtApellidoM.getText().equals("")){
            txtApellidoM.setText("Ej. Rosas");
            txtApellidoM.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtApellidoMMouseEntered

    private void txtApellidoMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMMouseExited
        // TODO add your handling code here:
        if(txtApellidoM.getText().equals("")){
            txtApellidoM.setText("Ej. Rosas");
            txtApellidoM.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtApellidoMMouseExited

    private void txtApellidoMMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMMouseReleased
        // TODO add your handling code here:
        if(txtApellidoM.getText().equals("Ej. Rosas") || txtApellidoM.getText().equals("")){
            txtApellidoM.setText("");
            txtApellidoM.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtApellidoMMouseReleased

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarioActionPerformed

    private void txtContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseEntered
        // TODO add your handling code here:
        if(txtContraseña.getText().equals("")){
            txtContraseña.setText("********");
            txtContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContraseñaMouseEntered

    private void txtContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseExited
        // TODO add your handling code here:
        if(txtContraseña.getText().equals("")){
            txtContraseña.setText("********");
            txtContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContraseñaMouseExited

    private void txtContraseñaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseReleased
        // TODO add your handling code here:
        if(txtContraseña.getText().equals("********") || txtContraseña.getText().equals("")){
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtContraseñaMouseReleased

    private void txtCorreoEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoEMouseEntered
        // TODO add your handling code here:
        if(txtCorreoE.getText().equals("")){
            txtCorreoE.setText("Ej. ianandres111@gmail.com");
            txtCorreoE.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCorreoEMouseEntered

    private void txtCorreoEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoEMouseExited
        // TODO add your handling code here:
        if(txtCorreoE.getText().equals("")){
            txtCorreoE.setText("Ej. ianandres111@gmail.com");
            txtCorreoE.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCorreoEMouseExited

    private void txtCorreoEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoEMouseReleased
        // TODO add your handling code here:
        if(txtCorreoE.getText().equals("Ej. ianandres111@gmail.com") || txtCorreoE.getText().equals("")){
            txtCorreoE.setText("");
            txtCorreoE.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCorreoEMouseReleased

    private void calendarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioMouseEntered
        // TODO add your handling code here:
        if(calendario.getText().equals("")){
            calendario.setText("Ej. 2000-01-01");
            calendario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_calendarioMouseEntered

    private void calendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioMouseExited
        // TODO add your handling code here:
        if(calendario.getText().equals("")){
            calendario.setText("Ej. 2000-01-01");
            calendario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_calendarioMouseExited

    private void calendarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioMouseReleased
        // TODO add your handling code here:
        if(calendario.getText().equals("Ej. 2000-01-01") || calendario.getText().equals("")){
            calendario.setText("");
            calendario.setForeground(Color.black);
        }
    }//GEN-LAST:event_calendarioMouseReleased

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    public static javax.swing.JTextField calendario;
    public static javax.swing.JComboBox<String> cboCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JTextField txtApellidoM;
    public static javax.swing.JTextField txtApellidoP;
    public static javax.swing.JPasswordField txtContraseña;
    public static javax.swing.JTextField txtCorreoE;
    public static javax.swing.JTextField txtNControl;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
