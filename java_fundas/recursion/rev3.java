package recursion;
import java.util.Scanner;
public class rev3
{
   static void print_num(int n,int target)
   {
      //base condition
      if(n==target)
      {
         System.out.println(n);
         return;

      }
      //recursive call
      System.out.println(n);
      print_num(n+1,target);
   }
   public static void main(String[] args) {
      int n=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the target number");
      int target=sc.nextInt();
      print_num(n,target);
     
     
   }
  
}