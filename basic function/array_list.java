import java.util.*;

class Myarraylist<box> {
    int defult_cap = 10;
    private box[] arr;
    int size = 0;
    int last = 0;

    Myarraylist() {
        arr = (box[]) new Object[defult_cap];

    }

    Myarraylist(int cap) {
        this.defult_cap = cap;
        arr = (box[]) new Object[defult_cap];
    }

    public void print() {
        for (box i : arr) {
            if (i != null)
                System.out.print(i + " ");
        }
        System.out.println();
        
    }

    public void add(box element) {
        if (last == arr.length) {
            System.out.println();
            System.out.println("Size Exceeded... So we are doubling your array: ");
            box[] newArr = (box[]) new Object[2 * arr.length];
            for (int i = 0; i < arr.length; i++)
                newArr[i] = arr[i];

            arr = newArr;
        }
        arr[last] = element;
        last++;
        size++;
    }

    public box add_at_index(int ind, box element) {
        if (last == arr.length)
        arr = add();
        
        if (ind > last) {
            System.out.println("Index out of bound....");
            return null;
        }

        for(int i = ind; i > ind; i++) 
        arr[i] = arr[i+1];

        arr[ind] = element;

        last++;
        size++;


    }


    public box remove_at_index(int ind) {
        if (last == 0 || ind > last){

            if (last == 0)
            System.out.println("Array is Empty");
            else
            System.out.println("Index out of bound....");
            return null;
        }
        box res=arr[ind];
        for (int i = ind; i <=last; i++){
            arr[i] = arr[i+1];

        }
        last--;
        size--;

        return res;

    }

}

public class array_list {
    public static void main(String[] args) {
        Myarraylist<Integer> ar_list = new Myarraylist<>();
        ar_list.add(10);
        ar_list.add(20);
        ar_list.add(30);
        ar_list.add(40);
        ar_list.add(50);
        ar_list.add(60);
        ar_list.add(70);
        ar_list.add(80);
        ar_list.add(90);
        ar_list.add(100);
        ar_list.add(110);
        ar_list.add(120);
        ar_list.add(130);

        // ar_list.add("Dinesh");
        // ar_list.add("Saini");
        ar_list.print();

        ar_list.add_at_index(4, 45);
        ar_list.print();

        // Integer removed = ar_list.remove_at_index(10);
        // ar_list.print();
        // System.out.println("your removed element is: " + removed);

        System.out.println("Size: " + ar_list.size);

    }
}