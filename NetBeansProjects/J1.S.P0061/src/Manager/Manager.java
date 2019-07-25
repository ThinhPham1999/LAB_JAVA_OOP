
package Manager;

import Entity.*;


public class Manager {
    public static Triangle enterTriagle(){
        while(true){
            System.out.println("Please enter side A of Triangle: ");
            double a = Validate.checkDouble();
            System.out.println("Please enter side B of Triangle: ");
            double b = Validate.checkDouble();
            System.out.println("Please enter side C of Triangle: ");
            double c = Validate.checkDouble();
            if ((a + b > c) && (a + c > b) && (b + c > a)){
                return new Triangle(a, b, c);
            }
            System.out.println("Enter again. ");
        }
    }
    
    public static Rectangle enterRectangle(){
        System.out.println("Please enter length of Rectangle: ");
        double length = Validate.checkDouble();
        System.out.println("Please enter width of Rectangle: ");
        double width = Validate.checkDouble();
        return new Rectangle(length, width);
    }
    
    public static Circle enterCircle(){
        System.out.println("Please enter radius of Circle: ");
        double radius = Validate.checkDouble();
        return new Circle(radius);
    }
    
    public static void print(Rectangle rec, Triangle tri, Circle ci){
        rec.printResult();
        ci.printResult();
        tri.printResult();;
    }
}
