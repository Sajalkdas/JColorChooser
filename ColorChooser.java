package colorChooser;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class ColorChooser extends javax.swing.JPanel implements ChangeListener, ActionListener {

    private ArrayList listeners;
    private Color color;
    
    public ColorChooser() {
        initComponents();
        listeners = new ArrayList();
        sldRed.addChangeListener(this);
        sldGreen.addChangeListener(this);
        sldBlue.addChangeListener(this);
        jTxtRed.setText("0");
        jTxtGreen.setText("0");
        jTxtBlue.setText("0");
        jTxtRed.addActionListener(this);
        jTxtGreen.addActionListener(this);
        jTxtBlue.addActionListener(this);
        color = new Color(0, 0, 0);
    }

    public Color getCurrentColor() {
        return color;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sldRed = new javax.swing.JSlider();
        sldGreen = new javax.swing.JSlider();
        sldBlue = new javax.swing.JSlider();
        jTxtRed = new javax.swing.JTextField();
        jTxtGreen = new javax.swing.JTextField();
        jTxtBlue = new javax.swing.JTextField();

        jLabel1.setText("Red");

        jLabel2.setText("Green");

        jLabel3.setText("Blue");

        sldRed.setMajorTickSpacing(50);
        sldRed.setMaximum(255);
        sldRed.setMinorTickSpacing(10);
        sldRed.setPaintLabels(true);
        sldRed.setPaintTicks(true);
        sldRed.setValue(0);

        sldGreen.setMajorTickSpacing(50);
        sldGreen.setMaximum(255);
        sldGreen.setMinorTickSpacing(10);
        sldGreen.setPaintLabels(true);
        sldGreen.setPaintTicks(true);
        sldGreen.setValue(0);

        sldBlue.setMajorTickSpacing(50);
        sldBlue.setMaximum(255);
        sldBlue.setMinorTickSpacing(10);
        sldBlue.setPaintLabels(true);
        sldBlue.setPaintTicks(true);
        sldBlue.setValue(0);

        jTxtRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRedActionPerformed(evt);
            }
        });
        jTxtRed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtRedKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtRedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtRedKeyTyped(evt);
            }
        });

        jTxtGreen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtGreenKeyReleased(evt);
            }
        });

        jTxtBlue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtBlueKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addComponent(jTxtRed, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldRed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(sldGreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sldBlue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRedActionPerformed
    }//GEN-LAST:event_jTxtRedActionPerformed

    private void jTxtRedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtRedKeyTyped
  
    }//GEN-LAST:event_jTxtRedKeyTyped

    private void jTxtRedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtRedKeyReleased
        try {
            int value = Integer.parseInt(jTxtRed.getText());
            if (value > 255 || value < 0) {
                getToolkit().beep();
                jTxtRed.setText("");
            }
        } catch (Exception e) {
            getToolkit().beep();
            jTxtRed.setText("");
        }
    }//GEN-LAST:event_jTxtRedKeyReleased

    private void jTxtRedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtRedKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRedKeyPressed

    private void jTxtGreenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtGreenKeyReleased
        try {
                int value = Integer.parseInt(jTxtGreen.getText());
                if (value > 255 || value < 0) {
                    getToolkit().beep();
                    jTxtGreen.setText("");
                }
            } catch (Exception e) {
                getToolkit().beep();
                jTxtGreen.setText("");
            }
    }//GEN-LAST:event_jTxtGreenKeyReleased

    private void jTxtBlueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBlueKeyReleased
        try {
                int value = Integer.parseInt(jTxtBlue.getText());
                if (value > 255 || value < 0) {
                    getToolkit().beep();
                    jTxtBlue.setText("");
                }
            } catch (Exception e) {
                getToolkit().beep();
                jTxtBlue.setText("");
            }
    }//GEN-LAST:event_jTxtBlueKeyReleased

     public void fireColorEvent() {
        fireColorEvent(new ColorEvent(this, new Color(sldRed.getValue(), sldGreen.getValue(), sldBlue.getValue())));
    }
    
    public void addColorListener(ColorListener listener) {
        listeners.add(listener);
    }

    public void removeColorListener(ColorListener listener) {
        listeners.remove(listener);
    }

    private void fireColorEvent(ColorEvent colorEvent) {
        ArrayList copy = (ArrayList) listeners.clone();
        int size = copy.size();
        for (int i = 0; i < size; i++) {
            ColorListener colorListener = (ColorListener) copy.get(i);
            colorListener.changeColor(colorEvent);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTxtBlue;
    private javax.swing.JTextField jTxtGreen;
    private javax.swing.JTextField jTxtRed;
    private javax.swing.JSlider sldBlue;
    private javax.swing.JSlider sldGreen;
    private javax.swing.JSlider sldRed;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent e) {

        int r = sldRed.getValue();
        int g = sldGreen.getValue();
        int b = sldBlue.getValue();

        Color color = new Color(r, g, b);
        jTxtRed.setText(String.valueOf(r));
        jTxtGreen.setText(String.valueOf(g));
        jTxtBlue.setText(String.valueOf(b));
        fireColorEvent(new ColorEvent(this, color));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int r = Integer.parseInt(jTxtRed.getText());
            sldRed.setValue(r);
            int g = Integer.parseInt(jTxtGreen.getText());
            sldGreen.setValue(g);
            int b = Integer.parseInt(jTxtBlue.getText());
            sldBlue.setValue(b);
            Color color = new Color(r, g, b);
            fireColorEvent(new ColorEvent(this, color));
        } catch (NumberFormatException ex) {
            System.out.print("Invalid input. Please enter a valid integer.");
        }

    }
}
