package DSA.LinkedList;
import java.util.ArrayList;
public class Linked_list {
    public static void main(String[] args) {
        //Making linked list 
        //SYntax
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1.size());
        list1.add(15);
        list1.add(40);
        list1.add(34);
        list1.add(90);
        list1.add(2,23);

        System.out.println(list1.size());   
        System.out.println(list1.get(4));
        for(int i = 0; i < list1.size(); i++)
        {
            System.out.print(list1.get(i) + " ");
        }
        {
            System.out.println();
        }
        //FOr each loop
        for( int element : list1)
        {
            System.out.print(list1.get(element) + " ");
        }
        // list1.remove(3);
        list1.set(3, 17);
        // for(int i = 0 ; i < list1.size(); i++)
        // {
        //     System.out.print(list1.get(i) + " ");
        // }
    }
}
