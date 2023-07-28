package Bird;
public abstract class Duck {
    FlyBehaviour flyBehaviour;  //object of interface
    QuackBehaviour quackBehaviour;      //object of interface
    abstract void display();


    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }
}