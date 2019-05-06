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
    
    
    @Override
    public boolean isEmpty() {
        return this.head == null;
    }
    
    @Override
    public T peek() {
        if( isEmpty() ) throw new EmptyStackException();
        return this.head.element;
    }

    @Override
    public void push(T theObject) {
        ChainNode<T> node = new ChainNode<>();
        this.head = node;
    }

    @Override
    public T pop() {
        if( isEmpty() ) throw new EmptyStackException();
        ChainNode<T> node = this.head;
        this.head = head.next;
        return node.element;
    }
    
}
