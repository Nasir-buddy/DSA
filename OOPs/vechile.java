package DSA.OOPs;

public class vechile {
   protected String color;
    private int maxSpeed;

    public vechile (int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle constructor");
    }
    public int getMaxspeed() {
        return maxSpeed;
    }

    public void setMaxspeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("Vechile colour : " + color);
        System.out.println("Vechile speed : " + maxSpeed);
    }
}
