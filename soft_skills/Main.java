package soft_skills;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower = 10;
        int upper = scanner.nextInt();
        for(int i=lower;i<=upper;i++)
        {
            boolean isPrime = true;
            for(int j=2;j<Math.sqrt(i);j++)
            {
                if(i%j ==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(i + "  ");
            }
        }
 }
}
