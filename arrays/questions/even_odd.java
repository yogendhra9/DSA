package arrays.questions;

public class even_odd {
    public static void main(String[] args) {

    int[] arr = {12,13,14,15,167};
    int even_count =0;
    int odd_count =0;
        for (int i = 0; i < arr.length; i++) {
            String str = Integer.toString(arr[i]);
            int len = str.length();
            if(len%2==0)
            {
                System.out.println("The number " + arr[i] + "has even digits");
                even_count++;
            }
            else
            {
                System.out.println("The number " + arr[i] + "has odd  digits");
                odd_count++;

            }
            str = " ";
            len = 0;

        }
        System.out.println("There are " + even_count + "elements with even number of digits");
        System.out.println("There are " + even_count + "elements with odd number of digits");
    }


}
