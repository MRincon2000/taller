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

    /*public Lista() {
        this.head = null;
        this.tail = null;
    }
    
    public Lista(Nodo head) {
        this.head = head;
    }

    public Lista(Nodo head, Nodo tail) {
        this.head = head;
        this.tail = tail;
    }*/
    
    public void pushFront(int key){
        Nodo nodo = new Nodo(head, key);
        head = nodo;
        if(tail == null) tail = head;        
    }
    
    public void imprimir(){
        if(head != null){
            Nodo nodo = head;
            while(nodo != null){
                System.out.println(nodo.key);
                nodo = nodo.next;
            }
        }
        else System.out.println("Lista Vacia");
    }
    
    
}
