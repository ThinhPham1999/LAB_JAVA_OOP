
package Entity;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() {
        return (Math.PI) * (Math.PI) * radius;
    }

    @Override
    public void printResult() {
        System.out.println("------Circle------");
        System.out.println("Raidus: " + radius);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }
}
