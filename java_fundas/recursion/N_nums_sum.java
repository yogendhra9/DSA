package recursion;

public class N_nums_sum {
    static int fact(int n)
    {
        //b.c 
        if(n==0  || n==1)
        {
            return 1;
        }
        //r.c 
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        int sum = fact(n);
        System.out.println(sum);
    }
}
