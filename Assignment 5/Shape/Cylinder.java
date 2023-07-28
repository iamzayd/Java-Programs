package Shape;

import java.util.Scanner;

public class Cylinder extends Shape implements Volume{
    Scanner sc = new Scanner(System.in);
    @Override
    public void calculateArea(){
        double h = sc.nextDouble();
        double r = sc.nextDouble();
        double area = 2 * Math.PI * r * (h + r);
        System.out.println("Area of Cylinder is: " + area);
    }

    @Override
    public void calculateVolume() {
        double h = sc.nextDouble();
        double r = sc.nextDouble();
        double volume = Math.PI * Math.pow(r,2) * h;
        System.out.println("Volume of Cylinder is: " + volume);
    }
}
