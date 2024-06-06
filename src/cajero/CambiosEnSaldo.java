/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Esta clase es para realizar diversas operaciones de verificación 
 * y modificación de saldos en cuentas bancarias.
 * @author Milena
 */
public class CambiosEnSaldo {
    /**
     * Verifica si un archivo de cuenta existe en la ruta especificada. 
     * @param rutaArchivo la ruta del archivo a verificar
     * @return true si el archivo existe, false en caso contrario
     */
      public boolean verificarCuenta(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        
        return archivo.exists();
    }
    /**
     * Verifica si un archivo de cuenta existe en la ruta especificada.
     * @param rutaArchivo la ruta del archivo a verificar
     * @return true si el archivo existe, false en caso contrario
     */  
      public boolean verificarMisma(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        
        return archivo.exists();
    }
    /**
     * Verifica si dos archivos de cuenta contienen la misma moneda
     * comparando las dos primeras letras de la primera línea.
     * @param archivo1 la ruta del primer archivo
     * @param archivo2 la ruta del segundo archivo
     * @return true si ambos archivos contienen la misma moneda, false en caso contrario o en caso de error
     */
     public boolean verificarMonedaCoin(String archivo1, String archivo2) {
        try (BufferedReader br1 = new BufferedReader(new FileReader(archivo1));
             BufferedReader br2 = new BufferedReader(new FileReader(archivo2))) {
             
            String linea1 = br1.readLine();
            String linea2 = br2.readLine();
            
            if (linea1 != null && linea1.length() >= 2 && linea2 != null && linea2.length() >= 2) {
                String primerasDosLetras1 = linea1.substring(0, 2);
                String primerasDosLetras2 = linea2.substring(0, 2);
                
                return primerasDosLetras1.equals(primerasDosLetras2);
            } else {
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false; // En caso de error, retorna false
        }
    }
    /**
     * Transfiere dinero entre dos cuentas, 
     * actualizando los saldos en los archivos correspondientes.
     * @param cuenta1 la ruta del archivo de la primera cuenta
     * @param cuenta2 la ruta del archivo de la segunda cuenta
     * @param deposito el monto a transferir 
     * @param cuentanumeral1 el identificador de la primera cuenta
     * @param cuentanumeral2 el identificador de la segunda cuenta
     */
       public void transferirDinero(String cuenta1, String cuenta2, double deposito,String cuentanumeral1,String cuentanumeral2) {
        // Variables para almacenar los saldos
        double saldoCuenta1 = 0;
        double saldoCuenta2 = 0;
        String prefixCuenta1 = "";
        String prefixCuenta2 = "";
        
        // Leer saldos de las cuentas
        try (BufferedReader br1 = new BufferedReader(new FileReader(cuenta1));
             BufferedReader br2 = new BufferedReader(new FileReader(cuenta2))) {
            
            // Leer el saldo de cuenta1
            String linea1 = br1.readLine();
            if (linea1 != null && linea1.contains(": ")) {
                prefixCuenta1 = linea1.substring(0, linea1.indexOf(": ") + 2); // Obtener el prefijo "xx: "
                saldoCuenta1 = Double.parseDouble(linea1.substring(linea1.indexOf(": ") + 2).trim());
            }
            
            // Leer el saldo de cuenta2
            String linea2 = br2.readLine();
            if (linea2 != null && linea2.contains(": ")) {
                prefixCuenta2 = linea2.substring(0, linea2.indexOf(": ") + 2); // Obtener el prefijo "xx: "
                saldoCuenta2 = Double.parseDouble(linea2.substring(linea2.indexOf(": ") + 2).trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        
        // Verificar saldo suficiente en cuenta1
        if (saldoCuenta1 < deposito) {
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Terminar la función si el saldo es insuficiente
        }
        
        // Decrementar el saldo de cuenta1 y sumar el depósito a cuenta2
        saldoCuenta1 -= deposito;
        saldoCuenta2 += deposito;

        // Guardar el historial de transacciones (esto es opcional y depende de tu implementación)
        historialTransacciones histT = new historialTransacciones(cuentanumeral1, cuentanumeral2, deposito);
        histT.guardarIngreso();
        histT.guardarDeposito();
        
        // Escribir los nuevos saldos en los archivos
        try (BufferedWriter bw1 = new BufferedWriter(new FileWriter(cuenta1));
             BufferedWriter bw2 = new BufferedWriter(new FileWriter(cuenta2))) {
            
            bw1.write(prefixCuenta1 + saldoCuenta1); // Escribir el prefijo y el nuevo saldo
            bw1.newLine();
            
            bw2.write(prefixCuenta2 + saldoCuenta2); // Escribir el prefijo y el nuevo saldo
            bw2.newLine();
            
            System.out.println("Transferencia exitosa.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Incrementa el saldo de una cuenta en el archivo especificado.
     * @param nombreArchivo la ruta del archivo de la cuenta
     * @param incremento el monto a agregar
     * @throws IOException si ocurre un error de entrada/salida
     */
    public static void IncrementoSaldo(String nombreArchivo, double incremento) throws IOException {
        // Abrir el archivo para lectura
        try {
            File archivo = new File(nombreArchivo);
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            // Leer la primera línea y extraer el saldo
            String primeraLinea = lector.readLine();
            double saldo = Double.parseDouble(primeraLinea.split(": ")[1]);

            // Cerrar el lector
            lector.close();

            

            // Decrementar el saldo
            saldo += incremento;
            
            

            // Abrir el archivo para escritura
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));

            // Escribir el nuevo saldo en el archivo
            escritor.write(primeraLinea.split(": ")[0] + ": " + saldo);

            // Cerrar el escritor
            escritor.close();

            System.out.println("Saldo decrementado y actualizado en el archivo.");
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Formato de archivo incorrecto.");
        }}
    /**
     * Decrementa el saldo de una cuenta en el archivo especificado.
     * @param nombreArchivo la ruta del archivo de la cuenta
     * @param decremento el monto a reducir 
     * @param cuenta el identificador de la cuenta para el historial
     */
    public  void DecrementoSaldo(String nombreArchivo, double decremento,String cuenta) {
        try {
            // Abrir el archivo para lectura
            File archivo = new File(nombreArchivo);
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            // Leer la primera línea y extraer el saldo
            String primeraLinea = lector.readLine();
            double saldo = Double.parseDouble(primeraLinea.split(": ")[1]);

            // Cerrar el lector
            lector.close();

            // Verificar si el decremento es mayor que el saldo actual
            if (decremento > saldo) {
                JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
                return; // Salir de la función si el decremento es mayor
            }

            // Decrementar el saldo
            saldo -= decremento;
            JOptionPane.showMessageDialog(null, "RETIRO REALIZADO CON EXITO");
             historial his = new historial(cuenta,"SE  RETIRO DINERO: "+decremento); 
             
             his.guardar();
            // Abrir el archivo para escritura
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));

            // Escribir el nuevo saldo en el archivo
            escritor.write(primeraLinea.split(": ")[0] + ": " + saldo);

            // Cerrar el escritor
            escritor.close();

            System.out.println("Saldo decrementado y actualizado en el archivo.");
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Formato de archivo incorrecto.");
        }
    }
    
    /**
     * Verifica si una línea en el archivo contiene "bs:".
     * @param nombreArchivo la ruta del archivo a verificar
     * @return true si se encuentra "bs:", false en caso contrario o en caso de error
     */
     public boolean lineaContieneBs(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains("bs:")) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    /**
     * Verifica si una línea en el archivo contiene "eu:".
     * @param nombreArchivo la ruta del archivo a verificar
     * @return true si se encuentra "eu:", false en caso contrario o en caso de error
     */
      public boolean lineaContieneEu(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains("eu:")) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    /**
     * Verifica si una línea en el archivo contiene dlr:".
     * @param nombreArchivo la ruta del archivo a verificar
     * @return true si se encuentra "dlr:", false en caso contrario o en caso de error
     */
       public boolean lineaContieneDlr(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains("dlr:")) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
       
   /**
    * Convierte una cantidad de bolivianos a dólares.
    *
    * @param bolivianos la cantidad de bolivianos a convertir
    * @return la cantidad equivalente en dólares
    */    
   public static double bolivianosADolares(double bolivianos) {
        return bolivianos *0.145;
    }

    /**
     * Convierte una cantidad de dólares a bolivianos
     * @param dolares la cantidad de dólares a convertir
     * @return la cantidad equivalente en bolivianos
     */
    public static double dolaresABolivianos(double dolares) {
        return dolares *6.89655;
    }

    /**
     * Convierte una cantidad de bolivianos a euros
     * @param bolivianos la cantidad de bolivianos a convertir
     * @return la cantidad equivalente en euros
     */
    public static double bolivianosAEuros(double bolivianos) {
        return bolivianos *0.11;
    }

    /**
     * Convierte una cantidad de euros a bolivianos
     * @param euros la cantidad de euros a convertir
     * @return la cantidad equivalente en bolivianos
     */
    public static double eurosABolivianos(double euros) {
        return euros * 8.88;
    }

    /**
     * Convierte una cantidad de euros a dólares
     * @param euros la cantidad de euros a convertir
     * @return la cantidad equivalente en dólares
     */
    public static double eurosADolares(double euros) {
        return euros *1.18;
    }

    /**
     * Convierte una cantidad de dólares a euros
     * @param dolares la cantidad de dólares a convertir
     * @return la cantidad equivalente en euros
     */
    public static double dolaresAEuros(double dolares) {
        return dolares * 0.85;
    }
    /**
     * Reemplaza las líneas que contienen "eu:" en un archivo por "bs:" 
     * seguido de un nuevo contenido.
     * @param filePath la ruta del archivo
     * @param nuevoContenido el nuevo contenido a reemplazar
     */
    public static void reemplazarBsPorEu(String filePath, double nuevoContenido) {
        StringBuilder contenido = new StringBuilder();

        // Leer el archivo y reemplazar líneas en memoria
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains("eu:")) {
                    System.out.println("ok");
                    contenido.append("bs: ").append(nuevoContenido).append(System.lineSeparator());
                } else {
                    contenido.append(currentLine).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Escribir el contenido actualizado de vuelta al archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(contenido.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reemplaza las líneas que contienen "bs:" en un archivo por "eu:"
     * seguido de un nuevo contenido.
     * @param filePath la ruta del archivo
     * @param nuevoContenido el nuevo contenido a reemplazar
     */
    public static void reemplazarEuPorBs(String filePath, double nuevoContenido) {
        StringBuilder contenido = new StringBuilder();

        // Leer el archivo y reemplazar líneas en memoria
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains("bs:")) {
                    
                    contenido.append("eu: ").append(nuevoContenido).append(System.lineSeparator());
                } else {
                    contenido.append(currentLine).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Escribir el contenido actualizado de vuelta al archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(contenido.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Reemplaza las líneas que contienen "dlr:" en un archivo por "bs:" 
     * seguido de un nuevo contenido.
     * @param filePath la ruta del archivo
     * @param nuevoContenido el nuevo contenido a reemplazar
     */
     public static void reemplazarBsPorDlr(String filePath, double nuevoContenido) {
        StringBuilder contenido = new StringBuilder();

        // Leer el archivo y reemplazar líneas en memoria
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains("dlr:")) {
                    contenido.append("bs: ").append(nuevoContenido).append(System.lineSeparator());
                } else {
                    contenido.append(currentLine).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Escribir el contenido actualizado de vuelta al archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(contenido.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     /**
      * Reemplaza las líneas que contienen "bs:" en un archivo por "dlr:" 
      * seguido de un nuevo contenido.
      * @param filePath la ruta del archivo
      * @param nuevoContenido el nuevo contenido a reemplazar
      */
     public static void reemplazarDlrPorBs(String filePath, double nuevoContenido) {
        StringBuilder contenido = new StringBuilder();

        // Leer el archivo y reemplazar líneas en memoria
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains("bs:")) {
                    contenido.append("dlr: ").append(nuevoContenido).append(System.lineSeparator());
                } else {
                    contenido.append(currentLine).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Escribir el contenido actualizado de vuelta al archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(contenido.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     /**
      * Reemplaza las líneas que contienen "eu:" en un archivo por "dlr:" 
      * seguido de un nuevo contenido.
      * @param filePath la ruta del archivo
      * @param nuevoContenido el nuevo contenido a reemplazar
      */
    public static void reemplazarDlrPorEu(String filePath, double nuevoContenido) {
        StringBuilder contenido = new StringBuilder();

        // Leer el archivo y reemplazar líneas en memoria
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains("eu:")) {
                    contenido.append("dlr: ").append(nuevoContenido).append(System.lineSeparator());
                } else {
                    contenido.append(currentLine).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Escribir el contenido actualizado de vuelta al archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(contenido.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   /**
    * Reemplaza las líneas que contienen "dlr:" en un archivo por "eu:"
    * seguido de un nuevo contenido.
    * @param filePath la ruta del archivo
    * @param nuevoContenido el nuevo contenido a reemplazar
    */
    public static void reemplazarEuPorDlr(String filePath, double nuevoContenido) {
        StringBuilder contenido = new StringBuilder();

        // Leer el archivo y reemplazar líneas en memoria
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains("dlr:")) {
                    contenido.append("eu: ").append(nuevoContenido).append(System.lineSeparator());
                } else {
                    contenido.append(currentLine).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Escribir el contenido actualizado de vuelta al archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(contenido.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
