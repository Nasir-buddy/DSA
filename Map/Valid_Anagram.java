package DSA.Map;

import java.util.*;

public class Valid_Anagram {

    public static boolean answer(String s1 , String s2){
        HashMap<Character , Integer> map = new HashMap<>();
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch , 0 ) + 1);
        }
        for(int i = 0 ; i < s2.length(); i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch) == false){
                return false;
            }
            else if(map.get(ch) == 1){
                map.remove(ch);
            }
            else{
                map.put(ch, map.get(ch) - 1);
            }
        }
        return true;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first String : ");
            String s1 = sc.next();
            System.out.print("Enter the second String : ");
            String s2 = sc.next();
            System.out.println(answer(s1, s2));
        }
}
