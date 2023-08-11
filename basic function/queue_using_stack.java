import java.util.*;
import java.util.Stack;

class stack{
    Node top = null;
    stack st1 = new stack();
    stack st2 = new stack();

    public void enqueue(int element) {
        st1.push(element);

    } 
    public int dequeue() {
        int res = -1;
        if (st2.isEmpty()) {
            while (!isEmpty()) {
                st2.push(st1.pop());
            }
        }
        res = st2.peek();
        st2.pop();
        return res;

    }
    public void straight(){
        int res = st1.peek();
        while (!isEmpty()) {
            st2.push(st1.pop());
        }
        return res;

    }
    public void print(){
        System.out.println("stack 1....");st1.print();
        System.out.println("stack 2....");st2.print();

    }

}


public class queue_using_stack {
    public static void main(String[] args){
        stack q = new stack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
    
        q.print();
        q.straight();
        q.print();


    }
    
}
