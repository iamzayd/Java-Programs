package Birdie;

public abstract class Duck {
    public static FlyBehavior flyBehavior;
    public static QuackBehavior quackBehavior;
    public static SwimBehavior swimBehavior;
    //display will be overridden
    static void display() {
    }
    static void performQuack(){
        quackBehavior.quack();
    }
    static void performFly(){
        flyBehavior.fly();
    }
    static void performSwim() {
        swimBehavior.swim();
    }
}
