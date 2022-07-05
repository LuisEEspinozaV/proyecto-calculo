package calculadora;

import javax.swing.JOptionPane;

public class CalculadoraUtilidad extends javax.swing.JFrame {
 
    Derivadas derivada;
    result resultado;
    public CalculadoraUtilidad() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        funcionIngre = new javax.swing.JTextField();
        ingresoMarg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        unidades = new javax.swing.JTextField();
        proIngresoMarg = new javax.swing.JTextField();
        ingresoExtra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        costos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        costoMarg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        proCostoMarg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        costoUniExtra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ganancia = new javax.swing.JTextField();
        gananciaMarg = new javax.swing.JTextField();
        proGananciaMarg = new javax.swing.JTextField();
        gananciaUniExtra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gananciaUniProdu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gananciaTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Utilidad Marginal");
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Funcion Ingresos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 76, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Ingreso Marginal");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, -1));

        funcionIngre.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        funcionIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionIngreActionPerformed(evt);
            }
        });
        jPanel1.add(funcionIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 102, -1));

        ingresoMarg.setEditable(false);
        ingresoMarg.setBackground(new java.awt.Color(204, 204, 204));
        ingresoMarg.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(ingresoMarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 102, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 120, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Proyecto Calculo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Resetear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 120, -1));

        unidades.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        unidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadesActionPerformed(evt);
            }
        });
        jPanel1.add(unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 102, -1));

        proIngresoMarg.setEditable(false);
        proIngresoMarg.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(proIngresoMarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 102, -1));

        ingresoExtra.setEditable(false);
        ingresoExtra.setBackground(new java.awt.Color(204, 204, 204));
        ingresoExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoExtraActionPerformed(evt);
            }
        });
        jPanel1.add(ingresoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 102, -1));

        jLabel4.setText("Unidades Producidas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 23));

        jLabel5.setText("Costo Unidad Extra");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 150, -1));

        costos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costosActionPerformed(evt);
            }
        });
        jPanel1.add(costos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 102, -1));

        jLabel6.setText("Funcion Costos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 108, -1));

        costoMarg.setEditable(false);
        costoMarg.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(costoMarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 102, -1));

        jLabel7.setText("Costo Marginal");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 176, -1));

        proCostoMarg.setEditable(false);
        proCostoMarg.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(proCostoMarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 102, -1));

        jLabel8.setText("Ingreso Unidad Extra");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 115, -1));

        costoUniExtra.setEditable(false);
        costoUniExtra.setBackground(new java.awt.Color(204, 204, 204));
        costoUniExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoUniExtraActionPerformed(evt);
            }
        });
        jPanel1.add(costoUniExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 102, -1));

        jLabel9.setText("Funcion Ganancias");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 71, 140, 23));

        jLabel10.setText("Ganancia Marginal");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 120, 130, -1));
        jPanel1.add(ganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 106, -1));

        gananciaMarg.setEditable(false);
        gananciaMarg.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(gananciaMarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 106, -1));

        proGananciaMarg.setEditable(false);
        proGananciaMarg.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(proGananciaMarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 106, -1));

        gananciaUniExtra.setEditable(false);
        gananciaUniExtra.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(gananciaUniExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 106, -1));

        jLabel11.setText("Ganancia Unidad Extra");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 160, -1));

        gananciaUniProdu.setEditable(false);
        gananciaUniProdu.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(gananciaUniProdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 110, -1));

        jLabel12.setText("Ganancia de Unidades");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 130, 20));

        jLabel13.setText("Producidas");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        gananciaTotal.setEditable(false);
        gananciaTotal.setBackground(new java.awt.Color(204, 204, 204));
        gananciaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gananciaTotalActionPerformed(evt);
            }
        });
        jPanel1.add(gananciaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 110, -1));

        jLabel14.setText("Ganancia Total");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 130, 20));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, -1, -1));

        jLabel16.setText("Grupo 4");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel17.setText("Camilo Samuel Guzman Santa Cruz");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel18.setText("Luis Enrique Espinoza Vera");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String funcion = funcionIngre.getText();
    /**
    * Funcion Ingresos.
    * derivar.
    */
    derivada = new Derivadas();
    derivada.setFuncionDerivar(funcion);
    derivada.derivar();
    ingresoMarg.setText(derivada.getFuncionDerivar());
    
    /**
    * ingreso marginal.
    */
    String function = ingresoMarg.getText();
        String ing = unidades.getText();
        resultado = new result();
        resultado.setFunction(function);
        resultado.replaceX(function, ing);
        proIngresoMarg.setText(resultado.getResult());
        resultado.finalres(); 
    
    /**
    * unidad ingreso extra
    */
    resultado.multi();
    ingresoExtra.setText(resultado.getResult());
    
    /**
     * costos.
     * derivar
     */
    
    funcion = costos.getText();
    derivada.setFuncionDerivar(funcion);
    derivada.derivar();    
    costoMarg.setText(derivada.getFuncionDerivar());
    
    /**
     * resultados
     */
    function = costoMarg.getText();
    resultado.setFunction(function);
    resultado.replaceX(function, ing);
    proCostoMarg.setText(resultado.getResult());
    resultado.finalres(); 
    
    /**
     * Costo unidad extra
     */
    resultado.multi();
    costoUniExtra.setText(resultado.getResult());
    
    /**
     * Ganancias.
     * derivar.
     */
    funcion = ganancia.getText();
    derivada.setFuncionDerivar(funcion);
    derivada.derivar();    
    gananciaMarg.setText(derivada.getFuncionDerivar());
    
    /**
     * resultados
     */
    function = gananciaMarg.getText();
    resultado.setFunction(function);
    resultado.replaceX(function, ing);
    proGananciaMarg.setText(resultado.getResult());
    resultado.finalres(); 
    
    /**
     * Ganancia unidad extra.
     */
    resultado.multi();
    gananciaUniExtra.setText(resultado.getResult());
    
    /**
     * Ganancia de unidades producidas.
     */
    function = ganancia.getText();
    resultado.setFunction(function);
    resultado.replaceX(function, ing);
    resultado.finalres(); 
    resultado.multi();
    gananciaUniProdu.setText(resultado.getResult());
    
    /**
     * ganancia total.
     */
    function = gananciaUniExtra.getText() + "+"
             + gananciaUniProdu.getText();
    resultado.setFunction(function);
    resultado.finalres();
    resultado.multi();
    gananciaTotal.setText(resultado.getResult());
    
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        funcionIngre.setText("");
        ingresoMarg.setText("");
        ingresoMarg.setText("");
        proIngresoMarg.setText("");
        ingresoExtra.setText("");
        costos.setText("");
        costoMarg.setText("");
        proCostoMarg.setText("");
        costoUniExtra.setText("");
        ganancia.setText("");
        gananciaMarg.setText("");
        proGananciaMarg.setText("");
        gananciaUniExtra.setText("");
        gananciaUniProdu.setText("");
        gananciaTotal.setText("");
        unidades.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void funcionIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionIngreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionIngreActionPerformed

    private void unidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadesActionPerformed
     
    
    }//GEN-LAST:event_unidadesActionPerformed

    private void ingresoExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoExtraActionPerformed

    private void costosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costosActionPerformed

    private void gananciaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gananciaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gananciaTotalActionPerformed

    private void costoUniExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoUniExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoUniExtraActionPerformed
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUtilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUtilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUtilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUtilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraUtilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField costoMarg;
    private javax.swing.JTextField costoUniExtra;
    private javax.swing.JTextField costos;
    private javax.swing.JTextField funcionIngre;
    private javax.swing.JTextField ganancia;
    private javax.swing.JTextField gananciaMarg;
    private javax.swing.JTextField gananciaTotal;
    private javax.swing.JTextField gananciaUniExtra;
    private javax.swing.JTextField gananciaUniProdu;
    private javax.swing.JTextField ingresoExtra;
    private javax.swing.JTextField ingresoMarg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField proCostoMarg;
    private javax.swing.JTextField proGananciaMarg;
    private javax.swing.JTextField proIngresoMarg;
    private javax.swing.JTextField unidades;
    // End of variables declaration//GEN-END:variables
}
