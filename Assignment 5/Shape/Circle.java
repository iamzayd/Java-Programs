package Shape;

import java.util.Scanner;

public class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    @Override
    public void calculateArea(){
        double R = sc.nextDouble();
        double area = Math.PI *Math.pow(R,2);
        System.out.println("Area of Circle = "+ area);
    }
}
