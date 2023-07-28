package Bird;
public class MallarDuck extends Duck{
    public MallarDuck(){
        quackBehaviour = new Quack();
        flyBehaviour= new FlyWithWings();
    }

    @Override
    void display(){
        System.out.println("I am MallarDuck");
    }
}