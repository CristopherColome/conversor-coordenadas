/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conversor.coordenadas.view;

import com.conversor.coordenadas.controller.AdicionalController;
import com.conversor.coordenadas.controller.CoordenadaController;
import com.conversor.coordenadas.model.Coordenada;
import com.conversor.coordenadas.model.Datum;
import com.conversor.coordenadas.model.SistemaGeocentrico;
import com.conversor.coordenadas.model.SistemaGeodesico;

import javax.swing.JPanel;
import java.util.Arrays;

/**
 * @author ccolome
 */
public class AdicionalView extends JPanel {

    public AdicionalView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        seleccionDatumLabel = new javax.swing.JLabel();
        seleccionDatumComboBox = new javax.swing.JComboBox<>();

        j1Separator = new javax.swing.JSeparator();

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
        seleccionCalculoLabel = new javax.swing.JLabel();
        seleccionCalculoComboBox = new javax.swing.JComboBox<>();
        j2Separator = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoTextArea = new javax.swing.JTextArea();

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

        coordenadaIn1Label.setText("Latitud(φ):");

        coordenadaIn2Label.setText("Longitud(λ):");

        coordenadaIn3Label.setText("Altura(h)");

        coordenadaOut1Label.setText("Latitud(φ):");

        coordenadaOut2Label.setText("Longitud(λ):");

        seleccionTipoCoordenadaLabel.setText("Seleccione tipo de coordenada:");

        coordenadaOut3Label.setText("Altura(h)");

        seleccionTipoCoordenadaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                Arrays.stream(Coordenada.Tipo.values())
                        .map(Coordenada.Tipo::getLabel)
                        .toList()
                        .toArray(new String[Coordenada.Tipo.values().length])
        ));

        seleccionTipoCoordenadaComboBox.addActionListener(this::seleccionTipoCoordenadaComboBoxActionPerformed);

        inLabel.setText("Coordenada 1");

        outLabel.setText("Coordenada 2");

        convertirButton.setText("Convertir");
        convertirButton.addActionListener(this::convertirButtonActionPerformed);

        validacionLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        validacionLabel.setForeground(new java.awt.Color(250, 50, 50));
        validacionLabel.setText("Mensaje:             ");
        validacionLabel.setVisible(false);

        seleccionCalculoLabel.setText("Seleccione cálculo:");

        seleccionCalculoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Distancia"}));
        seleccionCalculoComboBox.setToolTipText("");

        j2Separator.setBackground(new java.awt.Color(160, 180, 220));
        j2Separator.setForeground(new java.awt.Color(160, 180, 220));
        j2Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        resultadoTextArea.setColumns(20);
        resultadoTextArea.setRows(5);
        resultadoTextArea.setMinimumSize(new java.awt.Dimension(10, 15));
        resultadoTextArea.setEditable(false);
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
                                                                                        .addComponent(coordenadaIn3Label)
                                                                                        .addComponent(coordenadaIn1Label))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(coordenadaIn3TextField)
                                                                                        .addComponent(coordenadaIn1TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(principalPanelLayout.createSequentialGroup()
                                                                                .addGap(92, 92, 92)
                                                                                .addComponent(inLabel))
                                                                        .addGroup(principalPanelLayout.createSequentialGroup()
                                                                                .addComponent(coordenadaIn2Label)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                                                                .addComponent(coordenadaIn2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(principalPanelLayout.createSequentialGroup()
                                                                                .addGap(30, 30, 30)
                                                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(principalPanelLayout.createSequentialGroup()
                                                                                                .addComponent(coordenadaOut3Label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(coordenadaOut3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(principalPanelLayout.createSequentialGroup()
                                                                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(coordenadaOut1Label)
                                                                                                        .addComponent(coordenadaOut2Label))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                                                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addComponent(coordenadaOut1TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                        .addComponent(coordenadaOut2TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(coordenadaIn1Label)
                                                        .addComponent(coordenadaIn1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(principalPanelLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(coordenadaOut1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(coordenadaOut1Label))))
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(principalPanelLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(coordenadaOut2Label)
                                                        .addComponent(coordenadaOut2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(coordenadaOut3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(principalPanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(coordenadaIn2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(coordenadaIn2Label))
                                                .addGap(18, 18, 18)
                                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(coordenadaIn3Label)
                                                        .addComponent(coordenadaIn3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(coordenadaOut3Label))))
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
    }
    // </editor-fold>

    private void seleccionTipoCoordenadaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        Coordenada.Tipo tipoCoordenada = getTipoCoordenada();
        if(tipoCoordenada != null){
            switch (tipoCoordenada){
                case GEODESICA -> {
                    coordenadaIn1Label.setText("Latitud(φ):");
                    coordenadaIn2Label.setText("Longitud(λ):");
                    coordenadaIn3Label.setText("Altura(h)");
                    coordenadaOut1Label.setText("Latitud(φ):");
                    coordenadaOut2Label.setText("Longitud(λ):");
                    coordenadaOut3Label.setText("Altura(h)");
                }
                case GEOCENTRICA -> {

                    coordenadaIn1Label.setText("Eje(X):");
                    coordenadaIn2Label.setText("Eje(Y):");
                    coordenadaIn3Label.setText("Eje(Z):");
                    coordenadaOut1Label.setText("Eje(X):");
                    coordenadaOut2Label.setText("Eje(Y):");
                    coordenadaOut3Label.setText("Eje(Z):");
                }
            }
            coordenadaIn2TextField.setText("");
            coordenadaIn1TextField.setText("");
            coordenadaIn3TextField.setText("");
            coordenadaOut2TextField.setText("");
            coordenadaOut1TextField.setText("");
            coordenadaOut3TextField.setText("");

            resultadoTextArea.setText("");
            validacionLabel.setText("");
            validacionLabel.setVisible(false);
        }
    }


    private void convertirButtonActionPerformed(java.awt.event.ActionEvent evt) {

        Coordenada.Tipo tipoCoordenada = getTipoCoordenada();
        validarFormulario();

        if(tipoCoordenada != null){
            switch (tipoCoordenada){
                case GEODESICA -> {
                    distanciaGeodesica();
                }
                case GEOCENTRICA -> {
                    distanciaGeocentrica();
                }
            }
        }
    }

    private void distanciaGeodesica(){
        try {

            SistemaGeodesico sistemaGeodesicoUno = new SistemaGeodesico();
            SistemaGeodesico sistemaGeodesicoDos = new SistemaGeodesico();

            sistemaGeodesicoUno.setDatum(getSistemaConversion().load());
            sistemaGeodesicoDos.setDatum(getSistemaConversion().load());

            sistemaGeodesicoUno.setLatitud(
                    Double.parseDouble(coordenadaIn1TextField.getText().trim())
            );
            sistemaGeodesicoUno.setLongitud(
                    Double.parseDouble(coordenadaIn2TextField.getText().trim())
            );
            sistemaGeodesicoUno.setAltura(
                    Double.parseDouble(coordenadaIn3TextField.getText().trim())
            );

            sistemaGeodesicoDos.setLatitud(
                    Double.parseDouble(coordenadaOut1TextField.getText().trim())
            );
            sistemaGeodesicoDos.setLongitud(
                    Double.parseDouble(coordenadaOut2TextField.getText().trim())
            );
            sistemaGeodesicoDos.setAltura(
                    Double.parseDouble(coordenadaOut3TextField.getText().trim())
            );

            AdicionalController adicionalController = new AdicionalController(
                    Arrays.asList(sistemaGeodesicoUno, sistemaGeodesicoDos),
                    null
            );

            Double distancia = adicionalController.distanciaGeodesica();

            resultadoTextArea.setText(
                    String.format("La distancia que divide a las coordenadas \ningresadas son %.3f metros.",
                            distancia)
            );


        } catch (NumberFormatException e){
            validacionLabel.setText("Mensaje: Ingrese valores validos.");
            validacionLabel.setVisible(true);
        }
    }

    private void distanciaGeocentrica(){
        try {

            SistemaGeocentrico sistemaGeocentricoUno = new SistemaGeocentrico();
            SistemaGeocentrico sistemaGeocentricoDos = new SistemaGeocentrico();

            sistemaGeocentricoUno.setDatum(getSistemaConversion().load());
            sistemaGeocentricoDos.setDatum(getSistemaConversion().load());

            sistemaGeocentricoUno.setX(
                    Double.parseDouble(coordenadaIn1TextField.getText().trim())
            );
            sistemaGeocentricoUno.setY(
                    Double.parseDouble(coordenadaIn2TextField.getText().trim())
            );
            sistemaGeocentricoUno.setZ(
                    Double.parseDouble(coordenadaIn3TextField.getText().trim())
            );

            sistemaGeocentricoDos.setX(
                    Double.parseDouble(coordenadaOut1TextField.getText().trim())
            );
            sistemaGeocentricoDos.setY(
                    Double.parseDouble(coordenadaOut2TextField.getText().trim())
            );
            sistemaGeocentricoDos.setZ(
                    Double.parseDouble(coordenadaOut3TextField.getText().trim())
            );

            AdicionalController adicionalController = new AdicionalController(
                    null,
                    Arrays.asList(sistemaGeocentricoUno, sistemaGeocentricoDos)
            );

            Double distancia = adicionalController.distanciaGeocentrica();

            resultadoTextArea.setText(
                    String.format("La distancia que divide a las coordenadas \ningresadas son %.3f metros.",
                            distancia)
            );


        } catch (NumberFormatException e){
            validacionLabel.setText("Mensaje: Ingrese valores validos.");
            validacionLabel.setVisible(true);
        }
    }

    private Coordenada.Tipo getTipoCoordenada(){
        return Coordenada.Tipo.valorOf(
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
                coordenadaIn3TextField.getText().trim().equals("") ||
                coordenadaOut1TextField.getText().trim().equals("") ||
                coordenadaOut2TextField.getText().trim().equals("") ||
                coordenadaOut3TextField.getText().trim().equals("");

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
