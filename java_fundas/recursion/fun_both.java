package recursion;
public class fun_both {
    public void recur(int n)
    {
       System.out.println(n);
       
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        recur(n+1);
         System.out.println(n);
    }
    public static void main(String[] args) {
        fun_both obj = new fun_both();
        obj.recur(1);
    }
}

