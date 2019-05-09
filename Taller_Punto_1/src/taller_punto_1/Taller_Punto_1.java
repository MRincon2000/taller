/*


*****IMPORTANTE******

Entrega realizada por:


Miguel Angel Rincon Otalora
Juan David Diaz Garcia
Rodrigo Vera Rodriguez



 */
package taller_punto_1;

/**
 *
 * @author Estudiante
 */
public class Taller_Punto_1 {

    public static void main(String[] args) {
     Cuenta c1=new Cuenta("JDiaz","Juan David") ;
     Cuenta c2= new Cuenta("MRincon","Miguel Rincon");
     Bandeja_de_Entrada b1=new Bandeja_de_Entrada();
     b1.registrarCuenta(c1);
     b1.registrarCuenta(c2);
     b1.registrarEmail(c1,c2,"Hola que tal, soy el chico de las poesias","Romeo");
     b1.registrarEmail(c2,c1,"Que se dice madrecita","La gloria de Lucho");
     b1.registrarEmail(c1,c2,"Oe llave","El man es German");
     b1.registrarEmail(c1,c2,"Usted se fue y la dejo en un rincon llorando","Ayer la vi");
     b1.registrarEmail(c1,c2,"Porque no es normal que mi corazon por ti ha cambiado de dueñoo","Lumbra");
        System.out.println("Enviados cuenta 1:");
     b1.listarEmails(c1);
        System.out.println("Enviados cuenta 2:");
     b1.listarEmails(c2);
        System.out.println(b1.cuenta_Mayor_Nro_Correos_Recibidos().getNombre()+"   "+b1.cuenta_Mayor_Nro_Correos_Recibidos().getNumero_de_correos());

    }
    
}
