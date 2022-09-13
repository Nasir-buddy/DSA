package DSA.Strings;

public class Catination_str {
    public static void main(String[] args) {
        char str[]  = {'N' , 'A' , 'S' , 'I' , 'R'}; 
        String str1 = "Nasir ";
        String str2 = "Ali"; 

        String subsStr = str1.substring(1,4);
            System.out.println(subsStr);
            // R will not print because last one is exclusive 

        // First method..
        // System.out.print(str1 + str2);


        //Second Method..
        // str1 += str2;
        // System.out.print(str1);


        //Third method..
        str1 = str1.concat(str2);
        System.out.println(str1);

        //IF equal or not ...
        System.out.println(str1.equals(str2));

        //Comparing two strings 
        System.out.println(str1.compareTo(str2));

        //compare contain or not .
        System.out.println(str1.contains("ir"));
    }
}
