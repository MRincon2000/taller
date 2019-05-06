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
class ChainNode <T> {
    T element;
    ChainNode<T> next;
    
    ChainNode() {
        this.element = null;
        this.next = null;
    }
    
    ChainNode(T element){
        this.element = element;
        this.next = null;
    }
    
    
    
            
}
