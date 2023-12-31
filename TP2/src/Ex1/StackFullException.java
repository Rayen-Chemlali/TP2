package Ex1;

public class StackFullException extends Exception {
    public StackFullException() {
        System.out.println("The stack is full");
    }
}
