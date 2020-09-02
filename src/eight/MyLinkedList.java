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
public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public int size() {
        int count = 0;
        Node next = head;
        while (next != null) {
            count++;
            next = next.next;
        }
        return count;
    }

    public Object get(int index) {
        int count = 0;
        Node next = head;
        while (next != null) {
            if (index == count) {
                return next.value;
            }
            count++;
            next = next.next;
        }
        throw new IndexOutOfBoundsException();
    }

    public void set(int index, Object o) {
        int count = 0;
        Node next = head;
        while (next != null) {
            if (index == count) {
                next.value = o;
            }
            count++;
            next = next.next;
        }
    }
    
    public void add(Object o) {
        Node n = new Node();
        n.value = o;
        if (head == null) {
            head = n;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = n;
        }
    }

    public void remove(int index) {
        int count = 0;
        Node next;
        if (index == 0) {
            next = head.next;
            head = next;
        } else {
            next = head;
        }       
        while (next != null) {
            if (index - 1 == count) {
//                next = next.next;
                Node temp = next.next;
                next.next = temp.next;
//                next = temp.next;
            } else if (index - 1 != count) {
                next = next.next;
            }
            count++;
        }
    }
    
    public void insert(int index, Object o) {
        int count = 0;
        Node next;
        if (index == 0) {
            Node n = new Node();
            next = n;
            next.value = o;
            next.next = head;
            head = next;
        } else {
            next = head;
            Node n = new Node();
            while(next != null) {
                if (index - 1 == count) {
                    Node temp = next.next;
                    next.next = n;
                    n.value = o;
                    n.next = temp;
                }
                count ++;
                next = next.next;
            }
            if (next == null && index > count || index < 0) {
                throw new IndexOutOfBoundsException();
            }
            
        }
    }

    public String toString() {
        String s = "";
        Node next = head;
        if (size() == 0) {
            return "{}";
        } else if (size() == 1) {
            return "{0: " + head.value + "}";
        } else {
            for (int i = 0; i < size(); i++) {
                if (i == 0) {
                    s += "{" + i + ": " + next.toString() + ";";
                } else if (i != size() - 1) {
                    s += " " + i + ": " + next.toString() + ";";
                } else {
                    s += " " + i + ": " + next.toString() + "}";
                }
                next = next.next;
            }
            return s;
        }
    }

//Inner class
    private class Node {

        Object value;
        Node next;

        public String toString() {
            return "" + value;
        }
    }
}
