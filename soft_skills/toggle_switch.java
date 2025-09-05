package soft_skills;

import java.util.Scanner;

public class toggle_switch {
    static int toggle(int num)
    {
        return (int) Math.sqrt(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doors = sc.nextInt();
        System.out.println(toggle(doors));
    }

}
