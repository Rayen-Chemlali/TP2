package Ex1;

public class StackEmptyException extends Exception {
    public StackEmptyException() {
        System.out.println("The stack is empty");
    }
}
