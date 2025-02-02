/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Clase encargada de poder modificar la contraseña 
 * de una cuenta en específico
 * @author Milena
 */
public class contra extends javax.swing.JFrame {
    public Fondo imagen = new Fondo(); 
    static String tarjeta;
    static String cuenta;
    funcionalidad fun = new funcionalidad();
    String pinnew;

    /**
     * Crea una instancia de la clase tarjeta
     * @param tarjeta la tarjeta correspondiente a la cuenta
     * @param cuenta la cuenta a modificar
     */
    public contra(String tarjeta, String cuenta) {
        this.tarjeta = tarjeta;
        this.cuenta = cuenta;
        this.setContentPane(imagen);
        initComponents();
        setResizable(false);
        /*---------------------------------------------- parte de los botones1----------------------------------------------*/
        confirmar.setIcon(setIcono("/imagenes/confirmar.png", confirmar));
        confirmar.setPressedIcon(setIconoPrecionado("/imagenes/confirmar.png", confirmar, 30, 30));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idiomas = new javax.swing.JComboBox<>();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        contraActual = new javax.swing.JTextField();
        texto3 = new javax.swing.JLabel();
        contraNueva = new javax.swing.JTextField();
        texto4 = new javax.swing.JLabel();
        contraNueva1 = new javax.swing.JTextField();
        imagen2 = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();

        idiomas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        idiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "English", "Русский", " " }));
        idiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiomasActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto1.setBackground(new java.awt.Color(51, 51, 51));
        texto1.setFont(new java.awt.Font("Arial Black", 3, 48)); // NOI18N
        texto1.setText("BNB");

        texto2.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        texto2.setForeground(new java.awt.Color(0, 51, 102));
        texto2.setText("Ingrese la contraseña nueva:");
        texto2.setToolTipText("");

        contraActual.setBackground(new java.awt.Color(255, 204, 51));
        contraActual.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        contraActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraActual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contraActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActualActionPerformed(evt);
            }
        });

        texto3.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        texto3.setForeground(new java.awt.Color(0, 51, 102));
        texto3.setText("Ingrese la contraseña actual:");
        texto3.setToolTipText("");

        contraNueva.setBackground(new java.awt.Color(255, 204, 51));
        contraNueva.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        contraNueva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraNueva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contraNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraNuevaActionPerformed(evt);
            }
        });

        texto4.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        texto4.setForeground(new java.awt.Color(0, 51, 102));
        texto4.setText("Repita la nueva contraseña:");
        texto4.setToolTipText("");

        contraNueva1.setBackground(new java.awt.Color(255, 204, 51));
        contraNueva1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        contraNueva1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraNueva1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contraNueva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraNueva1ActionPerformed(evt);
            }
        });

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N

        confirmar.setBorderPainted(false);
        confirmar.setContentAreaFilled(false);
        confirmar.setFocusPainted(false);
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(82, 82, 82)
                                                    .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(contraNueva1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(contraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(242, 242, 242))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(contraNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)))))
                        .addComponent(imagen2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(texto3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(texto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contraNueva1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(texto4)
                        .addGap(18, 18, 18)
                        .addComponent(contraNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imagen2)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contraActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraActualActionPerformed

    private void contraNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraNuevaActionPerformed

    private void contraNueva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraNueva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraNueva1ActionPerformed
     /**
      * Al presionar el botón de confirmar llama al método para reemplazar
      * el pin anterior por el nuevo
      * @param evt Evento del click en el botón confirmar
      */
    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
      boolean cop = CambiodeContra();
        if(cop){
                try {
               reemplazarPinEnArchivo("C:\\Users\\Milena\\taller de pogra\\tarjetas\\" + tarjeta + ".txt", pinnew);
           } catch (IOException e) {
               e.printStackTrace();
           }
         JOptionPane.showMessageDialog(null, "CAMBIO DE PIN REALIZADO CON EXITO");
          menu pel = new menu(tarjeta, cuenta);
                       pel.setVisible(true);
                       dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR NUEVO PIN"+"\n"+"POSIBLES ERRORES:"+
                    "\n"+"*EL PIN ANTIGUO NO COINCIDE"+
                    "\n"+"*NO COINCIDEN LOS NUEVO PIN"+
                    "\n"+"*INTENTA INGRESAR LETRAS, SOLO SE PERMITEN NUMEROS"+
                    "\n"+"*EL NUEVO PIN TIENE MAS DE 3 CARACTERES");
     }
    }//GEN-LAST:event_confirmarActionPerformed

    private void idiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomasActionPerformed
      
    }//GEN-LAST:event_idiomasActionPerformed
    /**
     * Verifica si una cadena de texto contiene solo números.
     * @param texto La cadena de texto que se desea verificar.
     * @return true si la cadena contiene solo números, false en caso contrario.
     */
    public boolean esSoloNumeros(String texto) {
        return texto != null && !texto.isEmpty() && texto.matches("[0-9]+");
    }

    /**
     * Reemplaza el PIN en un archivo específico con un nuevo PIN.
     * @param archivoRuta La ruta del archivo donde se desea reemplazar el PIN.
     * @param nuevoPin El nuevo PIN que reemplazará al PIN existente en el archivo.
     * @throws IOException Si ocurre un error de entrada/salida durante la operación.
     */
    public static void reemplazarPinEnArchivo(String archivoRuta, String nuevoPin) throws IOException {
        File archivoOriginal = new File(archivoRuta);
        File archivoTemporal = new File(archivoRuta + ".tmp");

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoTemporal))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("pin: ")) {
                    linea = "pin: " + nuevoPin; // Reemplaza la línea con el nuevo pin
                }
                writer.write(linea);
                writer.newLine();
            }
        }

        // Elimina el archivo original
        if (!archivoOriginal.delete()) {
            System.out.println("No se pudo eliminar el archivo original");
            return;
        }
        // Renombra el archivo temporal al nombre del archivo original
        if (!archivoTemporal.renameTo(archivoOriginal)) {
            System.out.println("No se pudo renombrar el archivo temporal");
        }
    }

    private boolean CambiodeContra() {
        int pinant = fun.leerPin("C:\\Users\\Milena\\taller de pogra\\tarjetas\\" + tarjeta + ".txt");
        String pinants = contraActual.getText();
        pinnew = contraNueva1.getText();
        String pinnewConf = contraNueva.getText();
        int pintantcomp = Integer.parseInt(pinants);

        if (pinant == pintantcomp) {
            if (pinnew.equals(pinnewConf)) {
                if (esSoloNumeros(pinnew)) {
                    return true;
                } else {
                    return false; // El nuevo PIN no contiene solo números
                }
            } else {
                return false; // Los nuevos PIN no coinciden
            }
        } else {
            return false; // El PIN antiguo es incorrecto
        }
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
            java.util.logging.Logger.getLogger(contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField contraActual;
    private javax.swing.JTextField contraNueva;
    private javax.swing.JTextField contraNueva1;
    private javax.swing.JComboBox<String> idiomas;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    // End of variables declaration//GEN-END:variables
}
