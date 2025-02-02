/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Esta clase representa una interfaz gráfica de usuario para realizar transacciones entre cuentas.
 * @author Milena
 */
public class transaccionIII extends javax.swing.JFrame {
     static String cuenta;
     static String tarjeta;
    static String cuenta2;
    public Fondo imagen = new Fondo(); 
    /**
     * Constructor de la clase transaccionIII.
     * Inicializa los componentes de la interfaz y configura los botones.
     * 
     * @param cuenta   La cuenta de origen.
     * @param tarjeta  La tarjeta asociada a la cuenta de origen.
     * @param cuenta2  La cuenta de destino.
     */
    public transaccionIII(String cuenta,String tarjeta,String cuenta2) {
        this.cuenta=cuenta;
        this.tarjeta=tarjeta;
        this.cuenta2=cuenta2;
     this.setContentPane(imagen);
        initComponents();
        setResizable(false);
              
         /*---------------------------------------------- parte de los botones7----------------------------------------------*/
        saldo7.setIcon(setIcono("/imagenes/otroMonto.png",saldo7));
        saldo7.setPressedIcon(setIconoPrecionado("/imagenes/otroMonto.png",saldo7,30,30));
         /*---------------------------------------------- parte de los botones8----------------------------------------------*/
         
        atras.setIcon(setIcono("/imagenes/atras.png",atras));
        atras.setPressedIcon(setIconoPrecionado("/imagenes/atras.png",atras,30,30));
        
    }
    
    CambiosEnSaldo cambio = new CambiosEnSaldo();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto2 = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        BTNCINCUENTA = new javax.swing.JButton();
        BTNSETENTA = new javax.swing.JButton();
        BTNCIEN = new javax.swing.JButton();
        BTNCIENTOCINCUENTA = new javax.swing.JButton();
        BTNDOSIENTOS = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        BTONDiez = new javax.swing.JButton();
        saldo7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto2.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        texto2.setForeground(new java.awt.Color(0, 51, 102));
        texto2.setText("Elige el tipo  el monto  que quiera Transferir");

        texto1.setBackground(new java.awt.Color(51, 51, 51));
        texto1.setFont(new java.awt.Font("Arial Black", 3, 48)); // NOI18N
        texto1.setText("BNB");

