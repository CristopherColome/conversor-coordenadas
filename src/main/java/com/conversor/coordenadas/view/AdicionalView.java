/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conversor.coordenadas.view;

import javax.swing.JPanel;

/**
 *
 * @author ccolome
 */
public class AdicionalView extends JPanel {

    public AdicionalView() {
        initComponents();
    }

    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        seleccionDatumLabel = new javax.swing.JLabel();
        seleccionDatumComboBox = new javax.swing.JComboBox<>();
        j1Separator = new javax.swing.JSeparator();
        coodernadaIn1Label = new javax.swing.JLabel();
        coodernadaIn2Label = new javax.swing.JLabel();
        coodernadaIn3Label = new javax.swing.JLabel();
        coodernadaOut1Label = new javax.swing.JLabel();
        coodernadaOut2Label = new javax.swing.JLabel();
        seleccionTipoCoordenadaLabel = new javax.swing.JLabel();
        coodernadaOut3Label = new javax.swing.JLabel();
        seleccionTipoCoordenadaComboBox = new javax.swing.JComboBox<>();
        coodernadaIn1TextField = new javax.swing.JTextField();
        coodernadaIn2TextField = new javax.swing.JTextField();
        coodernadaIn3TextField = new javax.swing.JTextField();
        coodernadaOut1TextField = new javax.swing.JTextField();
        coodernadaOut2TextField = new javax.swing.JTextField();
        coodernadaOut3TextField = new javax.swing.JTextField();
        inLabel = new javax.swing.JLabel();
        outLabel = new javax.swing.JLabel();
        convertirButton = new javax.swing.JButton();
        validacionLabel = new javax.swing.JLabel();
        seleccionCalculoLabel = new javax.swing.JLabel();
        seleccionCalculoComboBox = new javax.swing.JComboBox<>();
        j2Separator = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoTextArea = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(598, 455));

        principalPanel.setPreferredSize(new java.awt.Dimension(598, 455));

        seleccionDatumLabel.setText("Seleccione datum:");

        seleccionDatumComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WGS 84" }));

        j1Separator.setBackground(new java.awt.Color(160, 180, 220));
        j1Separator.setForeground(new java.awt.Color(160, 180, 220));

        coodernadaIn1Label.setText("Latitud(φ):");

        coodernadaIn2Label.setText("Longitud(λ):");

        coodernadaIn3Label.setText("Altura(h)");

        coodernadaOut1Label.setText("Latitud(φ):");

        coodernadaOut2Label.setText("Longitud(λ):");

        seleccionTipoCoordenadaLabel.setText("Seleccione tipo de coordenada:");

        coodernadaOut3Label.setText("Altura(h)");

        seleccionTipoCoordenadaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geodésica", "Geocentrica" }));
        seleccionTipoCoordenadaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionTipoCoordenadaComboBoxActionPerformed(evt);
            }
        });

        coodernadaIn1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coodernadaIn1TextFieldActionPerformed(evt);
            }
        });

        coodernadaOut1TextField.setEditable(false);

        coodernadaOut2TextField.setEditable(false);

        coodernadaOut3TextField.setEditable(false);
        coodernadaOut3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coodernadaOut3TextFieldActionPerformed(evt);
            }
        });

        inLabel.setText("Coordenada 1");

        outLabel.setText("Coordenada 2");

        convertirButton.setText("Convertir");

        validacionLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        validacionLabel.setForeground(new java.awt.Color(250, 50, 50));
        validacionLabel.setText("Mensaje:             ");

        seleccionCalculoLabel.setText("Seleccione cálculo:");

        seleccionCalculoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distancia" }));
        seleccionCalculoComboBox.setToolTipText("");

        j2Separator.setBackground(new java.awt.Color(160, 180, 220));
        j2Separator.setForeground(new java.awt.Color(160, 180, 220));
        j2Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        resultadoTextArea.setColumns(20);
        resultadoTextArea.setRows(5);
        resultadoTextArea.setMinimumSize(new java.awt.Dimension(10, 15));
        jScrollPane1.setViewportView(resultadoTextArea);

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(coodernadaIn3Label)
                                            .addComponent(coodernadaIn1Label))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(coodernadaIn3TextField)
                                            .addComponent(coodernadaIn1TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(principalPanelLayout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(inLabel))
                                    .addGroup(principalPanelLayout.createSequentialGroup()
                                        .addComponent(coodernadaIn2Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                        .addComponent(coodernadaIn2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(principalPanelLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(principalPanelLayout.createSequentialGroup()
                                                .addComponent(coodernadaOut3Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(coodernadaOut3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(principalPanelLayout.createSequentialGroup()
                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(coodernadaOut1Label)
                                                    .addComponent(coodernadaOut2Label))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(coodernadaOut1TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(coodernadaOut2TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(outLabel)
                                        .addGap(94, 94, 94))))
                            .addComponent(j1Separator)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seleccionTipoCoordenadaLabel)
                                    .addComponent(seleccionDatumLabel)
                                    .addComponent(seleccionCalculoLabel))
                                .addGap(38, 38, 38)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seleccionDatumComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seleccionTipoCoordenadaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seleccionCalculoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                        .addComponent(validacionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(convertirButton)))
                .addContainerGap())
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(principalPanelLayout.createSequentialGroup()
                    .addGap(294, 294, 294)
                    .addComponent(j2Separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(301, Short.MAX_VALUE)))
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionTipoCoordenadaLabel)
                    .addComponent(seleccionTipoCoordenadaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionDatumLabel)
                    .addComponent(seleccionDatumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionCalculoLabel)
                    .addComponent(seleccionCalculoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(j1Separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inLabel)
                            .addComponent(outLabel))
                        .addGap(33, 33, 33)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coodernadaIn1Label)
                            .addComponent(coodernadaIn1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coodernadaOut1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coodernadaOut1Label))))
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coodernadaOut2Label)
                            .addComponent(coodernadaOut2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(coodernadaOut3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coodernadaIn2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coodernadaIn2Label))
                        .addGap(18, 18, 18)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coodernadaIn3Label)
                            .addComponent(coodernadaIn3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coodernadaOut3Label))))
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(validacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(convertirButton)))
                .addContainerGap())
            .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(principalPanelLayout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addComponent(j2Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(133, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>                        

    private void seleccionTipoCoordenadaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                                
        // TODO add your handling code here:
    }                                                               

    private void coodernadaIn1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void coodernadaOut3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       


    // Variables declaration - do not modify                     
 private javax.swing.JButton convertirButton;
    private javax.swing.JLabel coodernadaIn1Label;
    private javax.swing.JTextField coodernadaIn1TextField;
    private javax.swing.JLabel coodernadaIn2Label;
    private javax.swing.JTextField coodernadaIn2TextField;
    private javax.swing.JLabel coodernadaIn3Label;
    private javax.swing.JTextField coodernadaIn3TextField;
    private javax.swing.JLabel coodernadaOut1Label;
    private javax.swing.JTextField coodernadaOut1TextField;
    private javax.swing.JLabel coodernadaOut2Label;
    private javax.swing.JTextField coodernadaOut2TextField;
    private javax.swing.JLabel coodernadaOut3Label;
    private javax.swing.JTextField coodernadaOut3TextField;
    private javax.swing.JLabel inLabel;
    private javax.swing.JSeparator j1Separator;
    private javax.swing.JSeparator j2Separator;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel outLabel;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JTextArea resultadoTextArea;
    private javax.swing.JComboBox<String> seleccionCalculoComboBox;
    private javax.swing.JLabel seleccionCalculoLabel;
    private javax.swing.JComboBox<String> seleccionDatumComboBox;
    private javax.swing.JLabel seleccionDatumLabel;
    private javax.swing.JComboBox<String> seleccionTipoCoordenadaComboBox;
    private javax.swing.JLabel seleccionTipoCoordenadaLabel;
    private javax.swing.JLabel validacionLabel;
}
