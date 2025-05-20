package recursion;
import java.util.Scanner;

public class rev_num
{
    static int reverse(int n , int args)
    {
        //b.c
        if(args == 1)
        {
            return n;
        }
        //r.c
        int digit = n%10;
        return digit * (int)Math.pow(10,args-1) + reverse(n/10,args-1);

         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int len = str.length();
        int rev = reverse(n,len);
        System.out.println("The reverse of the number is: " + rev);
    }
}