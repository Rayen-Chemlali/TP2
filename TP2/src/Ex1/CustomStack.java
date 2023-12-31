package Ex1;

public class CustomStack {
    private int capacity;
    private Element[] stack;
    private int first;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stack = new Element[capacity];
        this.first = -1;
    }

    public void AddElement(Element element) throws StackFullException {
        if (first == capacity - 1) {
            throw new StackFullException();
        }
        stack[++first] = element;
    }

    public void RemoveElement() throws StackEmptyException {
        if (first == -1) {
            throw new StackEmptyException();

        }
        first--;
    }

    public Element LastInStack() {
        if (first != -1) {
            return stack[first];
        } else {
            return null;
        }
    }

    public boolean StackIsEmpty() {
        return first == -1;
    }

    public boolean StackIsFull() {
        return first == capacity - 1;
    }
}
