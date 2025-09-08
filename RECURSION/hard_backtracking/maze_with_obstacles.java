package RECURSION.hard_backtracking;


import java.util.Arrays;

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
    static void print_path(int r,int c ,int [][]nums,String processed,int[][]path,int step)
    {
        if(r == nums.length-1 && c == nums[0].length-1)
        {
            path[r][c] = step;
            System.out.println(processed);
//            for(int i=0;i<path.length;i++)
//            {
//                for(int j=0;j<path[0].length;j++)
//                {
//                    System.out.print(path[i][j] + " ");
//
//                }
//                System.out.println();
//            }
             for(int[] arr:path)
             {
                 System.out.println(Arrays.toString(arr));
             }
            System.out.println();
            return ;
        }
        if(nums[r][c] ==0)
        {
            return;
        }
        nums[r][c] = 0;

        path[r][c] = step;
        if(r<nums.length-1)
        {
            print_path(r+1,c,nums,processed+'D',path,step+1);
        }
        if(c<nums[0].length-1)
        {
            print_path(r,c+1,nums,processed+'R',path,step+1);
        }
        if(r>0)
        {
            print_path(r-1,c,nums,processed+'U',path,step+1);
        }
        if(c>0)
        {
            print_path(r,c-1,nums,processed+'L',path,step+1);
        }
        nums[r][c]=1;
       path[r][c]=0;
    }

    public static void main(String[] args) {
        int [][] nums =
                {{1, 1, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 1, 1}};
        int [][] path =
                {{0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}};
//        maze_obstacles(0,0,nums,"");
//        boolean [][]maze = {
//                {true,true,true},{true,true,true},{true,true,true}
//        };
//        no_path_restrictions(0,0,nums,"");
        print_path(0,0,nums,"",path,1);


    }
}
