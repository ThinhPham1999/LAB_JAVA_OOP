
package Entity;

public class Rectangle extends Shape{
    
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    

    @Override
    public double getPerimeter() {
        return (length + width)*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void printResult() {
        System.out.println("------Rectangle------");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }
    
}
