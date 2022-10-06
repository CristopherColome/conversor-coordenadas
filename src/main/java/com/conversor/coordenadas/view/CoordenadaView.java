/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conversor.coordenadas.view;

import com.conversor.coordenadas.controller.CoordenadaController;
import com.conversor.coordenadas.model.Coordenada;
import com.conversor.coordenadas.model.Datum;
import com.conversor.coordenadas.model.SistemaGeocentrico;
import com.conversor.coordenadas.model.SistemaGeodesico;

import javax.swing.JPanel;
import java.util.Arrays;

/**
 *
 * @author ccolome
 */
public class CoordenadaView extends JPanel {

    public CoordenadaView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        seleccionDatumLabel = new javax.swing.JLabel();
        seleccionDatumComboBox = new javax.swing.JComboBox<>();
        j1Separator = new javax.swing.JSeparator();
        j2Separator = new javax.swing.JSeparator();

        coordenadaIn1Label = new javax.swing.JLabel();
        coordenadaIn2Label = new javax.swing.JLabel();
        coordenadaIn3Label = new javax.swing.JLabel();

        coordenadaOut1Label = new javax.swing.JLabel();
        coordenadaOut2Label = new javax.swing.JLabel();
        coordenadaOut3Label = new javax.swing.JLabel();

        seleccionTipoCoordenadaLabel = new javax.swing.JLabel();
        seleccionTipoCoordenadaComboBox = new javax.swing.JComboBox<>();

        coordenadaIn1TextField = new javax.swing.JTextField();
        coordenadaIn2TextField = new javax.swing.JTextField();
        coordenadaIn3TextField = new javax.swing.JTextField();

        coordenadaOut1TextField = new javax.swing.JTextField();
        coordenadaOut2TextField = new javax.swing.JTextField();
        coordenadaOut3TextField = new javax.swing.JTextField();

        inLabel = new javax.swing.JLabel();
        outLabel = new javax.swing.JLabel();

