import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;
    int size = 0;
    Stack() {
        this.top = null;
    }

    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.println(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
        size++;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
        size++;
    }
    public int pop () {
        if (top == null) 
        return -1;

        int r = top.data;
        top = top.next;
        size--;
        return r;
        
    }
    public int peek(){
        return (top==null)?-1:top.data;
    }

}

public class linked_list_stack {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.print();

        Integer remove = st.pop();
        st.print();
        System.out.println("poped element is: "+remove); 

        System.out.println("Size is: "+st.size);
        
    }
}
