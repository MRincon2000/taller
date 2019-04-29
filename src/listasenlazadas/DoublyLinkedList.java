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
public class DoublyLinkedList {
    NodoD head;
    NodoD tail;
    NodoD prev;
    
    public class NodoD{
        int key; 
        NodoD next;
        NodoD prev;

        public NodoD(){
        }

        public NodoD(int key) {
            this.key = key;
        }

        public NodoD(int key, NodoD next, NodoD prev) {
            this.key = key;
            this.next = next;
            this.prev = prev;
        } 
    }
    
    public void pushBack(int key){
        NodoD nodo = new NodoD(key, null, tail);
        
        if(head == null){ 
            tail = nodo;
            head = tail;
            nodo.prev = null;
        }
        else{
            tail.next = nodo;
            tail = nodo;
        } 
    }
    
    public void pushFront(int key) {
        NodoD nodo = new NodoD(key);
        nodo.next = head;
        head = nodo;
        if (tail == null) {
            tail = head;
        }
    }
    
    public void imprimir() {
        if (head != null) {
            NodoD nodo = head;
            while (nodo != null) {
                System.out.println(nodo.key);
                nodo = nodo.next;
            }
        } else {
            System.out.println("Lista Vacia");
        }
    }
    
    
}
