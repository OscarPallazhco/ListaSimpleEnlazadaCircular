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
public class LinkedList<E> implements List<E>{
    
    private Nodo<E> last;
    private int efectivo;
    
    public LinkedList(){
        last=null;
        this.efectivo=0;
    }

    @Override
    public String toString(){
        String x="[" ;
        if(this.efectivo>0){            
            Nodo<E> i = this.last.getNext();
            do{
                x=x+i.getData()+",";
                i=i.getNext();
            }while(i!=this.last.getNext());
            x=x.substring(0,x.length()-1)+"]";
            return x;    
        }
        return x+"]";
    }

    
    @Override
    public boolean isEmpty() {
        return (this.efectivo==0);
    }

    @Override
    public E getElement(int index) {
        if(this.last!=null && index>=0 && index<this.efectivo){
            int cont=0;
            Nodo<E> i = this.last.getNext();
            do{
                if(cont==index)
                    return i.getData();
                cont++;
                i=i.getNext();
            }while(i!=this.last.getNext());
        }
        return null;
    }

    @Override
    public int getIndex(E element) {
        if(element!= null && this.last!=null){
            int cont=0;
            Nodo<E> i = this.last.getNext();
            do{
                if(i.getData().equals(element))
                    return cont;
                i=i.getNext();
                cont++;
            }while(i!=this.last.getNext());
        }
        return -1;
    }

    @Override
    public boolean add(E element, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addFirst(E element) {
        if(element==null)
            return false;
        Nodo<E> nuevo = new Nodo<>(element);
        if(this.isEmpty()){
            this.last=nuevo;
            this.efectivo++;
        }
        else{
            nuevo.setNext(this.last.getNext());
            this.last.setNext(nuevo);
            this.efectivo++;
        }
        return true;            
    }

    @Override
    public boolean addLast(E element) {
        if(element==null)
            return false;
        Nodo<E> nuevo = new Nodo<>(element);
        if(this.isEmpty()){
            this.last=nuevo;
            this.efectivo++;
        }
        else{
            nuevo.setNext(this.last.getNext());
            this.last.setNext(nuevo);
            this.last=nuevo;
            this.efectivo++;
        }
        return true;   
    }

    @Override
    public boolean removeIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeElement(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeFirst() {
        if(this.last!=null){
            if(this.last.getNext().equals(this.last))
                this.last=null;
            else{
                Nodo<E> tmp = this.last.getNext().getNext();
                this.last.getNext().setNext(null);
                this.last.setNext(tmp);
            }
            this.efectivo--;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeLast() {
        if(this.last!=null){
            if(this.last.getNext().equals(this.last))
                this.last=null;
            else{
                Nodo<E> i = this.last.getNext();
                do{
                    if(i.getNext().equals(this.last)){
                        i.setNext(this.last.getNext());
                        this.last.setNext(null);
                        this.last=i;
                        
                    }
                    i=i.getNext();
                }while(i!=this.last.getNext());
            }
            this.efectivo--;
            return true;
        }
        return false;
    }

    @Override
    public List<E> concat(List<E> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return this.efectivo;
    }

    @Override
    public boolean contains(E element) {
        if(this.last!=null && element!=null){
            Nodo<E> i = this.last.getNext();
            do{
            if(i.getData().equals(element))
                return true;
            i=i.getNext();
            }while(i!=this.last.getNext());
        }
        return false;
    }

    @Override
    public List<E> slicing(int inicio, int fin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
