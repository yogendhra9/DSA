package soft_skills;
import java.util.*;
public class alice_apple {
    public static void main(String[] args) {
        int count =0;
        int apples = 100;
        int sum =0;
        while(sum<apples)
        {
            count++;
            sum+= 12*count*count;
        }
        System.out.println(count*8);
    }
}
