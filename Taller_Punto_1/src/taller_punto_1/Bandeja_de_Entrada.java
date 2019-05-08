/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller_punto_1;
import java.util.*;
public class Bandeja_de_Entrada {
    private TreeMap <Integer ,Email> bandeja; 

    public Bandeja_de_Entrada() {
        this.bandeja = new TreeMap <>();
    }
    
    public void registrarEmail(Cuenta destinatario,Cuenta remitente,String contenido, String asunto){
        Email email=new Email (destinatario,remitente,contenido,asunto);
        this.bandeja.put((this.bandeja.size()+1), email);
        destinatario.setNumero_de_correos((destinatario.getNumero_de_correos()+1));
    }
    public void listarEmails(Cuenta remitente){
        
        for(Email emails:bandeja.values()){
            if(remitente.getDireccion().equals(emails.getRemitente().getDireccion())){
                System.out.println("Asunto del correo:"+emails.getAsunto());
            }
        }
    }
    public int cuenta_Mayor_Nro_Correos_Recibidos(ArrayList<Cuenta> Cuentas){
        if(Cuentas.size()!=0){
      int mayor_valor = Cuentas.get(0).getNumero_de_correos();
      for(int i=0;i<Cuentas.size();i++){
      if(mayor_valor<Cuentas.get(i).getNumero_de_correos()){
          mayor_valor=Cuentas.get(i).getNumero_de_correos();
      }
      }  
    return mayor_valor;
    }
    }
}
    

