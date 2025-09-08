package RECURSION.medium.subsequence_subset;

public class remove_char {
//    public static void main(String[] args) {
//        char remove = 'a';
//        String str = "sankalp";
//        String ans = " ";
//        for(int i=0;i<str.length();i++)
//        {
//            if(remove == str.charAt(i))
//            {
//                continue;
//            }
//            else
//            {
//                ans = ans+str.charAt(i);
//            }
//        }
//        System.out.println(ans);
//    }
    static String remove_char(String str,String ans,int index,char remove)
    {
        if(index == str.length()) return ans; //base condition
        else if(str.charAt(index) == remove) //recursive call
        {
             return remove_char(str,ans,index+1,remove);
        }
        else
        {
            ans = ans+ str.charAt(index);
           return  remove_char(str,ans,index+1,remove);
        }

    }


    public static void main(String[] args) {
        String str = "Sankalp";
        String ans = "";
        char remove = 'a';
        int index =0;
        System.out.println(remove_char(str,ans,index,remove));
    }

}
