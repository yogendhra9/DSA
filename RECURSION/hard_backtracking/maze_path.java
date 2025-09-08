package RECURSION.hard_backtracking;

import java.util.ArrayList;

public class maze_path {
    public static void main(String[] args) {
        System.out.println( path_count_Diagonal(3,3,""));

    }
    static ArrayList<String> path_count_Diagonal(int r, int c, String processed)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> lis = new ArrayList<>();
            lis.add(processed);
            return lis;
        }
        ArrayList<String> path_list = new ArrayList<>();
        if(r>1 && c>1)
        {
            path_list.addAll(path_count_Diagonal(r-1,c-1,processed+'D'));
        }
       if(c>1)
       {
           path_list.addAll(path_count_Diagonal(r,c-1,processed+'R'));
       }
       if(r>1)
       {
           path_list.addAll(path_count_Diagonal(r-1,c,processed+'B'));
       }
       return path_list;
    }
}
