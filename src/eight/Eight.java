/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight;

/**
 *
 * @author Edgaras
 */
public class Eight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyLinkedList ml = new MyLinkedList();
        ml.add("Labas");
        ml.add("Pasauli");
        ml.add("!");
        ml.add("PAVYKO");
//        System.out.println(ml.get(1));
//        System.out.println(ml.size());
        ml.set(2, "!!!");
//        System.out.println(ml.get(2));
//        ml.remove(0);
        ml.insert(0, "Aloha");
        System.out.println(ml.get(1));
        System.out.println(ml);
        System.out.println(ml.size());
    }
}
