/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriasExternas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
        setUndecorated(true);

        JPanel topGeneralPane = new JPanel();
        JPanel botGeneralPane = new JPanel();
        topGeneralPane.setBackground(new Color(255, 255, 255));
        botGeneralPane.setBackground(new Color(255, 255, 255));
        JPanel messagePane = new JPanel();
        messagePane.setBackground(new Color(255, 255, 255));
        JLabel text = new JLabel(message);
        text.setFont(new java.awt.Font("Nirmala UI", 1, 14));
        messagePane.add(text);
        JPanel buttonPane = new JPanel();
        buttonPane.setBackground(new Color(255, 255, 255));

        switch (opcion) {
            case 1:
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(80, 45));
                button.setText(buttonMessage);
                button.setBackground(new java.awt.Color(177, 255, 160));
                button.setBorder(new LineBorder(new Color(226, 224, 224)));
                button.setFont(new java.awt.Font("Nirmala UI", 1, 14));
                button.setForeground(new java.awt.Color(102, 102, 102));
                button.setContentAreaFilled(false);
                button.setOpaque(true);
                button.addMouseListener(new styledButtonAction());
                buttonPane.add(button);
                button.addActionListener(new OkCancelButton());
                break;
            case 2:
                JButton btnOK = new JButton();
                btnOK.setPreferredSize(new Dimension(80, 45));
                btnOK.setText(buttonMessage);
                btnOK.setBackground(new java.awt.Color(177, 255, 160));
                btnOK.setBorder(new LineBorder(new Color(226, 224, 224)));
                btnOK.setFont(new java.awt.Font("Nirmala UI", 1, 14));
                btnOK.setForeground(new java.awt.Color(102, 102, 102));
                btnOK.setContentAreaFilled(false);
                btnOK.setOpaque(true);
                btnOK.addMouseListener(new styledButtonAction());
                buttonPane.add(btnOK);
                btnOK.addActionListener(new Aceptar());

                JButton btnCancel = new JButton();
                btnCancel.setPreferredSize(new Dimension(80, 45));
                btnCancel.setText("Cancelar");
                btnCancel.setBackground(new java.awt.Color(252, 153, 178));
                btnCancel.setBorder(new LineBorder(new Color(226, 224, 224)));
                btnCancel.setFont(new java.awt.Font("Nirmala UI", 1, 14));
                btnCancel.setForeground(new java.awt.Color(102, 102, 102));
                btnCancel.setContentAreaFilled(false);
                btnCancel.setOpaque(true);
                btnCancel.addMouseListener(new styledButtonAction());
                buttonPane.add(btnCancel);
                btnCancel.addActionListener(new OkCancelButton());

        }
        topGeneralPane.add(messagePane);
        getContentPane().add(topGeneralPane);
        botGeneralPane.add(buttonPane);
        getContentPane().add(botGeneralPane, BorderLayout.PAGE_END);
        getRootPane().setBorder(new LineBorder(new Color(226, 224, 224)));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        pack();
        double x = Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - this.getWidth() / 2;
        double y = Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - this.getHeight();
        setLocation((int) x, (int) y);
        setVisible(true);
    }

    public int getResult() {
        return result;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setButtonMessage(String buttonMessage) {
        this.buttonMessage = buttonMessage;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    @Override
    public JRootPane createRootPane() {
        JRootPane rootPane = new JRootPane();
        KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
        Action action = new AbstractAction() {

            private static final long serialVersionUID = 1L;

            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        };
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(stroke, "ESCAPE");
        rootPane.getActionMap().put("ESCAPE", action);
        return rootPane;
    }

    class OkCancelButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            result = 0;
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

    class styledButtonAction extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            button.setBorder(new LineBorder(new Color(0, 0, 0)));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            button.setBorder(new LineBorder(new Color(226, 224, 224)));
        }
    }
}
