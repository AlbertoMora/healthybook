/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriasExternas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;

/**
 *
 * @author Alberto Mora
 */
public class MensajesModales extends JDialog {

    private static final long serialVersionUID = 1L;
    private int result;
    String message;
    String buttonMessage;
    int opcion;

    public MensajesModales(JFrame parent, String message, String buttonMessage, int opcion) {
        super(parent, "");

        this.message = message;
        this.buttonMessage = buttonMessage;
        this.opcion = opcion;

    }

    public void ShowMessage() {
        initComponents(message, opcion, buttonMessage);
        
    }

    public int getResult() {
        return result;
    }

    private void initComponents(String message, int opcion, String buttonMessage) {
        System.out.println("creating the window..");
        setUndecorated(true);
        setSize(250, 120);
        setLocationRelativeTo(null);
        // Create a message
        JPanel topGeneralPane = new JPanel();
        JPanel botGeneralPane = new JPanel();
        topGeneralPane.setBackground(new Color(255, 255, 255));
        //topGeneralPane.setBorder(new LineBorder(new Color(226,224,224)));
        botGeneralPane.setBackground(new Color(255, 255, 255));
        //botGeneralPane
        JPanel messagePane = new JPanel();
        messagePane.setBackground(new Color(255, 255, 255));
        JLabel text = new JLabel(message);
        text.setFont(new java.awt.Font("Nirmala UI", 1, 14));
        messagePane.add(text);
        JPanel buttonPane = new JPanel();
        buttonPane.setBackground(new Color(255, 255, 255));
        
        switch (opcion) {
            // Create a button
            case 1:
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(80, 45));
                button.setText(buttonMessage);
                button.setBackground(new java.awt.Color(177, 255, 160));
                button.setBorder(new LineBorder(new Color(226, 224, 224)));
                button.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
                button.setForeground(new java.awt.Color(102, 102, 102));
                button.setContentAreaFilled(false);
                button.setOpaque(true);
                buttonPane.add(button);
                // set action listener on the button
                button.addActionListener(new OkCancelButton());
                break;
            case 2:
                JButton btnOK = new JButton();
                btnOK.setPreferredSize(new Dimension(80, 45));
                btnOK.setText(buttonMessage);
                btnOK.setBackground(new java.awt.Color(177, 255, 160));
                btnOK.setBorder(new LineBorder(new Color(226, 224, 224)));
                btnOK.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
                btnOK.setForeground(new java.awt.Color(102, 102, 102));
                btnOK.setContentAreaFilled(false);
                btnOK.setOpaque(true);
                buttonPane.add(btnOK);
                // set action listener on the button
                btnOK.addActionListener(new Aceptar());
                
                JButton btnCancel = new JButton();
                btnCancel.setPreferredSize(new Dimension(80, 45));
                btnCancel.setText("Cancelar");
                btnCancel.setBackground(new java.awt.Color(252, 153, 178));
                btnCancel.setBorder(new LineBorder(new Color(226, 224, 224)));
                btnCancel.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
                btnCancel.setForeground(new java.awt.Color(102, 102, 102));
                btnCancel.setContentAreaFilled(false);
                btnCancel.setOpaque(true);
                buttonPane.add(btnCancel);
                // set action listener on the button
                btnCancel.addActionListener(new OkCancelButton());
                
        }
        topGeneralPane.add(messagePane);
        getContentPane().add(topGeneralPane);
        botGeneralPane.add(buttonPane);
        getContentPane().add(botGeneralPane, BorderLayout.PAGE_END);
        getRootPane().setBorder(new LineBorder(new Color(0, 0, 0)));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        pack();
        setVisible(true);
    }
    // override the createRootPane inherited by the JDialog, to create the rootPane.
    // create functionality to close the window when "Escape" button is pressed

    public JRootPane createRootPane() {
        JRootPane rootPane = new JRootPane();
        KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
        Action action = new AbstractAction() {

            private static final long serialVersionUID = 1L;

            public void actionPerformed(ActionEvent e) {
                System.out.println("escaping..");
                setVisible(false);
                dispose();
            }
        };
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(stroke, "ESCAPE");
        rootPane.getActionMap().put("ESCAPE", action);
        return rootPane;
    }

    // an action listener to be used when an action is performed
    // (e.g. button is pressed)
    class OkCancelButton implements ActionListener {

        //close and dispose of the window.
        public void actionPerformed(ActionEvent e) {
            result = 0;
            System.out.println("disposing the window..");
            setVisible(false);
            dispose();
        }
    }

    class Aceptar implements ActionListener {

        //close and dispose of the window.
        public void actionPerformed(ActionEvent e) {
            result = 1;
            setVisible(false);
            dispose();
        }
    }
}
