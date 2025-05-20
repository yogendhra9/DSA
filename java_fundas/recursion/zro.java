// 1st way 

// package recursion;

// public class zro {
//     static int count=0;
//     static int zro(int n)
//     {
//       if(n%10 == 0)
//       {
//         count ++;
//       }
//       if(n%10 == n)
//       {
//         return count;
//       }
//       return zro(n/10);
       
//     }
//     public static void main(String[] args) {
//         int n = 13330;
//         int count = zro(n);
//         System.out.println("The number of zeros in " + n + " is: " + count);
//     }
    
// }

// 2nd way
package recursion;

public class zro{
    static int zro(int n, int count)
    {
        //b.c
        if(n==0)
        {
            return count;
        }

        //r.c
        else if(n%10==0)
        {
            return zro(n/10,count+1);
        }
        else
        {
            return zro(n/10,count);
        }

    }
    public static void main(String[] args) {
        int n = 13330;
        int count = zro(n,0);
        System.out.println("The number of zeros in " + n + " is: " + count);
    }
}

