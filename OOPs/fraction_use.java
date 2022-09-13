package DSA.OOPs;

import javax.xml.namespace.QName;

public class fraction_use {
    public static void temp() throws zerodenominatorException{
        fraction f1 = new fraction(20, 0);
        f1.print();

        //setting numerator

        f1.setNumerator(12);
        int d = f1.getDenominator();
        System.out.println();
        f1.print();

        //setting and changing numerator
        f1.setNumerator(10);
        int i = 47;
        try
        {
            f1.setDenominator(0);
            i++;
        }
        catch(zerodenominatorException e) 
        {
            System.out.println("Hey dont input 0 as denominator.");
        }
        finally
        {
            
        }
        System.out.println(i);
       

        f1.setDenominator(0);
        f1.print();

        
        }
        public static void main(String[] args) throws zerodenominatorException {
            temp();
    }
}
