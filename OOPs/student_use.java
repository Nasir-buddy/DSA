package DSA.OOPs;

import java.util.Scanner;

public class student_use {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student("Nasir Ali");
        s1.setrollnumber(s1.getrollnumber());

        student s2 = new student("Sana", 8);
        
        // System.out.println(s1.name);
        // System.out.println(s1.getrollnumber());

        
        // System.out.println(s2.name);
        // System.out.println(s2.getrollnumber());

        s1.print();
        s2.print();
    }
}
