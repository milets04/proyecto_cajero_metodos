/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * Clase para mostrar la cuenta con su respectivo saldo
 * junto con su tipo de moneda y sus transacciones
 * @author Milena
 */
public class SaldoCuentas extends javax.swing.JFrame {
  public Fondo imagen = new Fondo(); 
  
  
   DefaultTableModel dt = new DefaultTableModel();
   JComboBox<String> idiomas;
  
   static String  cuentat;
   static String  tarjeta;
    double dato;
    /**
    * Instancia de SaldoCuentas.
    * 
    * @param cuentat La cuenta de la que se mostrará el saldo.
    * @param tarjeta La tarjeta asociada a la cuenta.
    */
    public SaldoCuentas(String cuentat,String tarjeta) {   
        this.cuentat=cuentat;
        this.tarjeta=tarjeta;
     funcionalidad fun = new funcionalidad();
     //--------------------------------------------------------------------------------
       dato = (double)fun.leerSaldo("C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuentat+".txt");
     String monedaCuenta = processFile("C:\\Users\\Milena\\taller de pogra\\cuentas\\"+cuentat+".txt");
     //--------------------------------------------------------------------------------------------------------
     historial his = new historial(cuentat,tarjeta);
     String dattt = his.findMatchingLines("C:\\Users\\Milena\\taller de pogra\\registro\\registros.txt",cuentat);
      System.out.println(dattt);
     this.setContentPane(imagen);
        initComponents();
        transpC(cuentat,dato,dattt,monedaCuenta);
     String []  nombres = new String []{"Fecha","Hora","TIpoTransaccion","Saldo","Cuenta"};
     dt.setColumnIdentifiers(nombres);
   
        setResizable(false);
                /*---------------------------------------------- parte de los botones1----------------------------------------------*/
        atras.setIcon(setIcono("/imagenes/atras.png",atras));
        atras.setPressedIcon(setIconoPrecionado("/imagenes/atras.png",atras,30,30));
         /*---------------------------------------------- parte de los botones2----------------------------------------------*/
                act.setIcon(setIcono("/imagenes/act.png",act));
        act.setPressedIcon(setIconoPrecionado("/imagenes/act.png",act,30,30));
    }
    
    /**
     * Procesa un archivo de texto para determinar la moneda asociada a una cuenta.
     * 
     * @param filePath La ruta del archivo que se va a procesar.
     * @return Un mensaje indicando la moneda de la cuenta.
     */    
     public static String processFile(String filePath) {
        StringBuilder result = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String message = recognizeCurrency(line);
                if (!message.isEmpty()) {
                    if (result.length() > 0) {
                        result.append("\n"); // Añadir un salto de línea entre mensajes
                    }
                    result.append(message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }
   /**
    * Determina la moneda asociada a una línea de texto.
    * @param line La línea de texto que se va a analizar.
    * @return Un mensaje indicando la moneda si se encuentra, de lo contrario, una cadena vacía.
    */
    public static String recognizeCurrency(String line) {
        if (line.contains("eu:")) {
            return "SU CUENTA ESTA EN EUROS";
        } else if (line.contains("dlr:")) {
            return "SU CUENTA ESTA EN DOLARES";
        } else if (line.contains("bs:")) {
            return "SU CUENTA ESTA EN BOLIVIANOS";
        } else {
            return "";
        }
    }
   
    
    /**
    * Cambia los textos de los componentes según el idioma seleccionado en el JComboBox.
    * Los textos se cambian para tres idiomas: Ruso, Inglés y Español
    */
    public void cambiarTextos() {
        if ("Русский".equals((String) idiomas.getSelectedItem())) {
            // Cambiar los textos de los componentes
            texto1.setText("ДОБРО ПОЖАЛОВАТЬ");
            texto2.setText("БАНАНИТА НАЦИОНАЛЬНЫЙ БАНК");
            texto3.setText("(Внимание 24 часа в сутки)");
        
        } else {
            if ("English".equals((String) idiomas.getSelectedItem())) {
            // Cambiar los textos de los componentes
            texto1.setText("WELCOME");
            texto2.setText("BANANITA NATIONAL BANK");
            texto3.setText("(Attention 24 hours a day)");
         
           } else {
                    if ("Español".equals((String) idiomas.getSelectedItem())) {
                    // Cambiar los textos de los componentes
                     texto1.setText("BIENVENIDOS");
                     texto2.setText("BANCO NACIONAL BANANITA");
                     texto3.setText("(Atención las 24 hrs del día)");
                  
                     }
                   }
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

        atras = new javax.swing.JButton();
        texto6 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        act = new javax.swing.JButton();
        cuenta = new javax.swing.JToggleButton();
        saldo = new javax.swing.JToggleButton();
        labeltxt = new javax.swing.JLabel();
        saldo1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.setFocusPainted(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        texto6.setBackground(new java.awt.Color(51, 51, 51));
        texto6.setFont(new java.awt.Font("Arial Black", 3, 48)); // NOI18N
        texto6.setText("BNB");

        texto3.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        texto3.setForeground(new java.awt.Color(0, 102, 153));
        texto3.setText("Historial de la Cuenta:");

        texto1.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        texto1.setForeground(new java.awt.Color(0, 102, 153));
        texto1.setText("Cuenta:");

        texto2.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        texto2.setForeground(new java.awt.Color(0, 102, 153));
        texto2.setText("Saldo:");

        act.setBorderPainted(false);
        act.setContentAreaFilled(false);
        act.setFocusPainted(false);
        act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actActionPerformed(evt);
            }
        });

        cuenta.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        cuenta.setForeground(new java.awt.Color(0, 102, 153));
        cuenta.setText("jToggleButton1");
        cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaActionPerformed(evt);
            }
        });

