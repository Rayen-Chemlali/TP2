package Ex2.p;

public class RedheadDuck extends Duck implements Quackable,Flyable{
    IFly flyBehaviour;
    IQuack quackBehaviour;

    public RedheadDuck(IFly flyBehaviour,IQuack quackBehaviour)
    {
        this.flyBehaviour=flyBehaviour;
        this.quackBehaviour=quackBehaviour;
    }
    public void swim()
    {
        System.out.println("ReadheadDuck is swiming");
    }
    public void display()
    {
        System.out.println("display ReadheadDuck");
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
