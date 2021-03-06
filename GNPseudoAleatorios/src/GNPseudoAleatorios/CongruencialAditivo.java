/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GNPseudoAleatorios;


import java.awt.GridBagConstraints;

import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Migue
 */
public class CongruencialAditivo extends javax.swing.JFrame {
    LinkedList Lista=new LinkedList();
   
    String valor, ccuadrado="", sale="", cua="", erre="", algo="";
    String cadenadiv="",cadenari="",cadenaxi="";
    private GridBagConstraints restricciones;
    int no, num1, num2, ta1=0, ta2=0, ta3=0;
    double y;
    String dato;
    int mr;


    /**
     * Creates new form Menú
     */
    public CongruencialAditivo() {
     
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

        jLabel3 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        m = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Generar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ri = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        div = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        xi = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese la cantidad de números a generar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 220, 30));
        getContentPane().add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 220, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Algoritmo Congruencial Aditivo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GNPseudoAleatorios/Img/a.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GNPseudoAleatorios/Img/a.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 20, 450));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GNPseudoAleatorios/Img/a.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 640, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GNPseudoAleatorios/Img/a.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 20, 450));

        Exit.setBackground(new java.awt.Color(255, 0, 0));
        Exit.setText("Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 70, -1));

        back.setBackground(new java.awt.Color(255, 255, 51));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 70, -1));

        Clear.setText("Limpiar");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        Generar.setText("Generar ");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });
        jPanel1.add(Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        jScrollPane1.setViewportView(ri);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 120, 180));

        jScrollPane3.setViewportView(div);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 120, 180));

        jScrollPane2.setViewportView(xi);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 120, 180));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Ingrese el parámetro m:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingresa el numero de datos disponibles:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));
        jPanel1.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 220, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GNPseudoAleatorios/Img/5.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 600, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Menú Menú = new Menú();
        Menú.setVisible(true);
        CongruencialAditivo.this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        m.setText(null);
        n.setText(null);
        num.setText(null);
        ri.setText(null);
        xi.setText(null);
        div.setText(null);
    }//GEN-LAST:event_ClearActionPerformed
       public void establecerValores(int columna,int fila, int anchura, int altura)
   {
    restricciones.gridx=columna;
    restricciones.gridy=fila;
    
    restricciones.gridwidth=anchura;
    restricciones.gridheight=altura;
   }
    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        // TODO add your handling code here:
     if (evt.getSource()==Generar)
   { 
    if(num.getText().equals(""))
    {
     JOptionPane.showMessageDialog(null,"Ingresa numero de datos deseados");
    }

    if(m.getText().equals(""))
    {
     JOptionPane.showMessageDialog(null,"Ingresa modulo");
    }

    if(n.getText().equals(""))
    {
     JOptionPane.showMessageDialog(null,"Ingresa cantidad de datos a generar");
    }
            
    else
    {   
        try
    {
    Integer datos= new Integer(num.getText());
    Integer modulo= new Integer(m.getText());
    Integer cantidad= new Integer(n.getText());
    
     if(datos<=0)
     {
      JOptionPane.showMessageDialog(null,"El numero de datos debe ser \nmayorr a 0","error",JOptionPane.ERROR_MESSAGE);
      n.setText("");
     }
     
     else
     {
      
     if(modulo<=0)
     {
      JOptionPane.showMessageDialog(null,"El numero modulo debe ser \nmayor a 0","error",JOptionPane.ERROR_MESSAGE);
      m.setText("");      
     }
     
     else
     {

     if(cantidad<=0)
     {
      JOptionPane.showMessageDialog(null,"El numero de datos debe ser \nmayor a 0","error",JOptionPane.ERROR_MESSAGE);
      num.setText("");      
     }
     
     else
     {     
        
     for(int i=0; i<datos; i++)
     {  
      
      dato = (JOptionPane.showInputDialog("Ingresa el valor de X"+(i+1)+" : "));
      no = Integer.parseInt( dato );
      Lista.addLast(no);
      sale+=no+" "; 
       
       ta1++;         
     }
     
     for(int i=0; i<cantidad; i++)
     {       
       String dat1=String.valueOf(Lista.get(datos-1+i));
       int da1=Integer.parseInt(dat1);
       
       String dat2=String.valueOf(Lista.get(i));
       int da2=Integer.parseInt(dat2);
       
        ta2++;
        ta3=ta1+ta2;
       mr=modulo-1; 
       no=(da1+da2)% modulo;
       Lista.addLast(no);
       cadenaxi+="x"+ta3+"=  "+no+"\n";
       cadenadiv+=no+"/"+mr+"\n";
       
       y=no*1.0/(modulo-1);
       
       BigDecimal formatNumber = new BigDecimal(y);
       formatNumber = formatNumber.setScale(4, RoundingMode.DOWN);
       cadenari+="r"+i+"= "+formatNumber+"\n";
     }
     
    
    
    }
     }
    } 
     xi.setText(cadenaxi);
     ri.setText(cadenari);
     div.setText(cadenadiv);
     }
  

    catch(java.lang.NumberFormatException e)
    {
    JOptionPane.showMessageDialog(null,"Dato invalido");
     n.setText("");
     m.setText("");
     num.setText("");
    


    }
    }

       

   }
    }//GEN-LAST:event_GenerarActionPerformed

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
            java.util.logging.Logger.getLogger(CongruencialAditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CongruencialAditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CongruencialAditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CongruencialAditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CongruencialAditivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Generar;
    private javax.swing.JButton back;
    private javax.swing.JTextPane div;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField m;
    private javax.swing.JTextField n;
    private javax.swing.JTextField num;
    private javax.swing.JTextPane ri;
    private javax.swing.JTextPane xi;
    // End of variables declaration//GEN-END:variables
}
