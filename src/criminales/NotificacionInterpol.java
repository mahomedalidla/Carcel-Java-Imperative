/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author el_be
 */
public class NotificacionInterpol {
    private String asunto;
    private String descripcion;
    private String pais;

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setPais(String pais){
        this.pais=pais;
    }
    
    public String toString(){
        return "Asunto: "+asunto+"\nDescripcion: "+descripcion+"\nPais: "+pais;
    }

    public void escribe(String carpeta) {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try {
            archivo = new FileWriter("C:\\Users\\lenovo\\Desktop\\"+carpeta+"\\"+asunto+".txt");
            escritor = new PrintWriter(archivo);
            escritor.write(toString());
            showMessageDialog(null, "Se ha escrito correctamente");
        } catch (Exception e) {
            //showMessageDialog(null, "Error al crear/escribir archivo");
            e.getMessage();
        } finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
            } catch (Exception e2) {
                showMessageDialog(null, "No tiene nombre del archivo");
            }//catch
        }//finally
    }//escribe()

    public String leer(String ruta, String carpeta) {
        FileReader archivo = null;
        BufferedReader lector = null;
        String leido = "";
        String tempContent = "";

        try {
            archivo = new FileReader("C:\\Users\\lenovo\\Desktop\\"+carpeta+"\\"+ruta + ".txt");
            lector = new BufferedReader(archivo);

            while (tempContent != null) {
                tempContent = lector.readLine();
                if (tempContent != null) {
                    leido += tempContent + "\n";
                }
            }

        } catch (Exception e) {
            return e.getMessage();
        } finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
            } catch (Exception e2) {
                return "Error al intentar cerrar.";
            }
        }
        return leido;
    }
    
    public String cosas(String carpeta) {
        String cadena = "", files;
        String sDirectorio = "C:\\Users\\lenovo\\Desktop\\"+carpeta;
        File f = new File(sDirectorio);
        if (f.exists()) {
            File[] ficheros = f.listFiles();
            for (int x = 0; x < ficheros.length; x++) {
                if (ficheros[x].isFile()) {
                    files = ficheros[x].getName();
                    if (files.endsWith(".txt") || files.endsWith(".TXT")) {
                        cadena += (ficheros[x].getName()) + "\n";
                    }
                }
            }
            showMessageDialog(null, cadena);
        } else {

        }
        return cadena;
    }
}
