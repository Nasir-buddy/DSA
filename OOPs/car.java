package DSA.OOPs;

import DSA.OOPs.vechile;
//Inheriting the vechile class
public class car extends vechile{
//Vechile is parent , super , base class 
// Car is child , sub class , derived class 
    int numGears;
    boolean isCOnvertible;

    public car (int numGears , int maxSpeed)
    {
        super(maxSpeed);   
        this.numGears =- numGears; 
        System.out.println("car constructor");
    }

    public boolean isCOnvertible()
    {
        return isCOnvertible;
    }

    public void print() 
    {
        super.print();
        // System.out.println("Car Color : " + color );
        // System.out.println("Car speed : " + getMaxspeed());
        System.out.println("Car numGears : " + numGears);
        System.out.println("Car isConvertible : " + isCOnvertible);
    }
}

