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
public class Nodo {
    private Nodo next;
    private int key;

    public Nodo(){};
    
    public Nodo(Nodo next, int key) {
        this.next = next;
        this.key = key;
    }
    
    public Nodo(int key) {
        this.key = key;
    }
    
    
}
