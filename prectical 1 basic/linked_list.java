// package linked_list;

import javax.lang.model.util.ElementScanner14;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

class node {

    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;

    }
}

public class linked_list {

    node first = null;
    node last = null;
    int size = 0;

    public void printlinkedlist() {
        node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public void add(int element) {
        node newnode = new node(element);

        if (first == null && last == null) {
            first = newnode;
            last = newnode;
        } else {

            last.next = newnode;
            last = newnode;
        }
        size++;
    }

    public void addfirst(int element) {
        node newnode = new node(element);
        if (first == null && last == null) {
            first = newnode;
            last = newnode;
        } else {
            newnode.next = first;
            first = newnode;

        }
        size++;

    }

    public void removefirst() {
        if (first == null && last == null) {
            System.out.println("linked list is empty");
            return;
        } else if (first == last) {
            first = last = null;

        } else
            first = first.next;
        size--;
    }

    public void removelast() {
        node temp = first;
        if (first == null && last == null) {
            System.out.println("linked list is empty");
            return;
        } else if (first == last) {
            first = last = null;

        } else
            while (temp.next != last) {
                temp = temp.next;
            }
        temp.next = null;
        last = temp;
        size--;
    }

    public void add_at_index(int index, int element) {
        node newnode = new node(element);
        if (index > size) {
            System.out.println("Index out of bound :");
            return;
        }
        if (index == 0)
            addfirst(element);
        else if (index == size)
            add(element);
        else {
            node temp = first;
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            size++;
        }
    }

    public void remove_at_index(int index) {
        if (index > size) {
            System.out.println("Index out of bound: " + index);
            return;
        }
        if (index == 0)
            removefirst();

        else if (index == size)
            removelast();
        else {

            node temp = first;
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            size--;

        }

    }

    public void remove_first_occurrence(int element) {

        if (first.data == element)
        removefirst();

        node temp = first;
        node prev = null;

        int f=0;
        while (temp.next != null){
            if(temp.data == element) {
                f = 1;
                break;
            } 
            
            prev = temp;
            temp = temp.next;
        }
        if (f == 1){
            prev.next = temp.next;

        }
        size --;
 
    }

    public static void main(String[] args) {
        linked_list ll = new linked_list();
        // ll.add(10);
        // ll.add(20);
        // ll.add(30);
        // ll.add(40);
        // ll.add(50);
        // ll.add(60);

        // ll.printlinkedlist();
        // System.out.println("\n size: " + ll.size);

        // ll.addfirst(0);
        // ll.addfirst(-10);
        // ll.addfirst(-20);
        // ll.addfirst(-30);
        // ll.printlinkedlist();
        // System.out.println("\n size: " + ll.size);

        // ll.removefirst();
        // ll.printlinkedlist();
        // System.out.println("\n size: " + ll.size);

        // ll.removelast();
        // ll.printlinkedlist();
        // System.out.println("\n size: " + ll.size);

        ll.add_at_index(0, 10);
        ll.add_at_index(1, 20);
        ll.add_at_index(2, 30);
        ll.add_at_index(0, 40);
        ll.add_at_index(0, 50);
        ll.add_at_index(0, 60);
        ll.printlinkedlist();
        System.out.println("\n size: " + ll.size);

        ll.remove_at_index(3);
        ll.remove_at_index(1);
        ll.remove_at_index(7);
        ll.printlinkedlist();
        System.out.println("\n size: " + ll.size);
        
        ll.remove_first_occurrence(40);
        ll.printlinkedlist();
        System.out.println("\n size: " + ll.size);


    }
}
