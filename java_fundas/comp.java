abstract class computer { //I cant create an object of abstract class
    abstract public  void compiler();

    public void display()
    {
        System.out.println("displaying ");
    }
}
class Desktop extends computer

{

    @Override
    public void compiler()
    {
        System.out.println("fast compilation");
    }
    @Override
    public void display()
    {
        System.out.println("displaying on desktop");
    }

}
class Laptop extends computer
{

    @Override
    public void compiler()
    {
        System.out.println("slow compilation");
    }


}
class comp
{
    public static void main(String[] args) {

        computer d = new Desktop();
        d.compiler();
        d.display();
        computer l = new Laptop();    
        l.compiler();
        l.display(); 
        //this will call the display method of the parent(computer class) which is called as upcasting
        something_is_visible s = new desk();
        s.show();
        moves m = new desk();
        m.move();
        System.out.println(something_is_visible.color);
    }
}
interface something_is_visible
{
    public void show();
    String color= "not white"; // this is final and it cant be changed
}
interface moves 
{
    public void move(); 

}


class desk implements something_is_visible,moves
{
    @Override
    public void show()
    {
        System.out.println("showing something in the desktop");
    }
    @Override
    public void move()
    {
        System.out.println("desktop cant move");
    }
}
class lap implements something_is_visible,moves{
    @Override
    public void show()
    {
        System.out.println("showing something in the laptop");

    }
    @Override
    public void move()
    {
        System.out.println("laptop can move");
    }
}
