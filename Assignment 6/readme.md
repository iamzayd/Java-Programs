Duck Simulation Program This is a Java program that simulates different types of ducks with various behaviors like flying, quacking and swimming.

Usage You can run the program by executing the main_duck.java file. The program will create instances of different ducks and call their respective methods to display their behavior.

Classes main_duck This is the main class that creates instances of different ducks and calls their methods.

Interfaces FlyBehavior This interface defines the fly() method, which is implemented by classes that can fly.

QuackBehavior This interface defines the quack() method, which is implemented by classes that can quack.

SwimBehavior This interface defines the swim() method, which is implemented by classes that can swim.

Classes FlyWithWings This class implements the FlyBehavior interface and defines the fly() method for ducks that can fly with wings.

FlyNoWay This class implements the FlyBehavior interface and defines the fly() method for ducks that cannot fly.

Quack This class implements the QuackBehavior interface and defines the quack() method for ducks that can quack.

Squeak This class implements the QuackBehavior interface and defines the quack() method for ducks that can squeak.

MuteQuack This class implements the QuackBehavior interface and defines the quack() method for ducks that cannot quack.

Swim This class implements the SwimBehavior interface and defines the swim() method for ducks that can swim.

Float This class implements the SwimBehavior interface and defines the swim() method for ducks that cannot swim but can float.

Drown This class implements the SwimBehavior interface and defines the swim() method for ducks that cannot swim and will drown.

Duck This abstract class defines the behaviors of a duck. It has three instance variables, one for each of the behaviors: flyBehavior, quackBehavior, and swimBehavior. These variables are initialized in the subclasses based on the type of duck. The class also defines the performQuack(), performFly(), and performSwim() methods, which call the respective behavior method of the duck.

MallardDuck This class extends the Duck class and defines the behavior of a mallard duck. It initializes the instance variables with appropriate behaviors for a mallard duck.

RedheadDuck This class extends the Duck class and defines the behavior of a redhead duck. It initializes the instance variables with appropriate behaviors for a redhead duck.

RubberDuck This class extends the Duck class and defines the behavior of a rubber duck. It initializes the instance variables with appropriate behaviors for a rubber duck.

DecoyDuck This class extends the Duck class and defines the behavior of a decoy duck. It initializes the instance variables with appropriate behaviors for a decoy duck.