        saldo.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        saldo.setForeground(new java.awt.Color(0, 102, 153));
        saldo.setText("jToggleButton1");
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });

        labeltxt.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        labeltxt.setForeground(new java.awt.Color(0, 102, 153));
        labeltxt.setText("jLabel1");

        saldo1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        saldo1.setForeground(new java.awt.Color(0, 102, 153));
        saldo1.setText("jToggleButton1");
        saldo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addComponent(texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(saldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labeltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(texto3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto6)
                        .addComponent(saldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labeltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225)
                .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        menu  v = new menu(tarjeta,cuentat);
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actActionPerformed
        
    }//GEN-LAST:event_actActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoActionPerformed

    private void cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuentaActionPerformed

    private void saldo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldo1ActionPerformed
    /**
    * Convierte una cadena de texto en formato HTML, 
    * reemplazando los saltos de línea por etiquetas <br>
    * @param texto La cadena de texto que se desea convertir a formato HTML.
    * @return La cadena de texto en formato HTML.
    */
    public String StrToHtml(String texto) {
        return "<html>" + texto.replace("\n", "<br>") + "</html>";
    }
    /**
    * Transfiere datos a los componentes de la interfaz 
    * de usuario para mostrar la información de la cuenta.
    * @param nom El nombre de la cuenta.
    * @param dato El saldo de la cuenta.
    * @param textos Los textos adicionales relacionados con la cuenta.
    * @param datomoneda El tipo de moneda de la cuenta.
    */
     public void transpC(String nom, double dato,String textos, String datomoneda){
          String datos = String.valueOf(dato);
        cuenta.setText(nom);
        cuenta.setContentAreaFilled(false);
        cuenta.setBorderPainted(false);
        saldo.setText(datos);
        saldo.setContentAreaFilled(false);
        saldo.setBorderPainted(false);
       labeltxt.setText(StrToHtml(textos)+"\n");
        saldo1.setText(datomoneda);
        saldo1.setContentAreaFilled(false);
        saldo1.setBorderPainted(false);
    }
    
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
            java.util.logging.Logger.getLogger(SaldoCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaldoCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaldoCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaldoCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaldoCuentas(cuentat,tarjeta).setVisible(true);
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
    private javax.swing.JButton act;
    private javax.swing.JButton atras;
    private javax.swing.JToggleButton cuenta;
    private javax.swing.JLabel labeltxt;
    private javax.swing.JToggleButton saldo;
    private javax.swing.JToggleButton saldo1;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto6;
    // End of variables declaration//GEN-END:variables
}
