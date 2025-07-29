package RECURSION;

public class steps_to_zero {
    static int noofSteps(int num)
    {
        return helper(num,0);
    }
    static int helper(int num,int count)
    {
        if(num==0) return  count;
        else if(num%2==0) return helper(num/2,count+1);
        else
            return helper(num-1,count+1);
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(noofSteps(num));
    }
}
