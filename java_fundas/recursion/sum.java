package recursion;

public class sum {
    static int  sum_of_digit(int n)
    {
        //b.c
        if(n==0)
        {
            return 0;
        }
        //r.c
       return n%10  + sum_of_digit(n/10);
        
    }
    public static void main(String[] args) {
        int n = 1234;
        int sum = sum_of_digit(n);
        System.out.println(sum);
    }
    
}

