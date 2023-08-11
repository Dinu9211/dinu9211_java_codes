import java.util.*;

class queuelinkedlist{
    Node front,rear;
    int size = 0 ;

    queuelinkedlist(){
        front = rear = null;
        size = 0;
    }
    public void print(){
        Node temp = front;
        while (temp != null){
            System.out.println(""+temp.data);
            temp = temp.next;
        }
        System.out.println();

    }
    public void enqueue(int element){
        Node newNode = new Node(element);
        if (rear == null && front == null){
            rear = front = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;

        }
        size++; 

    }
    public int dequeue(){
        int result = -1;
        if (rear == null && front == null){
            System.out.println("queue is null:");
            return result;
        }
        else{
            result = front.data;
            front = front.next;
            size--;
            return  result;
        }

    }

}
public class queue_using_linkedlist {
    public static void main(String[] args){
        queuelinkedlist que = new queuelinkedlist();
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);
        que.enqueue(60);
        que.print();

        System.out.println("Dequeue element is: "+que.dequeue());
        que.print();
    }
}
