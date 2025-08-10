package RECURSION.easy;

public class move_end {
    static String move_char(String p,String up,String up1,int index,char target)
    {
        if(index  ==p.length())
        {
           return up.concat(up1);
        }
        else if(p.charAt(index) == target)
        {
           return    move_char(p,up,up1+target,index+1,target);
        }
        else {
           return move_char(p,up+p.charAt(index),up1,index+1,target);
        }
    }

    public static void main(String[] args) {
        String p = "Sankalpa";
        String up ="";
        String up1 = "";
        int index =0;
        char target = 'a';
        System.out.println(move_char(p,up,up1,index,target));
    }
}
