package ShapeMain;
import java.util.Scanner;
public class Pyramid  extends Shape implements Volume {
    Scanner sc = new Scanner(System.in);
    private double l, w, h;
    Pyramid(){
        // user enters length, width and height
        System.out.print("Enter the length of the base: ");
        this.l = sc.nextDouble();
        System.out.print("Enter the width of the base: ");
        this.w = sc.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        this.h = sc.nextDouble();
    }
    @Override
    public void calculateArea() {
        // surface area of rectangular pyramid
        double area = l*w + l*(Math.sqrt(Math.pow(w/2, 2) + Math.pow(h, 2))) + w*(Math.sqrt(Math.pow(l/2, 2) + Math.pow(h, 2)));
        System.out.printf("The Surface Area of the pyramid is: %.2f\n", area);
    }
    @Override
    public void calculateVolume() {
        // volume formula for pyramid
        double vol = (l*w*h)/3;
        System.out.printf("The Volume of the pyramid is: %.2f\n", vol);
    }
}