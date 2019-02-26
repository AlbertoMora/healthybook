/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import CustomDependencies.ComponentMover;
import controladores.ControladorUsuario;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import libreriasExternas.MensajesModales;
import modelos.ModeloUsuario;

/**
 *
 * @author Alberto Mora
 */
public class frmRegistroExterno extends javax.swing.JFrame {

    /**
     * Creates new form frmRegistroExterno
     */
    public frmRegistroExterno() {
        initComponents();
        setLocationRelativeTo(null);
        iniCompPropios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtConContra = new javax.swing.JPasswordField();
        txtContra = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(226, 224, 224), new java.awt.Color(226, 224, 224)));

        btnCerrar.setBackground(new java.awt.Color(250, 250, 250));
        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnCerrar.setText("X");
        btnCerrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(226, 224, 224)));
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setMargin(new Insets(0,0,0,0));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCerrarMouseReleased(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMinimizar.setBackground(new java.awt.Color(250, 250, 250));
        btnMinimizar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnMinimizar.setText("_");
        btnMinimizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(226, 224, 224)));
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setMargin(new Insets(0,0,0,0));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMinimizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseReleased(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 224, 224)), "Registrar Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Nirmala UI Semilight", 1, 28), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        jLabel1.setText("Nombre*");

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 255, 160), new java.awt.Color(226, 224, 224)));

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        jLabel2.setText("Apellidos*");

        txtApe.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 255, 160), new java.awt.Color(226, 224, 224)));

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        jLabel3.setText("Nombre de Usuario");

        txtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 255, 160), new java.awt.Color(226, 224, 224)));

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        jLabel4.setText("Correo electrónico*");

        jLabel5.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        jLabel5.setText("Contraseña*");

        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 255, 160), new java.awt.Color(226, 224, 224)));

        jLabel6.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        jLabel6.setText("Confirmar Contraseña*");

        txtTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 255, 160), new java.awt.Color(226, 224, 224)));

        jLabel7.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        jLabel7.setText("Telefono");

        txtConContra.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(226, 224, 224), new java.awt.Color(177, 255, 160)));

        txtContra.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(226, 224, 224), new java.awt.Color(177, 255, 160)));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("Datos de la cuenta");

        jLabel9.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.ibb.co/0yT6VDj/account.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(28, 28, 28))
                            .addComponent(txtNombre)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApe)
                                    .addComponent(txtConContra, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(txtEmail)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jLabel6)))
                        .addGap(529, 529, 529))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel3)
                                .addGap(292, 292, 292)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1)
                                .addGap(350, 350, 350)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConContra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        btnRegistrar.setBackground(new java.awt.Color(177, 255, 160));
        btnRegistrar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(102, 102, 102));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 224, 224)));
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setOpaque(true);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseReleased(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(252, 153, 178));
        btnCancelar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 224, 224)));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setOpaque(true);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void iniCompPropios() {
        ComponentMover cm = new ComponentMover();
        cm.registerComponent(this);
    }
    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        // TODO add your handling code here:
        btnCerrar.setBorder(new LineBorder(new Color(0, 0, 0)));
    }//GEN-LAST:event_btnCerrarMousePressed

    private void btnCerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseReleased
        // TODO add your handling code here:
        btnCerrar.setBorder(new LineBorder(new Color(226, 224, 224)));
    }//GEN-LAST:event_btnCerrarMouseReleased

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        MensajesModales mensaje = new MensajesModales(this, "¿Está seguro que desea salir del sistema?", "Continuar", 2);
        mensaje.ShowMessage();
        if (mensaje.getResult() == 1) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMousePressed
        // TODO add your handling code here:
        btnMinimizar.setBorder(new LineBorder(new Color(0, 0, 0)));
    }//GEN-LAST:event_btnMinimizarMousePressed

    private void btnMinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseReleased
        // TODO add your handling code here:
        btnMinimizar.setBorder(new LineBorder(new Color(226, 224, 224)));
    }//GEN-LAST:event_btnMinimizarMouseReleased

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        // TODO add your handling code here:
        btnCancelar.setBorder(new LineBorder(new Color(0, 0, 0)));
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        // TODO add your handling code here:
        btnCancelar.setBorder(new LineBorder(new Color(226, 224, 224)));
    }//GEN-LAST:event_btnCancelarMouseReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        MensajesModales mensaje = new MensajesModales(this, "Los datos no guardados se perderán, ¿está seguro que desea interrumpir el proceso de registro?", "Ok", 2);
        mensaje.ShowMessage();
        if (mensaje.getResult() == 1) {
            frmLogin login = new frmLogin();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMousePressed
        // TODO add your handling code here:
        btnRegistrar.setBorder(new LineBorder(new Color(0, 0, 0)));
    }//GEN-LAST:event_btnRegistrarMousePressed

    private void btnRegistrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseReleased
        // TODO add your handling code here:
        btnRegistrar.setBorder(new LineBorder(new Color(226, 224, 224)));
    }//GEN-LAST:event_btnRegistrarMouseReleased

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        MensajesModales mensaje;
        String patronEmail = "^[0-9a-zA-Z]+([0-9a-zA-Z]*[-._+])*[0-9a-zA-Z]+@[0-9a-zA-Z]+([-.][0-9a-zA-Z]+)*([0-9a-zA-Z]*[.])[a-zA-Z]{2,6}$";
        if (!txtNombre.getText().isEmpty() && !txtApe.getText().isEmpty() && !new String(txtContra.getPassword()).isEmpty() && !new String(txtConContra.getPassword()).isEmpty() && !txtEmail.getText().isEmpty()) {
            if (txtEmail.getText().matches(patronEmail)) {
                if (new String(txtContra.getPassword()).equals(new String(txtConContra.getPassword()))) {
                    ModeloUsuario nUsuario = new ModeloUsuario(txtNombre.getText().replace("'", "''"), txtApe.getText().replace("'", "''"), txtUsuario.getText().replace("'", "''"),
                            txtEmail.getText().replace("'", "''"), new String(txtContra.getPassword()).replace("'", "''"), txtTelefono.getText().replace("'", "''"), false);
                    ControladorUsuario con = new ControladorUsuario();
                    boolean result = con.registrarUsuario(nUsuario);
                    if (result) {
                        mensaje = new MensajesModales(this, "El usuario ha sido registrado satisfactoriamente", "Ok", 1);
                        mensaje.ShowMessage();
                        frmLogin login = new frmLogin();
                        login.setVisible(true);
                        this.dispose();
                    } else {
                        mensaje = new MensajesModales(this, "El usuario o email ya están siendo utilizados, por favor inténtelo de nuevo", "Ok", 1);
                        mensaje.ShowMessage();
                    }
                } else {
                    mensaje = new MensajesModales(this, "Los campos \"Contraseña\" y \"Confirmar contraseña\" deben ser iguales", "Ok", 1);
                    mensaje.ShowMessage();
                }
            } else {
                mensaje = new MensajesModales(this, "El correo electrónico ingresado no tiene un formato válido, por favor inténtelo de nuevo", "Ok", 1);
                mensaje.ShowMessage();
            }
        } else {
            mensaje = new MensajesModales(this, "Por favor complete todos los campos requeridos (*)", "Ok", 1);
            mensaje.ShowMessage();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroExterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroExterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroExterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroExterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroExterno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApe;
    private javax.swing.JPasswordField txtConContra;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
