import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import javax.swing.*;

import static java.lang.Double.parseDouble;
import static javax.swing.SwingUtilities.invokeLater;

public class ConvertronJFrame extends JFrame {
    
    static NumberFormat nf = NumberFormat.getNumberInstance();
    
    public ConvertronJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new JButton();
        btnClear = new JButton();
        btnCalculate = new JButton();
        txtInput = new JTextField();
        cbxFrom = new JComboBox<>();
        cbxTo = new JComboBox<>();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        txtOutput = new JTextField();
        cbxType = new JComboBox<>();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertron-1.0");
        setIconImage(new ImageIcon("blacksheep.png").getImage());
        setLocationByPlatform(true);
        setName("Conversion App"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(300, 400));

        btnClose.setText("Close");
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        btnClose.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                btnCloseKeyPressed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        btnClear.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                btnClearKeyPressed(evt);
            }
        });

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        btnCalculate.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                btnCalculateKeyPressed(evt);
            }
        });

        txtInput.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtInput.setHorizontalAlignment(JTextField.CENTER);
        txtInput.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtInputKeyPressed(evt);
            }
        });

        cbxFrom.setModel(new DefaultComboBoxModel<>(new String[] { "..." }));
        cbxFrom.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                cbxFromKeyPressed(evt);
            }
        });

        cbxTo.setModel(new DefaultComboBoxModel<>(new String[] { "..." }));
        cbxTo.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                cbxToKeyPressed(evt);
            }
        });

        jLabel1.setText("From");

        jLabel2.setText("To");

        txtOutput.setEditable(false);
        txtOutput.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtOutput.setHorizontalAlignment(JTextField.CENTER);
        txtOutput.setFocusable(false);

        cbxType.setModel(new DefaultComboBoxModel<>(new String[] { "Select Measurement", "Distance", "Weight", "Volume", "Temperature" }));
        cbxType.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                cbxTypeItemStateChanged(evt);
            }
        });
        cbxType.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                cbxTypeKeyPressed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInput, GroupLayout.Alignment.LEADING)
                    .addComponent(txtOutput)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(cbxFrom, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxTo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)))
                        .addGap(41, 41, 41)))
                .addGap(25, 25, 25))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbxType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnCalculate)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(cbxType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInput, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFrom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(txtOutput, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnClear)
                    .addComponent(btnCalculate))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        preformCalculation();
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnClearActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtInput.setText("");
        txtOutput.setText("");
        cbxFrom.setSelectedIndex(0);
        cbxTo.setSelectedIndex(0);
        txtInput.requestFocus();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void cbxTypeItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_cbxTypeItemStateChanged
        if (cbxType.getSelectedIndex() == 1) {
            cbxFrom.setModel(new DefaultComboBoxModel<>(new String[] 
                { "...", "Kilometers", "Meters", "Centimeters", "Miles", "Yards", "Feet", "Inches" }));
            cbxTo.setModel(new DefaultComboBoxModel<>(new String[] 
                { "...", "Kilometers", "Meters", "Centimeters", "Miles", "Yards", "Feet", "Inches" }));
        }
        if (cbxType.getSelectedIndex() == 2) {
            cbxFrom.setModel(new DefaultComboBoxModel<>(new String[] 
                { "...", "Kilograms", "Grams", "Milligrams", "Pounds", "Ounces" }));
            cbxTo.setModel(new DefaultComboBoxModel<>(new String[] 
                { "...", "Kilograms", "Grams", "Milligrams", "Pounds", "Ounces" }));
        }
        if (cbxType.getSelectedIndex() == 3) {
            cbxFrom.setModel(new DefaultComboBoxModel<>(new String[] 
                { "...", "Liters", "Milliliters", "Gallons (US)", "Quarts" }));
            cbxTo.setModel(new DefaultComboBoxModel<>(new String[] 
                { "...", "Liters", "Milliliters", "Gallons (US)", "Quarts" }));
        }
        if (cbxType.getSelectedIndex() == 4) {
            cbxFrom.setModel(new DefaultComboBoxModel<>(new String[] 
                { "...", "Celsius", "Fahrenheit" }));
            cbxTo.setModel(new DefaultComboBoxModel<>(new String[] 
                { "...", "Celsius", "Fahrenheit" }));
        }
    }//GEN-LAST:event_cbxTypeItemStateChanged

    private void btnCalculateKeyPressed(KeyEvent evt) {//GEN-FIRST:event_btnCalculateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            preformCalculation();
    }//GEN-LAST:event_btnCalculateKeyPressed

    private void btnClearKeyPressed(KeyEvent evt) {//GEN-FIRST:event_btnClearKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtInput.setText("");
            txtOutput.setText("");
            cbxFrom.setSelectedIndex(0);
            cbxTo.setSelectedIndex(0);
            txtInput.requestFocus();
        }
    }//GEN-LAST:event_btnClearKeyPressed

    private void btnCloseKeyPressed(KeyEvent evt) {//GEN-FIRST:event_btnCloseKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            this.dispose();
    }//GEN-LAST:event_btnCloseKeyPressed

    private void txtInputKeyPressed(KeyEvent evt) {//GEN-FIRST:event_txtInputKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            preformCalculation();
    }//GEN-LAST:event_txtInputKeyPressed

    private void cbxTypeKeyPressed(KeyEvent evt) {//GEN-FIRST:event_cbxTypeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
            if (!cbxType.isPopupVisible())
                invokeLater(cbxType::showPopup);
        
    }//GEN-LAST:event_cbxTypeKeyPressed

    private void cbxFromKeyPressed(KeyEvent evt) {//GEN-FIRST:event_cbxFromKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
            if (!cbxFrom.isPopupVisible()) 
                invokeLater(cbxFrom::showPopup);   
        
    }//GEN-LAST:event_cbxFromKeyPressed

    private void cbxToKeyPressed(KeyEvent evt) {//GEN-FIRST:event_cbxToKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
            if (!cbxTo.isPopupVisible())
                invokeLater(cbxTo::showPopup); 
        
    }//GEN-LAST:event_cbxToKeyPressed

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertronJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        invokeLater(() -> {
            new ConvertronJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnCalculate;
    private JButton btnClear;
    private JButton btnClose;
    private JComboBox<String> cbxFrom;
    private JComboBox<String> cbxTo;
    private JComboBox<String> cbxType;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JTextField txtInput;
    private JTextField txtOutput;
    // End of variables declaration//GEN-END:variables

    private void preformCalculation() {
        if (cbxType.getSelectedIndex() == 0) {
            txtOutput.setText("select a measurement type");
            cbxType.requestFocus();
        } else if (cbxFrom.getSelectedIndex() == 0) {
            txtOutput.setText("select a \'From\' measurement");
            cbxFrom.requestFocus();
        } else if (cbxTo.getSelectedIndex() == 0) { 
            txtOutput.setText("select a \'To\' measurement");
            cbxTo.requestFocus();
        } else {
        
            try {
                double input = parseDouble(txtInput.getText());

                switch (cbxType.getSelectedIndex()) {
                    
                    case 1: // Distance
                        
                        switch (cbxFrom.getSelectedIndex()) {
                        
                            case 1: // Kilometers
                            
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input) + "km");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input * 1000) + "m");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input * 100000) + "cm");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input / 1.60934) + "mi");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input * 1093.61) + "yd");
                                if (cbxTo.getSelectedIndex() == 6)
                                    txtOutput.setText(nf.format(input * 3280.84) + "ft");
                                if (cbxTo.getSelectedIndex() == 7)
                                    txtOutput.setText(nf.format(input * 39370.1) + "in");
                                break;
                                
                            case 2: // Meters
                                
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input / 1000) + "km");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input) + "m");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input * 100) + "cm");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input / 1609.34) + "mi");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input * 1.09361) + "yd");
                                if (cbxTo.getSelectedIndex() == 6)
                                    txtOutput.setText(nf.format(input * 3.28084) + "ft");
                                if (cbxTo.getSelectedIndex() == 7)
                                    txtOutput.setText(nf.format(input * 39.3701) + "in");
                                break;
                                
                            case 3: // Centimeters
                                
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input / 100000) + "km");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input / 100) + "m");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input) + "cm");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input / 160934) + "mi");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input / 91.44) + "yd");
                                if (cbxTo.getSelectedIndex() == 6)
                                    txtOutput.setText(nf.format(input / 30.48) + "ft");
                                if (cbxTo.getSelectedIndex() == 7)
                                    txtOutput.setText(nf.format(input / 2.54) + "in");
                                break;
                                
                            case 4: // Miles
                                
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input * 1.60934) + "km");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input * 1609.34) + "m");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input * 160934) + "cm");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input) + "mi");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input * 1760) + "yd");
                                if (cbxTo.getSelectedIndex() == 6)
                                    txtOutput.setText(nf.format(input * 5280) + "ft");
                                if (cbxTo.getSelectedIndex() == 7)
                                    txtOutput.setText(nf.format(input * 63360) + "in");
                                break;
                                
                            case 5: // Yards
                                
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input / 1093.61) + "km");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input / 1.09361) + "m");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input * 91.44) + "cm");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input / 1760) + "mi");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input) + "yd");
                                if (cbxTo.getSelectedIndex() == 6)
                                    txtOutput.setText(nf.format(input * 3) + "ft");
                                if (cbxTo.getSelectedIndex() == 7)
                                    txtOutput.setText(nf.format(input * 36) + "in");
                                break;
                                
                            case 6: // Feet
                                
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input / 3280.84) + "km");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input / 3.28084) + "m");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input * 30.48) + "cm");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input / 5280) + "mi");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input / 3) + "yd");
                                if (cbxTo.getSelectedIndex() == 6)
                                    txtOutput.setText(nf.format(input) + "ft");
                                if (cbxTo.getSelectedIndex() == 7)
                                    txtOutput.setText(nf.format(input * 12) + "in");
                                break;
                                
                            case 7: // Inches
                                
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input / 39370.1) + "km");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input / 39.3701) + "m");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input * 2.54) + "cm");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input / 63360) + "mi");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input / 36) + "yd");
                                if (cbxTo.getSelectedIndex() == 6)
                                    txtOutput.setText(nf.format(input / 12) + "ft");
                                if (cbxTo.getSelectedIndex() == 7)
                                    txtOutput.setText(nf.format(input) + "in");
                                break;
                        }
                        
                        btnClose.requestFocus();
                        break;
                
                    case 2: // Weight
                        
                        switch (cbxFrom.getSelectedIndex()) {
                        
                            case 1: // Kilograms
                            
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input) + "kg");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input * 1000) + "g");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input * 100000) + "mg");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input * 2.20462) + "lbs");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input * 35.274) + "oz");
                                break;
                                
                            case 2: // grams
                                
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input / 1000) + "kg");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input) + "g");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input * 100) + "mg");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input / 453.592) + "lbs");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input / 28.3495) + "oz");
                                break;
                                
                            case 3: // pounds
                                
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input / 2.20462) + "kg");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input * 453.592) + "g");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input * 453592) + "mg");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input) + "lbs");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input * 16) + "oz");
                                break;
                                
                            case 4: // ounces
                                
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input / 35.274) + "kg");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input * 28.3495) + "g");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input * 453592) + "mg");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input / 16) + "lbs");
                                if (cbxTo.getSelectedIndex() == 5)
                                    txtOutput.setText(nf.format(input) + "oz");
                                break;
                        }
                        
                        btnClose.requestFocus();
                        break;
                
                    case 3: // Volume
                        switch (cbxFrom.getSelectedIndex()) {

                            case 1:
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input) + "L");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input * 1000) + "ml");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input / 3.78541) + "gal");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input * 1.05669) + "qt");
                                break;
                                
                            case 2:
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input / 1000) + "L");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input) + "ml");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input / 3785.41) + "gal");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input / 946.353) + "qt");
                                break;
                                
                            case 3:
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input * 3.78541) + "L");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input * 3785.41) + "ml");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input) + "gal");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input * 4) + "qt");
                                break;
                                
                            case 4:
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input / 1.05669) + "L");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input * 946.353) + "ml");
                                if (cbxTo.getSelectedIndex() == 3)
                                    txtOutput.setText(nf.format(input / 4) + "gal");
                                if (cbxTo.getSelectedIndex() == 4)
                                    txtOutput.setText(nf.format(input) + "qt");
                                break;
                                
                        }
                        btnClose.requestFocus();
                        break;
                
                    case 4: // Temperature
                        
                        switch (cbxFrom.getSelectedIndex()) {

                            case 1:
                        
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format(input) + "*C");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input * 1.8 + 32) + "*F");
                                break;
                            
                            case 2:
                                
                                if (cbxTo.getSelectedIndex() == 1)
                                    txtOutput.setText(nf.format((input - 32) / 1.8) + "*C");
                                if (cbxTo.getSelectedIndex() == 2)
                                    txtOutput.setText(nf.format(input) + "*F");
                                break;
                        }
                        
                        btnClose.requestFocus();
                        break;
                }
                
            } catch (NumberFormatException ex) {
                txtOutput.setText("enter a value to convert");
                txtInput.requestFocus();
            }
        }
    }

}

