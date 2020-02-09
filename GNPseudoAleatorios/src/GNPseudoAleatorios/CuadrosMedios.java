
package GNPseudoAleatorios;

import javax.swing.JOptionPane;


public class CuadrosMedios extends javax.swing.JFrame {
 
    /**
     * Creates new form Menú
     */
    public CuadrosMedios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Semilla = new javax.swing.JTextField();
        Generar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        R = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ri = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        xi = new javax.swing.JTextPane();
        Clear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        y1 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setBackground(new java.awt.Color(255, 0, 0));
        Exit.setText("Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 70, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Algoritmo de Cuadros Medios");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, 30));

        back.setBackground(new java.awt.Color(255, 255, 51));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 70, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese la cantidad de ri a generar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        jPanel1.add(Semilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 220, -1));

        Generar.setText("Generar");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });
        jPanel1.add(Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese la semilla:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        jPanel1.add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 220, -1));

        jScrollPane1.setViewportView(ri);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 120, 180));

        jScrollPane2.setViewportView(xi);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 120, 180));

        Clear.setText("Limpiar");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        jScrollPane3.setViewportView(y1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, 180));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GNPseudoAleatorios/Img/a.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 20, 450));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GNPseudoAleatorios/Img/a.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GNPseudoAleatorios/Img/a.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 640, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GNPseudoAleatorios/Img/a.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 20, 450));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GNPseudoAleatorios/Img/5.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 600, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==Generar)
   {    
        
    if(Semilla.getText().equals(""))   //********** Permite verificar si la caja de texto esta vacia **********//
    {
     JOptionPane.showMessageDialog(null,"Ingresa valor de semilla");
    }
    
    if(R.getText().equals(""))
    {
     JOptionPane.showMessageDialog(null,"Ingresa la cantidad de ri a generar:");
    }
    
        String semilla=Semilla.getText();
        Integer Ri= new Integer(R.getText());
   
    
        String snumero2, snumero3,cadenaxi = "",cadenari = "",cadenay1 = "";
        int tam1, tam2,  i, primerc;
        long numero1, numero2;
        tam1 = semilla.length();
        numero1 = Integer.parseInt(semilla);
   
        if(numero1<=999)
     {
      JOptionPane.showMessageDialog(null,"Valor de Xi debe ser mayor a tres digitos");
      Semilla.setText("");
      R.setText("");
      ri.setText("");
      xi.setText("");
      y1.setText("");

     }
         try
     {
         
    
        if(numero1>=999){
     
            for (i=1; i<=Ri; i++){
            numero2 = (long)Math.pow(numero1,2);
            snumero2 = Long.toString(numero2);
            tam2 = snumero2.length();
            primerc = (tam2-tam1) / 2;
            snumero3 = snumero2.substring(primerc,primerc+tam1);
            cadenaxi+=("x"+i+ " =  " +snumero3+" \n");

            cadenari+=( "r"+i+" =  0. " + snumero3+ " \n");
            
            cadenay1+=( "y"+i+" = " + snumero2+ " \n");

            numero1 = Integer.parseInt(snumero3);

        }
        xi.setText(cadenaxi);
        ri.setText(cadenari);
        y1.setText(cadenay1);
        }
          } catch(java.lang.NumberFormatException e)
     {
      JOptionPane.showMessageDialog(null,"Dato invalido");
      Semilla.setText("");
      R.setText("");
      ri.setText("");
      xi.setText("");
      y1.setText("");
     }{
              
          }   
   }
         
  
    }//GEN-LAST:event_GenerarActionPerformed
    
        
     
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Menú Menú = new Menú();
        Menú.setVisible(true);
        CuadrosMedios.this.dispose();

    }//GEN-LAST:event_backActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        Semilla.setText(null);
        R.setText(null);
        ri.setText(null);
        xi.setText(null);
        y1.setText(null);
    }//GEN-LAST:event_ClearActionPerformed

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CuadrosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuadrosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuadrosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuadrosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuadrosMedios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Generar;
    private javax.swing.JTextField R;
    private javax.swing.JTextField Semilla;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane ri;
    private javax.swing.JTextPane xi;
    private javax.swing.JTextPane y1;
    // End of variables declaration//GEN-END:variables
}
