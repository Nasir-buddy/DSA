package DSA.OOPs;
public class student
{
    private int roll; 
    public  String name ;

    //constructor making ...
    public student(String n)
    {
        name = n;
    }
    public student(String n , int rn)
    {
        name = n; 
        roll = rn;
    }

    public void setrollnumber(int rn)
    {
        if(rn <= 0)
        {
            return;
        }
        roll = rn;
    }
    public int getrollnumber ()
    {
        return roll;
    }

    public void print()
    {
        System.out.println(name + " : " + roll);
    }
}