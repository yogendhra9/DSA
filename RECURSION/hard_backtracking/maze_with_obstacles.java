package RECURSION.hard_backtracking;



public class maze_with_obstacles {
    static void maze_obstacles(int r, int c,int [][]nums, String processed)
    {
        if(r == nums.length-1 && c == nums[0].length-1)
        {
            System.out.println(processed);
            return ;
        }
        if(nums[r][c]==0)
        {
           return;
        }
        nums[r][c] = 0;
        if(c<nums[0].length-1)
        {
            maze_obstacles(r,c+1,nums,processed+'R');
        }
        if(r<nums.length-1)
        {
            maze_obstacles(r+1,c,nums,processed+'B');
        }

    }
    static void no_path_restrictions(int r,int c ,int [][]nums,String processed)
    {
        if(r == nums.length-1 && c == nums[0].length-1)
        {
            System.out.println(processed);
            return ;
        }
        if(nums[r][c] ==0)
        {
            return;
        }
        nums[r][c] = 0;

        if(r<nums.length-1)
        {
            no_path_restrictions(r+1,c,nums,processed+'D');
        }
        if(c<nums[0].length-1)
        {
            no_path_restrictions(r,c+1,nums,processed+'R');
        }
        if(r>0)
        {
            no_path_restrictions(r-1,c,nums,processed+'U');
        }
        if(c>0)
        {
            no_path_restrictions(r,c-1,nums,processed+'L');
        }
        nums[r][c]=1;
    }

    public static void main(String[] args) {
        int [][] nums =
                {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}};
//        maze_obstacles(0,0,nums,"");
//        boolean [][]maze = {
//                {true,true,true},{true,true,true},{true,true,true}
//        };
        no_path_restrictions(0,0,nums,"");

    }
}
