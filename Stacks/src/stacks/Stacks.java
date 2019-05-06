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
public class Stacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PilaLista<Libro> a = new PilaLista<>();
        
        a.push(new Libro(0, "Cien años de soledad"));
        a.push(new Libro(1, "Ensayo sobre la ceguera"));
        a.push(new Libro(2, "Crimen y Castigo"));
        
        
        System.out.println(a.size);
        System.out.println(a.pop().titulo);
        System.out.println(a.peek());
    }
    
}
