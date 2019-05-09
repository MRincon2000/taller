/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_punto_1;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private String direccion;
    private String nombre;
    private int numero_de_correos;

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumero_de_correos() {
        return numero_de_correos;
    }
    public void setNumero_de_correos(int numero_de_correos) {
        this.numero_de_correos = numero_de_correos;
 
}

    public Cuenta(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
    }
    
}
