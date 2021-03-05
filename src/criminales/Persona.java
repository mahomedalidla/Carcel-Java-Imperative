/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminales;

/**
 *
 * @author el_be
 */
public class Persona{
    protected String nombre;
    protected String fechaNacimiento;
    protected String nacionalidad;
    protected String huella;
    protected String ADN;
    protected String registroDental;

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

    public void setRegistroDental(String registroDental) {
        this.registroDental = registroDental;
    }
}
