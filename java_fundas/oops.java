
class doops
{
     int keys;
    String color;
    public void press()
    {
        System.out.println("signal sent" + keys);

    }
    public void throw_them()
    {
       

        System.out.println("key pressed once"); 
      
    }
   
}
class a_oops extends doops
{
    public void throw_them()
    {
        System.out.println( " keys pressed multiple times");
    }
   

}
public class oops
{
    public static void main(String[] args) {
        doops obj = new doops();

        obj.press();
        obj.throw_them();
       

    }
}

