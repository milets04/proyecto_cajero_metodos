/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Stack;

/**
 * Clase encargada de crear los datos para el historial 
 * para la clase de saldos
 * @author Milena
 */
public class historial {
    
    
    String cuenta;
    String Accion;
    /**
     * Crea una instancia de la clase
     * @param cuenta a la que se agregarán los datos
     * @param Accion
     */
    public historial(String cuenta,String Accion){
        this.cuenta=cuenta;
        this.Accion=Accion;  
    }
    //----------------------------------------------
    String dir = "C:\\Users\\Milena\\taller de pogra\\registro\\registros.txt";
    //----------------------------------------------
    
    /**
    * Encuentra y devuelve hasta 10 líneas en un archivo que comienzan con un prefijo dado.
    * Las líneas se leen desde el final del archivo hacia el principio.
    *
    * @param filePath La ruta del archivo donde se buscarán las líneas.
    * @param prefix El prefijo que deben tener las líneas buscadas.
    * @return Una cadena que contiene hasta 10 líneas que comienzan con el prefijo dado, separadas por saltos de línea.
    */
  public static String findMatchingLines(String filePath, String prefix) {
       Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int count = 0;
        String prefixWithColon = prefix + ": ";

        // Primero leemos el archivo y guardamos las líneas en un stack
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stack.push(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ahora leemos desde el stack (que nos da las líneas de abajo hacia arriba)
        while (!stack.isEmpty() && count < 10) {
            String line = stack.pop();
            if (line.startsWith(prefixWithColon)) {
                // Guardamos toda la línea que coincide con el prefijo
                result.append(line).append("\n");
                count++;
            }
        }

        return result.toString();
    }
    /**
     * Consigue la fecha actual del programa
     * @return la fecha actual
     */
    public static LocalDate obtenerFechaActual() {
        
        return LocalDate.now();
    }
    /**
     * Consigue la fecha actual con un formato específico
     * @return la fecha actual 
     */
     public static String getCurrentTimeWithIntegerSeconds() {
        // Obtén la hora actual
        LocalDateTime now = LocalDateTime.now();
        
        // Formatea la hora actual a una cadena, incluyendo segundos como enteros
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return now.format(formatter);
    }
   /**
    * Agrega una nueva línea al final de un archivo.
    *
    * @param filePath La ruta del archivo donde se agregará la nueva línea.
    * @param nuevaLinea La nueva línea que se agregará al archivo.
    */
     public static void agregarLinea(String filePath, String nuevaLinea) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(nuevaLinea);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     /**
      * Guarda las modificaciones realizadas
      */
     public void guardar(){
         LocalDate fechaActual = LocalDate.now();
        // Convertir la fecha actual a String
        String fechaString = fechaActual.toString();

        // Obtener la hora actual
       
        // Convertir la hora actual a String
       String currentTime = getCurrentTimeWithIntegerSeconds();
        String hist = cuenta+": "+fechaString+" "+currentTime+" "+Accion+"";
        agregarLinea(dir,hist);
     }
    
}
