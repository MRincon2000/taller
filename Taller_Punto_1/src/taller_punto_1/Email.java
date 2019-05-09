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
public class Email {
    private String contenido;
    private String asunto;
    private Cuenta destinatario;
    private Cuenta remitente;

    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String getAsunto() {
        return asunto;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public Cuenta getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(Cuenta destinatario) {
        this.destinatario = destinatario;
    }
    public Cuenta getRemitente() {
        return remitente;
    }
    public void setRemitente(Cuenta remitente) {
        this.remitente = remitente;
    }

    public Email(Cuenta destinatario, Cuenta remitente, String contenido, String asunto ) {
        this.contenido = contenido;
        this.asunto = asunto;
        this.destinatario = destinatario;
        this.remitente = remitente;
    }

    
    
    
    
            
}
