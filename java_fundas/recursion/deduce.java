package recursion;
public class deduce
{
    static int deduce(int n, int count)
    {
        if(n==0)
        {
            return count;

        }
        else if(n%2==0)
        {
            return deduce(n/2,count+1);
        }
        else
        {
            return deduce(n-1,count+1);
        }
    }

    
    public static void main(String[] args) {
        int n = 13;
       System.out.println(n/2-1);
        int count = deduce(n,0);
        System.out.println("The number of steps taken to make the value zero " +  " is: " + count);

        
    }

}