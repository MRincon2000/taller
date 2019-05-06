/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author Estudiante
 */
public class ColaLista<T> implements Queue<T> {
    
    ChainNode<T> front;
    ChainNode<T> rear;
    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public T getFrontElement() {
        return front.element;
    }

    @Override
    public T getRearElement() {
        return rear.element;
    }

    @Override
    public void put(T theObject) {
        
    }

    @Override
    public T remove() {
        
    }
    
}