        BTNCINCUENTA.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        BTNCINCUENTA.setForeground(new java.awt.Color(0, 0, 0));
        BTNCINCUENTA.setText("50");
        BTNCINCUENTA.setBorderPainted(false);
        BTNCINCUENTA.setFocusPainted(false);
        BTNCINCUENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCINCUENTAActionPerformed(evt);
            }
        });

        BTNSETENTA.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        BTNSETENTA.setText("70");
        BTNSETENTA.setContentAreaFilled(false);
        BTNSETENTA.setFocusPainted(false);
        BTNSETENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSETENTAActionPerformed(evt);
            }
        });

        BTNCIEN.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        BTNCIEN.setText("100");
        BTNCIEN.setContentAreaFilled(false);
        BTNCIEN.setFocusPainted(false);
        BTNCIEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCIENActionPerformed(evt);
            }
        });

        BTNCIENTOCINCUENTA.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        BTNCIENTOCINCUENTA.setText("150");
        BTNCIENTOCINCUENTA.setContentAreaFilled(false);
        BTNCIENTOCINCUENTA.setFocusPainted(false);
        BTNCIENTOCINCUENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCIENTOCINCUENTAActionPerformed(evt);
            }
        });

        BTNDOSIENTOS.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        BTNDOSIENTOS.setText("200");
        BTNDOSIENTOS.setContentAreaFilled(false);
        BTNDOSIENTOS.setFocusPainted(false);
        BTNDOSIENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDOSIENTOSActionPerformed(evt);
            }
        });

        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.setFocusPainted(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        BTONDiez.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        BTONDiez.setText("10");
        BTONDiez.setContentAreaFilled(false);
        BTONDiez.setFocusPainted(false);
        BTONDiez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTONDiezActionPerformed(evt);
            }
        });

        saldo7.setBorderPainted(false);
        saldo7.setContentAreaFilled(false);
        saldo7.setFocusPainted(false);
        saldo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldo7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTONDiez, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNCINCUENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNSETENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNCIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNCIENTOCINCUENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNDOSIENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(texto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(saldo7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(407, 407, 407))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto1)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(texto2)
                        .addGap(56, 56, 56)
                        .addComponent(BTONDiez, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTNCIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNCINCUENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNCIENTOCINCUENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(BTNSETENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(BTNDOSIENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saldo7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Vuelve al menú
     * @param evt click en el botón
     */
    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
               menu  v = new menu(tarjeta,cuenta);
        v.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_atrasActionPerformed
    /**
     * Permite elegir otro monto para la transaccion
     * @param evt click en el boton
     */
    private void saldo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldo7ActionPerformed
             MontoTransacciones v = new MontoTransacciones(cuenta,tarjeta,cuenta2);
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_saldo7ActionPerformed
    /**
     * Transfiere 10
     * @param evt click en el boton
     */
    private void BTONDiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTONDiezActionPerformed
     //----------------------------------------------------------------------------------------------------------------------
        cambio.transferirDinero("C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta+".txt","C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta2+".txt",10.0,cuenta,cuenta2);
        //----------------------------------------------------------------------------------------------------------------------
     menu i = new menu(tarjeta,cuenta);
     i.setVisible(true);
      dispose(); 
    }//GEN-LAST:event_BTONDiezActionPerformed
     /**
     * Transfiere 50
     * @param evt click en el boton
     */
    private void BTNCINCUENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCINCUENTAActionPerformed
//----------------------------------------------------------------------------------------------------------------------       
        cambio.transferirDinero("C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta+".txt","C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta2+".txt",50.0,cuenta,cuenta2);
        //----------------------------------------------------------------------------------------------------------------------
     menu i = new menu(tarjeta,cuenta);
     i.setVisible(true);
      dispose(); 
    }//GEN-LAST:event_BTNCINCUENTAActionPerformed
     /**
     * Transfiere 200
     * @param evt click en el boton
     */
    private void BTNDOSIENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDOSIENTOSActionPerformed
      //----------------------------------------------------------------------------------------------------------------------
        cambio.transferirDinero("C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta+".txt","C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta2+".txt",200.0,cuenta,cuenta2);
       //----------------------------------------------------------------------------------------------------------------------
     menu i = new menu(tarjeta,cuenta);
     i.setVisible(true);
      dispose(); 
    }//GEN-LAST:event_BTNDOSIENTOSActionPerformed
     /**
     * Transfiere 70
     * @param evt click en el boton
     */
    private void BTNSETENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSETENTAActionPerformed
       //----------------------------------------------------------------------------------------------------------------------
        cambio.transferirDinero("C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta+".txt","C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta2+".txt",70.0,cuenta,cuenta2);
       //----------------------------------------------------------------------------------------------------------------------
     menu i = new menu(tarjeta,cuenta);
     i.setVisible(true);
      dispose(); 
    }//GEN-LAST:event_BTNSETENTAActionPerformed
     /**
     * Transfiere 100
     * @param evt click en el boton
     */
    private void BTNCIENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCIENActionPerformed
       //----------------------------------------------------------------------------------------------------------------------
        cambio.transferirDinero("C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta+".txt","C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta2+".txt",100.0,cuenta,cuenta2);
       //----------------------------------------------------------------------------------------------------------------------
     menu i = new menu(tarjeta,cuenta);
     i.setVisible(true);
      dispose(); 
    }//GEN-LAST:event_BTNCIENActionPerformed
     /**
     * Transfiere 150
     * @param evt click en el boton
     */
    private void BTNCIENTOCINCUENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCIENTOCINCUENTAActionPerformed
        //----------------------------------------------------------------------------------------------------------------------
        cambio.transferirDinero("C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta+".txt","C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuenta2+".txt",150.0,cuenta,cuenta2);
        //----------------------------------------------------------------------------------------------------------------------
     menu i = new menu(tarjeta,cuenta);
     i.setVisible(true);
      dispose(); 
    }//GEN-LAST:event_BTNCIENTOCINCUENTAActionPerformed

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
            java.util.logging.Logger.getLogger(transaccionIII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaccionIII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaccionIII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaccionIII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        new transaccionIII(cuenta,tarjeta,cuenta2).setVisible(true);         
            }
        });
    }
    /**
     * Clase interna para representar un panel con una imagen de fondo.
     */
  class Fondo extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    /**
     * Establece un ícono redimensionado en un botón.
     * 
     * @param url la ruta del ícono
     * @param b el botón en el que se establecerá el ícono
     * @return el ícono redimensionado
     */
     public Icon setIcono(String url,JButton b){
         ImageIcon  icon= new ImageIcon(getClass().getResource(url)); 
         int ancho =b.getWidth();
         int alto =b.getHeight();
         ImageIcon icono= new ImageIcon(icon.getImage().getScaledInstance(ancho,alto,Image.SCALE_DEFAULT)); 
         return icono;
     }
    /**
     * Establece un ícono redimensionado en un botón cuando se presiona.
     * 
     * @param url la ruta del ícono
     * @param b el botón en el que se establecerá el ícono
     * @param ancho el ancho del ícono redimensionado
     * @param alto el alto del ícono redimensionado
     * @return el ícono redimensionado
     */
     public Icon setIconoPrecionado(String url,JButton b,int ancho,int alto){
       
         ImageIcon icon= new ImageIcon(getClass().getResource(url));
          int  width = b.getWidth()- ancho;
          int height = b.getHeight() - alto;
          ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width,height,Image.SCALE_DEFAULT));
          return icono;
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCIEN;
    private javax.swing.JButton BTNCIENTOCINCUENTA;
    private javax.swing.JButton BTNCINCUENTA;
    private javax.swing.JButton BTNDOSIENTOS;
    private javax.swing.JButton BTNSETENTA;
    private javax.swing.JButton BTONDiez;
    private javax.swing.JButton atras;
    private javax.swing.JButton saldo7;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
