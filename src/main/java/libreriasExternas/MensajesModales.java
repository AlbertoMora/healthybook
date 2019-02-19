/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriasExternas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Alberto Mora
 */
public class MensajesModales extends JDialog{
    private static JDialog dialogo;
    public static void mensajePlano(String mensaje, String textoBoton) {
        dialogo = new JDialog();
        JLabel lblMensaje = new JLabel();
        JButton btnOk =  new JButton();
        initBoton(btnOk, "Nirmala UI", textoBoton);
        JButton botones[] = {btnOk};
        initComponentes(dialogo, lblMensaje ,mensaje, botones);
        dialogo.setLayout(new BorderLayout());
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }

    private static void initComponentes(JDialog ventana, JLabel lblMensaje, String mensaje, JButton botones[]) {
        JPanel panel = new JPanel();
        ventana.setUndecorated(true);
        ventana.getContentPane().add(panel);
        panel.setBackground(new Color(255, 255, 255));
        panel.setBorder(new LineBorder(new Color(226, 224, 224)));
        lblMensaje.setText(mensaje);
        lblMensaje.setFont(new java.awt.Font("Nirmala UI", 1, 14));

        ventana.pack();
    }
    private static void initBoton(JButton boton, String fuente, String textoBoton){
        boton.setBackground(new java.awt.Color(177, 255, 160));
        boton.setFont(new java.awt.Font(fuente, 1, 14)); // NOI18N
        boton.setForeground(new java.awt.Color(102, 102, 102));
        boton.setText(textoBoton);
        boton.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(226, 224, 224)));
        boton.setContentAreaFilled(false);
        boton.setOpaque(true);
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public  void ActionPerfomed(){
                dialogo.dispose();
            }
        }
                );
    }
}
