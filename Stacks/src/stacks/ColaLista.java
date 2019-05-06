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
        return isEmpty() ? null : front.element;
    }

    @Override
    public T getRearElement() {
        return isEmpty() ? null : rear.element;
    }

    @Override
    public void put(T theObject) {
        ChainNode<T> p = new ChainNode<>(theObject);
        if(front == null) front = p;
        else rear.next = p;        
        rear = p;
    }

    @Override
    public T remove() {
        return T;
    }
    
}
