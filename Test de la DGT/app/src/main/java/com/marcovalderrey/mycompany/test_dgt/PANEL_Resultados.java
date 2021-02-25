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
public class PANEL_Resultados extends javax.swing.JPanel {

    BEAN_Informes beanInformes = new BEAN_Informes();
    
    /**
     * Creates new form PANEL_Resultados
     */
    public PANEL_Resultados() {
        initComponents();
        btnInforme.setVisible(false);
    }

    void rellenarCampos(String nombreYApellidos, String dni, String tipoTest, String numPreguntas, String preguntasContestadas){
    
        beanResultados.setLblNombreARellenar(nombreYApellidos);
        beanResultados.setLblDNIARellenar(dni);
        beanResultados.setLblTipoTestARellenar(tipoTest);
        beanResultados.setLblNumPreguntasARellenar(numPreguntas);
        beanResultados.setLblPreguntasContestadasARellenar(preguntasContestadas);
        
    }
    
    void rellenarBeanInformes(String nombreYApellidos, String dni, String tipoTest, String fallosMaximos, String preguntasFalladas){
        beanInformes.setNombreYApellidos(nombreYApellidos);
        beanInformes.setDni(dni);
        beanInformes.setTipoTest(tipoTest);
        beanInformes.setFallosMaximos(fallosMaximos);
        beanInformes.setPreguntasFalladas(preguntasFalladas);
        beanInformes.setCalificacion();
    }
    void activarBotonInformes(boolean valor){
        btnInforme.setVisible(valor);
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTextoBienvenida = new javax.swing.JLabel();
        btnInforme = new javax.swing.JButton();
        pnlContenedor = new javax.swing.JPanel();
        beanResultados = new com.marcovalderrey.mycompany.test_dgt.BEAN_ResultadosTest();

        lblTextoBienvenida.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTextoBienvenida.setText("Resultados del test");

        btnInforme.setText("INFORME");
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });

        pnlContenedor.setLayout(new java.awt.GridBagLayout());
        pnlContenedor.add(beanResultados, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lblTextoBienvenida))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(btnInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoBienvenida)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInforme)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        pnlContenedor.add(beanInformes);
        if(btnInforme.getText().equals("INFORME")){
            beanResultados.setVisible(false);
            beanInformes.setVisible(true);
            btnInforme.setText("VOLVER");
        }else{
            beanInformes.setVisible(false);
            beanResultados.setVisible(true);
            btnInforme.setText("INFORME");
        }
        pnlContenedor.repaint();
    }//GEN-LAST:event_btnInformeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.marcovalderrey.mycompany.test_dgt.BEAN_ResultadosTest beanResultados;
    private javax.swing.JButton btnInforme;
    private javax.swing.JLabel lblTextoBienvenida;
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables
}
