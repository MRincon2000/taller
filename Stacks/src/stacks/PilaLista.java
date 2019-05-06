/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.EmptyStackException;

/**
 *
 * @author Estudiante
 */
public class PilaLista<T> implements Stack<T>  {
    
    ChainNode<T> head;
    int size;

    public PilaLista() {
        this.head = new ChainNode<>();
        this.size = 0;
    }
    
    
    
    @Override
    public boolean isEmpty() {
        return this.head == null;
    }
    
    @Override
    public T peek() {
        if( isEmpty() ){
            System.out.println("Pero ta vaciaaaa");
            return null;
        } 
        else return this.head.element;
    }

    @Override
    public void push(T theObject) {
        ChainNode<T> node = new ChainNode<>(theObject);
        node.next = this.head.next;
        this.head = node;
        size++;
    }

    @Override
    public T pop() {
        if( isEmpty() ){
            System.out.println("Pero ta vaciaaaa");
            return null;
        }
        
        ChainNode<T> node = this.head;        
        this.head = this.head.next;
        size--;
        return node.element;
    }
    
}
