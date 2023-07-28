package Shape;

import java.util.Scanner;

public class Sphere extends Shape implements Volume{
    Scanner sc = new Scanner(System.in);
    @Override
    public void calculateArea(){
        double r = sc.nextDouble();
        double area = 4 * Math.PI * Math.pow(r,2);
        System.out.println("Area of Sphere = "+ area);
    }

    @Override
    public void calculateVolume(){
        double r = sc.nextDouble();
        double volume = (4.0/3.0) * Math.PI * Math.pow(r,3);
        System.out.println("Volume of Sphere = " + volume);
    }
}
