package RECURSION.medium;

public class power {
    static double myPow(double x , int n)
    {
      if(n==0)return 1;
      if(n<0) return 1/myPow(x,-n);
      else if(n%2==0)
      {
          return myPow(x*x,n/2);
      }
      else {
          return x * myPow(x*x,n/2);
      }

    }


    public static void main(String[] args) {
        System.out.println(myPow(2,5 ));
    }
}
