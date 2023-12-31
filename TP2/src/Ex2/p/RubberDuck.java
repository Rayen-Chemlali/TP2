package Ex2.p;

public class RubberDuck extends Duck implements Flyable,Quackable{
    IFly flyBehaviour;
    IQuack quackBehaviour;

    public RubberDuck(IFly flyBehaviour,IQuack quackBehaviour)
    {
        this.flyBehaviour=flyBehaviour;
        this.quackBehaviour=quackBehaviour;
    }
    public void swim()
    {
        System.out.println("RubberDuck is swiming");
    }
    public void display()
    {
        System.out.println("display RubberDuck");
    }
    public void fly()
    {
        flyBehaviour.ifly();
    }
    public void quack()
    {
        quackBehaviour.iQuack();
    }
}
