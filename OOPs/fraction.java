package DSA.OOPs;


public class fraction {
    
    private int numerator; 
    private int denominator; 
     
    public fraction(int numerator, int denominator)
    {
        this.numerator = numerator ;
        if(denominator == 0)
        {
            //Through error ;
        }
        this.denominator = denominator; 
        simplify();
    }

    public int getDenominator()
    {
        return denominator;
    }

    public int getNumerator()
    {
        return numerator;
    }
    public void setNumerator(int n)
    {
         this.numerator = n; 
         simplify();
    }
    public void setDenominator(int n) throws zerodenominatorException
    {
        if(denominator == 0)
        {
            // out error
         zerodenominatorException e = new zerodenominatorException();
         throw e;   
            
        }
        this.denominator = n; 
        this.simplify();
    }
    public void print()
    {
        if(denominator == 1)
        {
            System.out.println(numerator);
        }
        else
        {
            System.out.println(numerator + "/" + denominator);
        }
    }
    public void simplify()
    {
        int gcd = 1; 
        int smaller = Math.min(numerator, denominator);
        for(int i = 2; i <= smaller; i++)
        {
            if(numerator % i == 0 && denominator %i == 0)
            {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd; 
    }
    public static fraction add(fraction f1 , fraction f2)
    {
        int newNumer = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDenor = f1.denominator * f2.denominator;
        fraction f = new fraction(newNumer, newDenor);
        return f;
    }
    public void add(fraction f2)
    {
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }
    public void multiply (fraction f2)
    {
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }
}
