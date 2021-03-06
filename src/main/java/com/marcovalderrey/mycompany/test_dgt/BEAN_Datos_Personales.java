/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcovalderrey.mycompany.test_dgt;

import java.io.Serializable;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author valde
 */
public class BEAN_Datos_Personales extends javax.swing.JPanel implements Serializable{

    /**
     * Creates new form BEAN_Datos_Personales
     */
    public BEAN_Datos_Personales() {
        initComponents();
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFallosMaximos = new javax.swing.JLabel();
        lblCaracterisiticasTest = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblNumPreguntas = new javax.swing.JLabel();
        txtFieldApellidos = new javax.swing.JTextField();
        txtFieldNombre = new javax.swing.JTextField();
        lblAvisoApellidos = new javax.swing.JLabel();
        lblAvisoDNI = new javax.swing.JLabel();
        txtFieldDni = new javax.swing.JTextField();
        lblAvisoNombre = new javax.swing.JLabel();

        lblFallosMaximos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblFallosMaximos.setText("DNI: ");

        lblCaracterisiticasTest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblCaracterisiticasTest.setText("Datos personales:");

        lblTipo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTipo.setText("Nombre: ");

        lblNumPreguntas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblNumPreguntas.setText("Apellidos: ");

        txtFieldApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFieldApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldApellidos.setToolTipText("Introduzca sus dos primeros apellidos");
        txtFieldApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldApellidosFocusLost(evt);
            }
        });

        txtFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldNombre.setToolTipText("Introduzca su nombre");
        txtFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldNombreFocusLost(evt);
            }
        });

        lblAvisoApellidos.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        lblAvisoApellidos.setForeground(new java.awt.Color(255, 0, 0));
        lblAvisoApellidos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblAvisoApellidosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblAvisoDNI.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        lblAvisoDNI.setForeground(new java.awt.Color(255, 0, 0));

        txtFieldDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFieldDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldDni.setToolTipText("Introduza su DNI(con o sin guión)");
        txtFieldDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldDniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldDniFocusLost(evt);
            }
        });

        lblAvisoNombre.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        lblAvisoNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblAvisoNombre.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblAvisoNombreAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCaracterisiticasTest)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblFallosMaximos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvisoDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAvisoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(18, 18, 18)
                        .addComponent(lblAvisoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtFieldApellidos)
                    .addComponent(txtFieldDni))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCaracterisiticasTest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(lblAvisoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumPreguntas)
                    .addComponent(lblAvisoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFallosMaximos)
                    .addComponent(lblAvisoDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNombreFocusLost
        comprobarSiHayNumero(txtFieldNombre, lblAvisoNombre, "Este campo no debe tener números");
    }//GEN-LAST:event_txtFieldNombreFocusLost

    private void lblAvisoApellidosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblAvisoApellidosAncestorAdded
        
    }//GEN-LAST:event_lblAvisoApellidosAncestorAdded

    private void txtFieldApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldApellidosFocusLost
        comprobarSiHayNumero(txtFieldApellidos, lblAvisoApellidos, "Este campo no debe tener números");
    }//GEN-LAST:event_txtFieldApellidosFocusLost

    private void txtFieldNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNombreFocusGained
        quitarAviso(lblAvisoNombre);
    }//GEN-LAST:event_txtFieldNombreFocusGained

    private void txtFieldApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldApellidosFocusGained
        quitarAviso(lblAvisoApellidos);
    }//GEN-LAST:event_txtFieldApellidosFocusGained

    private void txtFieldDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldDniFocusGained
        quitarAviso(lblAvisoDNI);
    }//GEN-LAST:event_txtFieldDniFocusGained

    private void txtFieldDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldDniFocusLost
        if(validarDNI(txtFieldDni.getText()) != 0){
            darAviso(lblAvisoDNI, "El DNI no es correcto");
        }
    }//GEN-LAST:event_txtFieldDniFocusLost

    private void lblAvisoNombreAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblAvisoNombreAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAvisoNombreAncestorAdded

    void comprobarSiHayNumero(JTextField textFieldAComprobar, JLabel label, String aviso){
        try{
            for(int i = 0; i < textFieldAComprobar.getText().length(); i++){
                String letra = textFieldAComprobar.getText().substring(i, i+1);
                if(letra.equals("0") |
                letra.equals("1") |
                letra.equals("2") |
                letra.equals("3") |
                letra.equals("4") |
                letra.equals("5") |
                letra.equals("6") |
                letra.equals("7") |
                letra.equals("8") |
                letra.equals("9")){
                    int numero = Integer.parseInt("a");
                }
            }
        }catch(Exception e){
            darAviso(label, aviso);
        }
    }
    
    public int validarDNI(String dni){
        int DNIvalido = 2;
        if(dni.length()==9 | dni.length()==10){
            if(dni.length()==10){
                if(dni.substring(dni.length() - 2, dni.length() - 1).equals("-")){
                    dni = dni.substring(0, 8) + dni.substring(dni.length()-1, dni.length());
                }
            }
            try{
                int numero = Integer.parseInt(dni.substring(0,8));
                int numPosicionLetra = numero % 23;
                String cadenaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
                if(cadenaLetras.substring(numPosicionLetra, numPosicionLetra + 1).equals(dni.substring(8,9).toUpperCase())){
                    DNIvalido = 0;
                }else{
                    DNIvalido = -1;
                }
            }catch(Exception e){
                DNIvalido = -1;
            }
        }
        return DNIvalido;
    }
    
    String getNombre(){
        return txtFieldNombre.getText();
    }
    String getApellidos(){
        return txtFieldApellidos.getText();
    }
    String getDni(){
        return txtFieldDni.getText();
    }
    
    void darAviso(JLabel label, String aviso){
        label.setText(aviso);
    }
    
    boolean getAvisoVisible(){
        boolean avisoVisible = false;
        
        if(!lblAvisoApellidos.getText().isEmpty() | !lblAvisoNombre.getText().isEmpty() | !lblAvisoDNI.getText().isEmpty()){
            avisoVisible = true;
        }
        
        return avisoVisible;
    }
    
    void quitarAviso(JLabel label){
        label.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAvisoApellidos;
    private javax.swing.JLabel lblAvisoDNI;
    private javax.swing.JLabel lblAvisoNombre;
    private javax.swing.JLabel lblCaracterisiticasTest;
    private javax.swing.JLabel lblFallosMaximos;
    private javax.swing.JLabel lblNumPreguntas;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtFieldApellidos;
    private javax.swing.JTextField txtFieldDni;
    private javax.swing.JTextField txtFieldNombre;
    // End of variables declaration//GEN-END:variables
}
