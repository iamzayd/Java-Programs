package Bird;
public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I believe i cannot fly");
    }
}
