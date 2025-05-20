package recursion;

// public class fibonacci {
//     public static int fibo(int n)
//     {
//         //base condition
//         if(n<2)
//         {
//             return n;
//         }

//         //recursive call
//         return fibo(n-1)+fibo(n-2);

//     }
//     public static void main(String[] args) {
//         int n = 4;
        
//         System.out.println("The " + n + "th Fibonacci number is: " + fibo(n));
//     }
    
// }
public class pre_post
{
    static  void pre_post(int n)
    {
        //b.c;
      if(n==0)
      {
        return;
      }
      System.out.println(n);
      pre_post(--n);

    }
    public static void main(String[] args) {
        int n = 5;
        pre_post(n);
        System.out.println("Done");
    }
}
