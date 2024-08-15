import java.util.ArrayList;

public class DynamicStack<T> {
    private ArrayList<T> data;

    public DynamicStack() {
        data = new ArrayList<>();
    }

    public void push(T newData) {
        data.add(newData);
    }

    public T pop() {
        if (!isEmpty()) {
            return data.remove(data.size() - 1);
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean isFull() {
      
        return false;
    }

    public void clear() {
        data.clear();
    }
}
