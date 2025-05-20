public class except {
    public static void main(String[] args) {
        int a=10;
        int b = 0;
        int arr[] = {1,3,4,5};
        try
        {
            int c = a/b;
        
            
            System.out.println("The value of c is: " + c);

        }
         catch(ArithmeticException e)
        {
            System.out.println("Something went wrong" + " "+ e);
        }

        try {
            
                System.out.println(arr[2]);
        }
        
       
       catch(Exception e)
       {
         System.out.println("Something went wrong" + " "+ e);
         e.printStackTrace();
       }
       
       
        finally
        {
            System.out.println("by using try and catch the code will not terminate");
        }

    }
    
    
}
