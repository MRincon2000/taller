/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller_punto_1;
import java.util.*;
public class Bandeja_de_Entrada {
    private TreeMap <Integer ,Email> bandeja; 
    private ArrayList<Cuenta>cuentas;
    public Bandeja_de_Entrada() {
        this.bandeja = new TreeMap <>();
        this.cuentas= new ArrayList<>();
    }
    public void registrarCuenta(Cuenta c){
        this.cuentas.add(c);
  
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
    public void agregarCuenta(Cuenta c){
        
    }
    public Cuenta cuenta_Mayor_Nro_Correos_Recibidos(){
    int c=0;
        if(this.cuentas.size()!=0){
    
      for(int i=0;i<this.cuentas.size();i++){
      if(this.cuentas.get(c).getNumero_de_correos()<this.cuentas.get(i).getNumero_de_correos()){
     c=i;
      }
      }  
    }
      return this.cuentas.get(c); 
    }

}
    

