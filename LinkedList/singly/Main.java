package LinkedList.singly;

public class Main {
    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        list.insert_first(3);
        list.insert_first(4);
        list.insert_first(5);
       list.insert_last(7);
       list.insertion_at_index(3,10);
       list.insertion_at_index(2,9);
       list.insertion_at_index(1,6);
        list.display();
       list.delete_at_index(2);
       list.insert_last(13);
       System.out.println(list.find(10));

       list.delete_last();


        list.display();
    }






}
