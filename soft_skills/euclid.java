package soft_skills;

import java.util.Scanner;

public class euclid {
    static int euclid(int a,int b)
    {
        if(a==0) return b;
        return euclid(b%a,a);

    }
    static int euler(int num)
    {
        int counter =0;
        for(int i=1;i<=num;i++)
        {
            if(euclid(i,num)==1)
            {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("res:" + euler(num));
    }
}
