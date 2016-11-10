package net.sevecek;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JPanel contentPane;
    JLabel labBarva1;
    JLabel labBarva2;
    JLabel labBarva3;
    JLabel labBarva4;
    JLabel labVysledek;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    Color zvolenaBarva;

    public HlavniOkno() {
        initComponents();
    }

    private void labBarva1MouseClicked(MouseEvent e) {
        JLabel aktualniLabel;
        aktualniLabel = (JLabel) e.getSource();
        zvolenaBarva = aktualniLabel.getBackground();
        labVysledek.setBackground(zvolenaBarva);
    }

    private void labVysledekMouseClicked(MouseEvent e) {
        Integer mysX;
        Integer mysY;
        mysX = e.getX();
        mysY = e.getY();
        String souradniceJakoText = "[" + mysX.toString() + ", " + mysY.toString() + "]";
        labVysledek.setText(souradniceJakoText);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        contentPane = new JPanel();
        labBarva1 = new JLabel();
        labBarva2 = new JLabel();
        labBarva3 = new JLabel();
        labBarva4 = new JLabel();
        labVysledek = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Moje nov\u00e1 aplikace");
        Container contentPane2 = getContentPane();
        contentPane2.setLayout(new BorderLayout());

        //======== contentPane ========
        {
            contentPane.setLayout(null);

            //---- labBarva1 ----
            labBarva1.setBackground(new Color(153, 0, 153));
            labBarva1.setBorder(new BevelBorder(BevelBorder.RAISED));
            labBarva1.setOpaque(true);
            labBarva1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    labBarva1MouseClicked(e);
                }
            });
            contentPane.add(labBarva1);
            labBarva1.setBounds(30, 30, 55, 50);

            //---- labBarva2 ----
            labBarva2.setBackground(new Color(153, 0, 0));
            labBarva2.setBorder(new BevelBorder(BevelBorder.RAISED));
            labBarva2.setOpaque(true);
            labBarva2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    labBarva1MouseClicked(e);
                }
            });
            contentPane.add(labBarva2);
            labBarva2.setBounds(30, 85, 55, 50);

            //---- labBarva3 ----
            labBarva3.setBackground(new Color(51, 0, 153));
            labBarva3.setBorder(new BevelBorder(BevelBorder.RAISED));
            labBarva3.setOpaque(true);
            labBarva3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    labBarva1MouseClicked(e);
                }
            });
            contentPane.add(labBarva3);
            labBarva3.setBounds(30, 140, 55, 50);

            //---- labBarva4 ----
            labBarva4.setBackground(new Color(0, 102, 102));
            labBarva4.setBorder(new BevelBorder(BevelBorder.RAISED));
            labBarva4.setOpaque(true);
            labBarva4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    labBarva1MouseClicked(e);
                }
            });
            contentPane.add(labBarva4);
            labBarva4.setBounds(30, 195, 55, 50);

            //---- labVysledek ----
            labVysledek.setText("Vysledek");
            labVysledek.setBorder(new BevelBorder(BevelBorder.RAISED));
            labVysledek.setFont(new Font("Segoe UI", Font.BOLD, 18));
            labVysledek.setOpaque(true);
            labVysledek.setHorizontalAlignment(SwingConstants.CENTER);
            labVysledek.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    labVysledekMouseClicked(e);
                }
            });
            contentPane.add(labVysledek);
            labVysledek.setBounds(160, 35, 280, 75);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < contentPane.getComponentCount(); i++) {
                    Rectangle bounds = contentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = contentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                contentPane.setMinimumSize(preferredSize);
                contentPane.setPreferredSize(preferredSize);
            }
        }
        contentPane2.add(contentPane, BorderLayout.CENTER);
        setSize(500, 395);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
