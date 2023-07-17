import java.util.Scanner;

//base class
class student
{
    int roll;
    String name;
    Scanner s=new Scanner(System.in);

    public void getdata()
    {
        System.out.println("Ente Roll No and Name:- ");
        roll = s.nextInt();
        name = s.next();
        
    }
    public void display()
    {
        System.out.println("Roll No="+roll);
        System.out.println("Name="+name);
    }
}
//derived class
class test extends student
{
    int sub1,sub2;
    public void readdata()
    {
        getdata();  //base class method
        System.out.println("Enter the Marks of two Subject:- ");
        sub1 = s.nextInt();
        sub2 = s.nextInt();

    }
    public void putdata()
    {
        display();
        System.out.println("Marks of subject1 "+sub1);
        System.out.println("Marks of subject2 "+sub2);
    }

}
class singleinheritance
{
    public static void main (String args[])
    {
        test obj = new test();
        obj.readdata();
        obj.putdata();
    }
}