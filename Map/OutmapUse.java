package DSA.Map;

import DSA.Map.Map_Optimize;
public class OutmapUse {
    public static void main(String[] args) {
        Map_Optimize<String ,Integer> map = new Map_Optimize<>();
        for(int i = 0; i < 20; i++){
            map.insert("abc" + i , 1 + i);
            System.out.println("i = " + i + " lf = " + map.loadFactor());
        }
        map.removeKey("abc3");
        map.removeKey("abc7");
        for(int i = 0; i < 20 ; i++){
            System.out.println("abc" + i + ":" + map.getvalue("abc" + i));
        }
    }
}
