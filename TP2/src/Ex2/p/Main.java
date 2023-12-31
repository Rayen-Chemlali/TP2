package Ex2.p;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IFly1 iFly1 =new IFly1();
        IFly2 iFly2 =new IFly2();
        IQuack1 iQuack1=new IQuack1();
        IQuack2 iQuack2=new IQuack2();
        MallardDuck mallard =new MallardDuck(iQuack2);
        RedheadDuck readhead = new RedheadDuck(iFly1,iQuack1);
        readhead.quack();
        readhead.swim();
        RedheadDuck rubber = new RedheadDuck(iFly2,iQuack1);
        rubber.quack();
        rubber.fly();
    }
}