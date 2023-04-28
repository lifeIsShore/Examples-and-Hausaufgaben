package exercises3;

public class exercises3 {
    private static double radius;
    public exercises3 (double a) {
        this.radius=a;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double b) {
        this.radius=b;
    }
    public static double getArea(double radius) {
        return 3.14*radius*radius;
    }
    public static double getPerimeter(double radius) {
        return 3.14*2*radius;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        exercises3 a= new exercises3(4);
        a.setRadius(radius);
        System.out.println(a.getArea(5));
        System.out.println(a.getPerimeter(5));

    }
}
