package criminales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static javax.swing.JOptionPane.showMessageDialog;

public class Criminal extends Persona {

    protected String carFisicas;
    protected String carBiologicas;
    protected String redCriminal;
    private String analisis;
    FileReader archivo;
    BufferedReader lector;

    public Criminal() {
        archivo = null;
        lector = null;
    }

    public void setCarFisicas(String carFisicas) {
        this.carFisicas = carFisicas;
    }

    public void setCarBiologicas(String carBiologicas) {
        this.carBiologicas = carBiologicas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setHuella(String huella) {
        this.huella = huella;
    }

    public void setADN(String ADN) {
        this.ADN = ADN;
    }

    public void setRedCriminal(String redCriminal) {
        this.redCriminal = redCriminal;
    }
    
    public void setAnalisis(String analisis){
        this.analisis=analisis;
    }
    
    public String toString(){
        return "Nombre: "+nombre+"\nFecha de nacimiento: "+fechaNacimiento+"\nNacionalidad: "+nacionalidad
              +"\nCódigo de huella digital: "+huella+"\nCodigo de ADN: "+ADN+"\nRed criminal a la que pertenece: "+redCriminal
              +"\nCaracterísticas físicas: "+carFisicas+"\nCaracterísticas Biológicas: "+carBiologicas+"\nAnálisis psicológico: "+analisis;
    }

    public void escribe(String carpeta) {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try {
            archivo = new FileWriter("C:\\Users\\lenovo\\Desktop\\"+carpeta+"\\"+nombre+".txt");
            escritor = new PrintWriter(archivo);
            escritor.write(toString());
            showMessageDialog(null, "Se ha escrito correctamente");
        } catch (Exception e) {
            showMessageDialog(null, "Error al crear/escribir archivo");
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
    
    public void cosas(String carpeta) {
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
    }
}
//            escritor.println("Nombre: " + nombre);
//            escritor.println("Fecha de nacimiento: " + fechaNacimiento);
//            escritor.println("Nacionalidad: " + nacionalidad);
//            escritor.println("Codigo de huella digital: " + huella);
//            escritor.println("Codigo de ADN: " + ADN);
//            escritor.println("Red criminal a la que pertenece: " + redCriminal);
//            escritor.println("Características físicas:");
//            escritor.println(carFisicas);
//            escritor.println("Caracteristicas biológicas:");
//            escritor.println(carBiologicas);