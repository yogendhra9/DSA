package soft_skills;
import java.util.*;

public class chinese_remainder {

    // Find modular inverse of 'a' under modulo 'mod'
    static int inverseMin(int mod, int Mi) {
        int ans = -1;
        for (int i = 1; i < mod; i++) {
            if ((Mi * i) % mod == 1) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of equations:");
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] m = new int[total];
        int[] a = new int[total];
        int M = 1;

        // Input: (m[i], a[i])
        for (int i = 0; i < total; i++) {
            System.out.println("Enter modulus and remainder (m, a):");
            m[i] = sc.nextInt();
            a[i] = sc.nextInt();
            M *= m[i];
        }

        int res = 0;
        for (int i = 0; i < total; i++) {
            int Mi = M / m[i];
            int inverse = inverseMin(m[i], Mi); // FIXED HERE
            res += a[i] * Mi * inverse;
        }

        System.out.println("Solution x = " + (res % M));
    }
}
