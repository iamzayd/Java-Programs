package Shape;

import java.util.Scanner;

public class Rectangle extends Shape{
    Scanner sc = new Scanner(System.in);
    @Override
    public void calculateArea(){
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double area = l * b;
        System.out.println("Area of Circle = "+ area);
    }
}
