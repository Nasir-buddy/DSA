package DSA.Strings;

public class String_palindrome {
    public static boolean main(String[] args) {
        String str =  "non";
        for(int i = 0; i < str.length(); i ++)
        {
            for(int j = str.length() - 1; j >= 0 ; j--)
            {
                if(str.charAt(i) != j)
                return false;
            } 
        }
        return true;
    }
}
