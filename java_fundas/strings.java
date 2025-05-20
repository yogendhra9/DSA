 import java.util.*;


 class arrays
{
 public static void main(String[] args) {
    int arr[] =new int[5];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;
    // for(int i=0;i<arr.length;i++)
    // {
    //     System.out.println(arr[i]);
    // }
    for(int n: arr)
    {
        System.out.println(n);
    }

 }
}
public class strings {
    public static void main(String[] args) {
        String s1 = new String("hello");
        System.out.println(s1 + System.identityHashCode(s1));
         s1 = s1 + "world";
         System.out.println(s1+ System.identityHashCode(s1));
         

        StringBuffer s = new StringBuffer("hello");
        System.out.println(s.toString() + " " + System.identityHashCode(s));
        s.append("world");
        System.out.println(s.toString() + " " + System.identityHashCode(s));
      
    }
}
class Student
{
    int rollno;
    String name;
    Student(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }
    
    public static void main(String[] args) {
        Student students[] = new Student[4];
        Scanner sc = new Scanner(System.in);

       for(int i=0;i<students.length;i++)
       {
        System.out.println("enter the details of student"+(i+1));
       
        System.out.println("enter the rollno");
        int rollno = sc.nextInt();
        System.out.println("enter the name");   
        String name = sc.next();
        students[i]=new Student(rollno,name);
       }
       sc.close();
     for(Student s: students)
     {
        System.out.println(s);
     }

       
    }  


}