        convertirButton = new javax.swing.JButton();
        validacionLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(598, 455));

        principalPanel.setPreferredSize(new java.awt.Dimension(598, 455));

        seleccionDatumLabel.setText("Seleccione datum:");

        seleccionDatumComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                Arrays.stream(Datum.Sistema.values())
                        .map(Datum.Sistema::getLabel)
                        .toList()
                        .toArray(new String[Datum.Sistema.values().length])
        ));

        j1Separator.setBackground(new java.awt.Color(160, 180, 220));
        j1Separator.setForeground(new java.awt.Color(160, 180, 220));

        j2Separator.setBackground(new java.awt.Color(160, 180, 220));
        j2Separator.setForeground(new java.awt.Color(160, 180, 220));
        j2Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        coordenadaIn1Label.setText("Latitud(φ):");

        coordenadaIn2Label.setText("Longitud(λ):");

        coordenadaIn3Label.setText("Altura(h)");

        coordenadaOut1Label.setText("Eje(X):");

        coordenadaOut2Label.setText("Eje(Y):");

        coordenadaOut3Label.setText("Eje(Z):");

        seleccionTipoCoordenadaLabel.setText("Seleccione tipo de conversión:");

        coordenadaOut1TextField.setEditable(false);

        coordenadaOut2TextField.setEditable(false);

        coordenadaOut3TextField.setEditable(false);

        seleccionTipoCoordenadaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                Arrays.stream(Coordenada.Conversion.values())
                        .map(Coordenada.Conversion::getLabel)
                        .toList()
                        .toArray(new String[Coordenada.Conversion.values().length])
        ));

        seleccionTipoCoordenadaComboBox.addActionListener(this::seleccionTipoCoordenadaComboBoxActionPerformed);

        inLabel.setText("Entrada");

        outLabel.setText("Salida");

        convertirButton.setText("Convertir");
        convertirButton.addActionListener(this::convertirButtonActionPerformed);

        validacionLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        validacionLabel.setForeground(new java.awt.Color(250, 50, 50));
        validacionLabel.setText("Mensaje:             ");
        validacionLabel.setVisible(false);

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(inLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(coordenadaIn2Label)
                                    .addComponent(coordenadaIn3Label)
                                    .addComponent(coordenadaIn1Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(coordenadaIn3TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(coordenadaIn2TextField)
                                    .addComponent(coordenadaIn1TextField, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j2Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(coordenadaOut3Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(coordenadaOut3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(principalPanelLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(coordenadaOut2Label))
                                    .addComponent(coordenadaOut1Label))
                                .addGap(54, 54, 54)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(principalPanelLayout.createSequentialGroup()
                                        .addComponent(outLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(coordenadaOut1TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(coordenadaOut2TextField, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j1Separator)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seleccionTipoCoordenadaLabel)
                                    .addComponent(seleccionDatumLabel))
                                .addGap(38, 38, 38)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seleccionDatumComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seleccionTipoCoordenadaComboBox, 0, 388, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                        .addComponent(validacionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(convertirButton)))
                .addContainerGap())
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
                .addGap(26, 26, 26)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addComponent(j1Separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(inLabel)
                                .addGap(33, 33, 33)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coordenadaIn1Label)
                                    .addComponent(coordenadaIn1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(outLabel)
                                .addGap(30, 30, 30)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coordenadaOut1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coordenadaOut1Label))))
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coordenadaOut2Label)
                                    .addComponent(coordenadaOut2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coordenadaIn2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coordenadaIn2Label))))
                        .addGap(44, 44, 44)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coordenadaIn3Label)
                                    .addComponent(coordenadaIn3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(coordenadaOut3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coordenadaOut3Label)))))
                    .addComponent(j2Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addComponent(convertirButton)
                        .addContainerGap())
                    .addComponent(validacionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
    }
    // </editor-fold>

    private void seleccionTipoCoordenadaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        Coordenada.Conversion tipoConversion = getTipoConversion();
        if(tipoConversion != null){
            switch (tipoConversion){
                case GEODESICA_TO_GEOCENTRICA -> {
                    coordenadaIn1Label.setText("Latitud(φ):");
                    coordenadaIn2Label.setText("Longitud(λ):");
                    coordenadaIn3Label.setText("Altura(h)");
                    coordenadaOut1Label.setText("Eje(X):");
                    coordenadaOut2Label.setText("Eje(Y):");
                    coordenadaOut3Label.setText("Eje(Z):");
                }
                case GEOCENTRICA_TO_GEODESICA -> {

                    coordenadaIn1Label.setText("Eje(X):");
                    coordenadaIn2Label.setText("Eje(Y):");
                    coordenadaIn3Label.setText("Eje(Z):");
                    coordenadaOut1Label.setText("Latitud(φ):");
                    coordenadaOut2Label.setText("Longitud(λ):");
                    coordenadaOut3Label.setText("Altura(h)");
                }
            }
            coordenadaIn2TextField.setText("");
            coordenadaIn1TextField.setText("");
            coordenadaIn3TextField.setText("");
            coordenadaOut2TextField.setText("");
            coordenadaOut1TextField.setText("");
            coordenadaOut3TextField.setText("");

            validacionLabel.setText("");
            validacionLabel.setVisible(false);
        }
    }                                                               

    private void convertirButtonActionPerformed(java.awt.event.ActionEvent evt) {

        Coordenada.Conversion tipoConversion = getTipoConversion();
        validarFormulario();
        if(tipoConversion != null){
            switch (tipoConversion){
                case GEODESICA_TO_GEOCENTRICA -> {
                    this.geodesicaToGeocentrica();
                }
                case GEOCENTRICA_TO_GEODESICA -> {
                    this.geocentricaToGeodesica();
                }
            }
        }
    }

    private void geodesicaToGeocentrica(){
        try {

            SistemaGeodesico sistemaGeodesico = new SistemaGeodesico();
            sistemaGeodesico.setDatum(getSistemaConversion().load());

            double latitud = Double.parseDouble(coordenadaIn1TextField.getText().trim());
            double longitud = Double.parseDouble(coordenadaIn2TextField.getText().trim());
            double altura = Double.parseDouble(coordenadaIn3TextField.getText().trim());

            sistemaGeodesico.setLatitud(latitud);
            sistemaGeodesico.setLongitud(longitud);
            sistemaGeodesico.setAltura(altura);

            CoordenadaController coordenadaController = new CoordenadaController(
                    sistemaGeodesico
            );
            SistemaGeocentrico sistemaGeocentrico = coordenadaController.geodesicaToGeocentrica();

            coordenadaOut1TextField.setText(
                    String.valueOf(sistemaGeocentrico.getX())
            );
            coordenadaOut2TextField.setText(
                    String.valueOf(
                            sistemaGeocentrico.getY()
                    )
            );
            coordenadaOut3TextField.setText(
                    String.valueOf(
                            sistemaGeocentrico.getZ()
                    )
            );
        } catch (NumberFormatException e){
            validacionLabel.setText("Mensaje: Ingrese valores validos.");
            validacionLabel.setVisible(true);
        }
    }

    private void geocentricaToGeodesica(){
        try {

            SistemaGeocentrico sistemaGeocentrico = new SistemaGeocentrico();
            sistemaGeocentrico.setDatum(getSistemaConversion().load());

            sistemaGeocentrico.setX(
                    Double.parseDouble(coordenadaIn1TextField.getText().trim())
            );
            sistemaGeocentrico.setY(
                    Double.parseDouble(coordenadaIn2TextField.getText().trim())
            );
            sistemaGeocentrico.setZ(
                    Double.parseDouble(coordenadaIn3TextField.getText().trim())
            );

            CoordenadaController coordenadaController = new CoordenadaController(
                    sistemaGeocentrico
            );
            SistemaGeodesico sistemaGeodesico = coordenadaController.geocentricoToGeodesico();

            coordenadaOut1TextField.setText(
                    String.valueOf(sistemaGeodesico.getLatitud())
            );
            coordenadaOut2TextField.setText(
                    String.valueOf(
                            sistemaGeodesico.getLongitud()
                    )
            );
            coordenadaOut3TextField.setText(
                    String.valueOf(
                            sistemaGeodesico.getAltura()
                    )
            );

        } catch (NumberFormatException e){
            validacionLabel.setText("Mensaje: Ingrese valores validos.");
            validacionLabel.setVisible(true);
        }
    }

    private Coordenada.Conversion getTipoConversion(){
        return Coordenada.Conversion.valorOf(
                (String) seleccionTipoCoordenadaComboBox.getSelectedItem()
        );
    }

    private Datum.Sistema getSistemaConversion(){
        return Datum.Sistema.valorOf(
                (String) seleccionDatumComboBox.getSelectedItem()
        );
    }

    private void validarFormulario(){
        boolean camposVacios = coordenadaIn1TextField.getText().trim().equals("") ||
                coordenadaIn2TextField.getText().trim().equals("") ||
        coordenadaIn3TextField.getText().trim().equals("");
        
        if(camposVacios){
            validacionLabel.setText("Mensaje: Ingrese todos los valores.");
            validacionLabel.setVisible(true);
        } else {
            validacionLabel.setText("");
            validacionLabel.setVisible(false);
        }
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton convertirButton;
    private javax.swing.JLabel coordenadaIn1Label;
    private javax.swing.JTextField coordenadaIn1TextField;
    private javax.swing.JLabel coordenadaIn2Label;
    private javax.swing.JTextField coordenadaIn2TextField;
    private javax.swing.JLabel coordenadaIn3Label;
    private javax.swing.JTextField coordenadaIn3TextField;
    private javax.swing.JLabel coordenadaOut1Label;
    private javax.swing.JTextField coordenadaOut1TextField;
    private javax.swing.JLabel coordenadaOut2Label;
    private javax.swing.JTextField coordenadaOut2TextField;
    private javax.swing.JLabel coordenadaOut3Label;
    private javax.swing.JTextField coordenadaOut3TextField;
    private javax.swing.JLabel inLabel;
    private javax.swing.JSeparator j1Separator;
    private javax.swing.JSeparator j2Separator;
    private javax.swing.JLabel outLabel;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JComboBox<String> seleccionDatumComboBox;
    private javax.swing.JLabel seleccionDatumLabel;
    private javax.swing.JComboBox<String> seleccionTipoCoordenadaComboBox;
    private javax.swing.JLabel seleccionTipoCoordenadaLabel;
    private javax.swing.JLabel validacionLabel;
}
