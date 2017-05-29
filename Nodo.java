/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.TDAs;

/**
 *
 * @author edduard
 */
public class Nodo <E>{
    private E data;
    private Nodo<E> next;
    
    public Nodo( E data){
        this.data=data;
        this.next=this;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Nodo<E> getNext() {
        return next;
    }

    public void setNext(Nodo<E> next) {
        this.next = next;
    }
    @Override
    public String toString(){
        return this.data.toString();
    }
    
}
