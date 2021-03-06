/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcovalderrey.mycompany.test_dgt;

/**
 *
 * @author valde
 */
public class PANEL_Principal extends javax.swing.JPanel {

    /**
     * Creates new form PANEL_Principal
     */
    public PANEL_Principal() {
        initComponents();
    }

    boolean comprobarContenidoCampos(){
        boolean camposValidos = true;
        String nombre = beanDatosPersonales.getNombre();
        String apellidos = beanDatosPersonales.getApellidos();
        String dni = beanDatosPersonales.getDni();
        boolean aviso = beanDatosPersonales.getAvisoVisible();
        if(nombre.equals("") | apellidos.equals("") | dni.equals("") | aviso){
            camposValidos = false;
        }
        return camposValidos;
    }
    
    void habilitarCaracteristicasTest(boolean valor){
    
        beanCaracteristicasTest.habilitarCampos(valor);
        
    }
    
    public int getFallosMaximos(){return beanCaracteristicasTest.getFallosMaximos();}
    public int getNumPreguntas(){return beanCaracteristicasTest.getNumeroDePreguntas();}
    public String getTipoTest(){return String.valueOf(beanCaracteristicasTest.getTipoTest());}
    public String getNombre(){return String.valueOf(beanDatosPersonales.getNombre());}
    public String getApellidos(){return String.valueOf(beanDatosPersonales.getApellidos());}
    public String getDni(){return String.valueOf(beanDatosPersonales.getDni());}
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        beanDatosPersonales = new com.marcovalderrey.mycompany.test_dgt.BEAN_Datos_Personales();
        beanCaracteristicasTest = new com.marcovalderrey.mycompany.test_dgt.BEAN_Caracteristicas_Test();
        lblTextoBienvenida = new javax.swing.JLabel();

        beanCaracteristicasTest.setEnabled(false);
        beanCaracteristicasTest.setFocusable(false);

        lblTextoBienvenida.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTextoBienvenida.setText("¡Bienvenido al test de la DGT!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(beanDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(beanCaracteristicasTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(lblTextoBienvenida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTextoBienvenida)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(beanCaracteristicasTest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beanDatosPersonales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.marcovalderrey.mycompany.test_dgt.BEAN_Caracteristicas_Test beanCaracteristicasTest;
    private com.marcovalderrey.mycompany.test_dgt.BEAN_Datos_Personales beanDatosPersonales;
    private javax.swing.JLabel lblTextoBienvenida;
    // End of variables declaration//GEN-END:variables
}
