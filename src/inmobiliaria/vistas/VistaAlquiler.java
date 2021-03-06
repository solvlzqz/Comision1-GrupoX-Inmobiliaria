/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.vistas;

import inmobiliaria.modelo.Alquiler;
import inmobiliaria.modelo.AlquilerData;
import inmobiliaria.modelo.Conexion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class VistaAlquiler extends javax.swing.JInternalFrame {
    private AlquilerData alquilerData;
    private Conexion con;

    /**
     * Creates new form VistaAlquiler
     */
    public VistaAlquiler() {
        try {
            initComponents();
            
            con= new Conexion();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtGuardar = new javax.swing.JButton();
        BtActualizar = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        BtEliminar = new javax.swing.JButton();
        jTId = new javax.swing.JTextField();
        jTInmueble = new javax.swing.JTextField();
        jTInquilino = new javax.swing.JTextField();
        jTCosto = new javax.swing.JTextField();
        jTFecha = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("ALQUILER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("INMUEBLE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("INQUILINO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("COSTO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("FECHA DE INICIO");

        BtGuardar.setText("GUARDAR");
        BtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGuardarActionPerformed(evt);
            }
        });

        BtActualizar.setText("ACTUALIZAR");
        BtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtActualizarActionPerformed(evt);
            }
        });

        BtBuscar.setText("BUSCAR");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        BtEliminar.setText("ELIMINAR");
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });

        jTId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addComponent(BtEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTCosto)
                                        .addGap(22, 22, 22))
                                    .addComponent(jTInquilino)
                                    .addComponent(jTInmueble)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 211, Short.MAX_VALUE)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtGuardar)
                    .addComponent(BtActualizar)
                    .addComponent(BtBuscar)
                    .addComponent(BtEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTIdActionPerformed

    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed
        // TODO add your handling code here:
        
        int id=Integer.parseInt(jTId.getText());
        alquilerData.borrarAlquiler(id);
    }//GEN-LAST:event_BtEliminarActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        // TODO add your handling code here:
        
        int id= Integer.parseInt(jTId.getText());
        int 
         Alquiler alquiler = alquilerData.buscarAlquiler(id);
         
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void BtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtActualizarActionPerformed
        // TODO add your handling code here:
        
        if (jTId.getText() !=null){
            String nombre_apellido = jTInquilino.getText();
            String inmueble = jTInmueble.getText();
            int costo= Integer.parseInt(jTCosto.getText());
            LocalDate fecha = LocalDate.parse(jTFecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyy"));
            int id_alquiler=Integer.parseInt(jTId.getText());
            
            Alquiler alquiler = new Alquiler (id_alquiler, fecha, costo, inmueble, nombre_apellido);
            alquilerData.guardarAlquiler(alquiler);
            
        }
    }//GEN-LAST:event_BtActualizarActionPerformed

    private void BtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGuardarActionPerformed
        // TODO add your handling code here:
        
        String nombre_apellido = jTInquilino.getText();
        String inmueble = jTInmueble.getText();
        int costo=Integer.parseInt(jTCosto.getText());
        int id_alquiler = Integer.parseInt(jTId.getText());
        LocalDate fecha = LocalDate.parse(jTFecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        Alquiler alquiler = new Alquiler (id_alquiler, fecha, costo, inmueble, nombre_apellido);
        alquilerData.guardarAlquiler(alquiler);
        
        jTId.setText(alquiler.getId_alquiler() +"");
        
    }//GEN-LAST:event_BtGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtActualizar;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtEliminar;
    private javax.swing.JButton BtGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTCosto;
    private javax.swing.JTextField jTFecha;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTInmueble;
    private javax.swing.JTextField jTInquilino;
    // End of variables declaration//GEN-END:variables
}
