package RECURSION.medium;

public class Count_good_numbers {
    static int countGoodNumbers(long n)
    {
        if(n==1) return 5;
        long mod = 1000000007;
        long half1 = 0;
        long half2=0;
        if(n%2==0)
        {
            half1= myPow(5,n/2,mod);
            half2 = myPow(4,n/2,mod);
        }
        else
        {
            half1= myPow(5,n/2+1,mod);
            half2 = myPow(4,n/2,mod);
        }
        return (int)((half1%mod)*(half2%mod)%mod);
    }
    static long myPow(long x ,long n,long mod)
    {

        if(n==0) return 1;
        else if(n%2==0)
        {
            return  myPow((x % mod) * (x % mod) % mod,n/2,mod);
        }
        else
        {
            return  (x%mod * myPow((x % mod) * (x % mod) % mod,n/2,mod) %mod);
        }
    }

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(3));
    }

}
