package RECURSION.easy;

public class string_reverse {
    static void reverse(String n,String r,int index)
    {
        if(index==0)
        {
            r+=n.charAt(index);
            System.out.println(r);
            return;
        }
        reverse(n,r+n.charAt(index),index = index-1);
    }

    public static void main(String[] args) {
        String  n = "abcd";
        int index = n.length()-1;
        String r = "";
       reverse(n,r,index);
    }
}
