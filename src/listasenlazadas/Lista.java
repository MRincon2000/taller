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
public class Lista {
    private Nodo head;
    private Nodo tail;

    public Lista() {
    }
    
    public Lista(Nodo head) {
        this.head = head;
    }

    public Lista(Nodo head, Nodo tail) {
        this.head = head;
        this.tail = tail;
    }
    
    
}
