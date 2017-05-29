
package espol.edu.ec.Main;

import espol.edu.ec.TDAs.LinkedList;

public class main {
    public static void main(String[] args) {
        
        LinkedList lista = new LinkedList();
        
        //addFirst(element)
        System.out.println("addFirst(element)");
        lista.addFirst(2);
        lista.addFirst(4);
        lista.addFirst(6);
        lista.addFirst(8);
        System.out.println(lista);
        System.out.println();
        
        
        //addLast(element)
        System.out.println("addLast(element)");
        lista.addLast("Ecuador");
        lista.addLast("España");
        lista.addLast("Inglaterra");
        lista.addLast("Colombia");
        System.out.println(lista);
        System.out.println("");
        
        
        System.out.println("Lista: "+lista);
        System.out.println("");
        String element="España";
        System.out.println("Element: "+element);
        //getIndex(element)
        System.out.println("getIndex(element): "+lista.getIndex(element));
        System.out.println("");
        int index=4;
        System.out.println("index: "+index);
        //getElement(index)
        System.out.println("getElement(index): "+lista.getElement(index));
        System.out.println("");
        
        
        //removeFirst()
        System.out.println("removeFirst()");
        lista.removeFirst();
        System.out.println("Lista: "+lista);
        System.out.println("");
        
        //removeLast()
        System.out.println("removeLast()");
        lista.removeLast();
        System.out.println("Lista: "+lista);
        System.out.println("");
        
        /*
        //isEmpty()
        System.out.println("isEmpty()");
        System.out.println(lista.isEmpty());
        System.out.println("");
        
        //toString()
        System.out.println("toString()");
        System.out.println(lista);
        System.out.println("");
        
        //contains(Element)
        System.out.println("contains(Element)");
        System.out.println(lista.contains("Ecuador"));
        System.out.println("");
        */
        
        
    }
    
}
