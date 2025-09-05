package soft_skills;

import java.util.ArrayList;

public class incremental {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int num =2;
        int k =50;
        while(arr.size()<k)
        {
            boolean isprime = true;
            for(int p:arr) {
                if ((p * p) > num) break;
                if (num % p == 0) {
                    isprime = false;
                    break;
                }

            }
            if (isprime) arr.add(num);
            num++;

        }
        System.out.println(arr);

    }
}
