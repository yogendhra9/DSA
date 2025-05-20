package recursion;

public class f1 {

    public static int factorial(int n)
    {
        //base condition
        if(n==1 || n==0 )
        {
            return 1;
        }
        else{
            //recursive call
            return n*factorial(n-1);

        }
    }
    public static void main(String[] args) {
        int n=5;
       int  result = factorial(n);
       System.out.println("The factorial of " + n + " is: " + result);  

    }
    
}
