package Ex2.p;

public class MallardDuck extends Duck implements Quackable{
    IQuack quackBehaviour;
    public MallardDuck(IQuack quackBehaviour)
    {
        this.quackBehaviour=quackBehaviour;
    }
    public void swim()
    {
        System.out.println("MallarDuck is swiming");
    }
    public void display()
    {
        System.out.println("display MallarDuck");
    }
    public void quack()
    {
        quackBehaviour.iQuack();
    }

}
