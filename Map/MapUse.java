package DSA.Map;

import java.util.HashMap;
import java.util.Set;

public class MapUse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // insertion
        map.put("abc", 1);
        map.put("def", 2);
        map.put("abc1", 1);
        map.put("def1", 2);
        System.out.println("size : " + map.size() );
        if (map.containsKey("abc")) {
            System.out.println("Has abc");
        }
        if(map.containsKey("abc1")){
            System.out.println("has abc1");
        }

     if(map.containsKey(2)){
        System.out.println("has 2 as value ");
     }
        // get value 
        int v = 0;
        if(map.containsKey("abc1")){
            v = map.get("abc1");
        }
        System.out.println(v);
        // remove
        int s = map.remove("abc");
        System.out.println(s);

        // iterate 
        Set<String> keys = map.keySet();
        for(String str : keys){
            System.out.println(str);
        }
    }

}
