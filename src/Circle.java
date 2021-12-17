public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(){
        x=0;
        y=0;
        radius=1;
    }

   public Circle(double xin, double yin,double radiusin){
        x=xin;
        y=yin;
        radius=radiusin;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }
}
