package soft_skills;
import java.io.*;
import java.util.Scanner;

public class binary_palindrome {
    public static boolean isBinaryPalindrome(int number)
    {
       String binary = Integer.toBinaryString(number);
       String reversed = new  StringBuilder(binary).reverse().toString();
       return binary.equals(reversed);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isBinaryPalindrome(x));
    }
}
