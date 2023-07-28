package Shape;
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.showShape("Circle");
        circle.calculateArea();
        System.out.println(" ");

        Rectangle rectangle = new Rectangle();
        rectangle.showShape("Rectangle");
        rectangle.calculateArea();
        System.out.println(" ");

        Sphere sphere = new Sphere();
        sphere.showShape("Sphere");
        sphere.calculateArea();
        sphere.calculateVolume();
        System.out.println(" ");

        Cylinder cylinder = new Cylinder();
        cylinder.showShape("Cylinder");
        cylinder.calculateArea();
        cylinder.calculateVolume();
        System.out.println(" ");
    }
}
