package arrays;

public class substrings {
    public static void main(String[] args) {
        String str = "abcdef";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                System.out.print(str.substring(i,j+1));
                System.out.println();

            }

        }
    }
}
