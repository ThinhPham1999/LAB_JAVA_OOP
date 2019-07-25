/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author thinh
 */
public class Triangle extends Shape {
    
    private double a;
    private double b;
    private double c;

    public Triangle() {
        a = 1;
        b = 1;
        c = 1;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    
    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public void printResult() {
        System.out.println("------Triangle------");
        System.out.println("Size A: " + a);
        System.out.println("Size B: " + b);
        System.out.println("Size C: " + c);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }
    
}
