/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author sdelgadom
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.pushFront(10);
        lista.pushFront(20);
        lista.pushFront(30);
        lista.pushFront(5);
        lista.imprimir();
    }
    
}
