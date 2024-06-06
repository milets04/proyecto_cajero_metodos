/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Esta clase proporciona varias funcionalidades para leer y procesar datos de archivos.
 * @author Milena
 */
public class funcionalidad {
    /**
     * Lee el PIN de un archivo dado.
     * @param nombreArchivo La ruta del archivo de donde se leerá el PIN.
     * @return El PIN leído del archivo. Devuelve 0 si no se encuentra o si hay un error.
     */
    public  int leerPin(String nombreArchivo) {
         int pin = 0;
        try {
            // Abre el archivo
            File archivo = new File(nombreArchivo);
            Scanner scanner = new Scanner(archivo);

            // Busca la línea que contiene "pin:" y guarda lo que sigue
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                if (linea.contains("pin:")) {
                    String pinStr = linea.substring(linea.indexOf("pin:") + 4).trim();
                    pin = Integer.parseInt(pinStr);
                    break; // Termina el bucle al encontrar la línea con "pin:"
                }
            }

            // Cierra el scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("El PIN no es un número válido: " + e.getMessage());
        }
        return pin;
    }
    /**
     * Lee el saldo de un archivo dado. El saldo puede estar en diferentes monedas.
     *
     * @param nombreArchivo La ruta del archivo de donde se leerá el saldo.
     * @return El saldo total leído del archivo. Devuelve 0 si no se encuentra o si hay un error.
     */
      public  double leerSaldo(String nombreArchivo) {
        double saldo = 0;
        try {
            File archivo = new File(nombreArchivo);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                if (linea.contains("bs:") || linea.contains("eu:") || linea.contains("dlr:")) {
                    // Ajustamos la expresión regular para permitir decimales
                    String saldoString = linea.replaceAll("[^0-9.-]", "");
                    int puntoIndex = saldoString.indexOf('.');
                    if (puntoIndex != -1) {
                        saldoString = saldoString.substring(0, puntoIndex + 3); // Tomamos dos decimales después del punto
                    }
                    double saldoNumerico = Double.parseDouble(saldoString);
                    saldo += saldoNumerico;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("El saldo no es un número válido: " + e.getMessage());
        }
        return saldo;
    }
   /**
     * Verifica si un archivo existe.
     *
     * @param nombreArchivo La ruta del archivo a verificar.
     * @return true si el archivo existe, false en caso contrario.
     */
    public static boolean verificarExistencia(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists(); // Devuelve true si el archivo existe, false si no existe
    }
   /**
     * Lee el contenido de un archivo, excluyendo líneas que contienen "nombre:" o "pin:".
     *
     * @param rutaArchivo La ruta del archivo a leer.
     * @return El contenido del archivo como una cadena.
     */
    public static String leer(String rutaArchivo) {
        StringBuilder contenido = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            // Leer el contenido del archivo línea por línea
            while ((linea = br.readLine()) != null) {
                // Verifica si la línea contiene "nombre:" o "pin:"
                if (!linea.contains("nombre:") && !linea.contains("pin:")) {
                    contenido.append(linea).append("\n"); // Agregar la línea al contenido con un salto de línea
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contenido.toString();
    }
    
    /**
     * Obtiene el nombre de un archivo. El nombre está en una línea que contiene "nombre:".
     *
     * @param rutaArchivo La ruta del archivo de donde se leerá el nombre.
     * @return El nombre leído del archivo. Devuelve null si no se encuentra o si hay un error.
     */
    public static String obtenerNombre(String rutaArchivo) {
        String nombre = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            // Leer el contenido del archivo línea por línea
            while ((linea = br.readLine()) != null) {
                // Verifica si la línea contiene "nombre:"
                if (linea.contains("nombre:")) {
                    // Encuentra la posición de "nombre: " en la línea
                    int indiceNombre = linea.indexOf("nombre: ");
                    // Extrae el texto después de "nombre: "
                    nombre = linea.substring(indiceNombre + "nombre: ".length());
                    // Rompe el bucle después de encontrar el nombre
                    break;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return nombre;
    }
    }
   
