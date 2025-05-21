package arrays.concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class array_list
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(12);
        System.out.println(arr);
        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i));

        }
    }
}
