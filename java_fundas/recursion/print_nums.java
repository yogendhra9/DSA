package recursion;

public class print_nums {
  static void print(int n )
  {
     //b.c 
    if(n==0)
    {
        System.out.println(n);
        return;
    }
    print(n-1);
     System.out.println(n);
  }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    
}
