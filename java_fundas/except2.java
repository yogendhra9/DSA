import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class except2
{
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        for(int n:num)
        {
            System.out.println(n);

        }
        HashSet <Integer> nums  = new HashSet<>();
        nums.add(134);
        nums.add(2);
        nums.add(2);
        nums.add(39);
        System.out.println(nums);

        LinkedHashSet <Integer> n = new LinkedHashSet<>();
        n.add(1);
        n.add(2);
        n.add(12345);
        System.out.println(n);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        System.out.println(map);
         

      

        
        System.out.println(num);
        
    }
}