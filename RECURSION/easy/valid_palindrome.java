package RECURSION.easy;

public class valid_palindrome {
  static  boolean isPalindrome(String s) {
        boolean result = true;
        if(s.length()<2) return result;
        else
        {
            String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
            System.out.println(cleaned);
            int left = 0;
            int right = cleaned.length()-1;
            boolean ans = true;
            result = helper(cleaned,left,right,ans);
        }

        return result;
    }
    static boolean helper(String cleaned,int left,int right,boolean ans)
    {
        if(left>right)
        {
           return true;
        }
        else if(cleaned.charAt(left)==cleaned.charAt(right))
        {

           ans = true;
            helper(cleaned,left+1,right-1,ans);

        }
      return false;
    }

    public static void main(String[] args) {
        String s = "race a car";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}
