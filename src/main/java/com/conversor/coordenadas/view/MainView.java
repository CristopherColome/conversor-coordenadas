/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conversor.coordenadas.view;

import javax.swing.JFrame;

/**
 *
 * @author ccolome
 */
public class MainView extends JFrame {
    
    private javax.swing.JPanel principalPanel;
    private javax.swing.JTabbedPane principalTabbedPane;
    private CoordenadaView coordenadaView;
    private AdicionalView adicionalView;
    
    public MainView() {
        initComponents();
    }
    
    private void initComponents() {
        
        principalPanel = new javax.swing.JPanel();
        principalTabbedPane = new javax.swing.JTabbedPane();
        coordenadaView = new CoordenadaView();
        adicionalView = new AdicionalView();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        setTitle("Aplicación conversión de coodernadas");
        
        principalPanel.setPreferredSize(new java.awt.Dimension(598, 455));
        
        principalTabbedPane.setPreferredSize(new java.awt.Dimension(600, 480));
        
        principalTabbedPane.addTab("Convetir coodenadas", coordenadaView);
        principalTabbedPane.addTab("Calculos adicionales", adicionalView);
        
        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        
        principalPanelLayout.setHorizontalGroup(
                principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(principalTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        principalPanelLayout.setVerticalGroup(
                principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(principalTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        
        pack();
    }
}
