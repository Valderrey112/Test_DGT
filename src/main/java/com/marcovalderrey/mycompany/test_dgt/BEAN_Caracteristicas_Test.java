/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test_dgt;

import java.io.Serializable;
import javax.swing.JComboBox;

/**
 *
 * @author valde
 */
public class BEAN_Caracteristicas_Test extends javax.swing.JPanel implements Serializable{

    /**
     * Creates new form BEAN_Caracteristicas_Testt
     */
    public BEAN_Caracteristicas_Test() {
        initComponents();
    }

    public JComboBox<String> getComboBoxFallosMaximos() {
        return comboBoxFallosMaximos;
    }

    public void setComboBoxFallosMaximos(JComboBox<String> comboBoxFallosMaximos) {
        this.comboBoxFallosMaximos = comboBoxFallosMaximos;
    }

    public JComboBox<String> getComboBoxNumPreguntas() {
        return comboBoxNumPreguntas;
    }

    public void setComboBoxNumPreguntas(JComboBox<String> comboBoxNumPreguntas) {
        this.comboBoxNumPreguntas = comboBoxNumPreguntas;
    }

    public JComboBox<String> getComboBoxTipoTest() {
        return comboBoxTipoTest;
    }

    public void setComboBoxTipoTest(JComboBox<String> comboBoxTipoTest) {
        this.comboBoxTipoTest = comboBoxTipoTest;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxTipoTest = new javax.swing.JComboBox<>();
        lblNumPreguntas = new javax.swing.JLabel();
        comboBoxNumPreguntas = new javax.swing.JComboBox<>();
        lblFallosMaximos = new javax.swing.JLabel();
        comboBoxFallosMaximos = new javax.swing.JComboBox<>();
        lblCaracterisiticasTest = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();

        comboBoxTipoTest.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comboBoxTipoTest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "A1", "A2", "A", "B", "C1", "C", "D1", "D", "BE", "C1E", "CE", "D1E", "DE" }));

        lblNumPreguntas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblNumPreguntas.setText("Nº de preguntas: ");

        comboBoxNumPreguntas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comboBoxNumPreguntas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50" }));

        lblFallosMaximos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblFallosMaximos.setText("Fallos máximos: ");

        comboBoxFallosMaximos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comboBoxFallosMaximos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        lblCaracterisiticasTest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblCaracterisiticasTest.setText("Características del test:");

        lblTipo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTipo.setText("Tipo de test: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCaracterisiticasTest)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(lblFallosMaximos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxTipoTest, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumPreguntas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxNumPreguntas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxFallosMaximos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCaracterisiticasTest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxTipoTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNumPreguntas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxNumPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFallosMaximos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxFallosMaximos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxFallosMaximos;
    private javax.swing.JComboBox<String> comboBoxNumPreguntas;
    private javax.swing.JComboBox<String> comboBoxTipoTest;
    private javax.swing.JLabel lblCaracterisiticasTest;
    private javax.swing.JLabel lblFallosMaximos;
    private javax.swing.JLabel lblNumPreguntas;
    private javax.swing.JLabel lblTipo;
    // End of variables declaration//GEN-END:variables
}