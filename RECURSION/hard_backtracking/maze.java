package RECURSION.hard_backtracking;

public class maze {
    public static void main(String[] args) {
        System.out.println(path_count(6,3));
    }
    static int path_count(int r,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left = path_count(r-1,c);
        int right = path_count(r,c-1);
        return left+right;
    }
}
