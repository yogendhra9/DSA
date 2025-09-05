package soft_skills;
import java.io.*;
import java.util.Scanner;

public class strobo {
    public static boolean strobo(String num)
    {
        String digits  = "01689";
        String reversed_digits = "01986";
        int left = 0;
        int right = num.length()-1;
        while(left<right)
        {
            char left_char = num.charAt(left);
            char right_char = num.charAt(right);
            int index = digits.indexOf(left_char);
            if(index ==-1 || reversed_digits.charAt(index) != right_char)
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String num1 = Integer.toString(num);
        System.out.println(strobo(num1));
    }
}
