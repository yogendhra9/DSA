package RECURSION.medium.subsequence_subset;

public class remove_string {
    static String remove_str(String s1,String target)
    {
        if(s1.isEmpty())
        {
            System.out.println();
            return "";

        }
         if(s1.startsWith(target))
            {
                return remove_str(s1.substring(target.length()),target);
            }
        else {
            return s1.charAt(0) + remove_str(s1.substring(1),target);
        }

    }

    public static void main(String[] args) {
        String s1 = "yogendhra_gadhamchetty";
        String s2 = " ";
        String target = "_";
        System.out.println(remove_str(s1,target));
    }
}
