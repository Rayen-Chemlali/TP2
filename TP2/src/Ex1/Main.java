package Ex1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) throws StackFullException, StackEmptyException {
        Element e1 = new Element("a");
        Element e2 = new Element("b");
        Element e3 = new Element("c");
        Element e4 = new Element("d");
        CustomStack stack = new CustomStack(3);
        System.out.println(stack.StackIsFull());
        stack.AddElement(e1);
        stack.AddElement(e2);
        stack.AddElement(e3);
        stack.AddElement(e4);
        Element b = stack.LastInStack();
        b.print();
        stack.RemoveElement();
        Element c = stack.LastInStack();
        c.print();
    }
}