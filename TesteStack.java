public class TesteStack {
    public static void main(String[] args) {
        DynamicStack<Integer> stack = new DynamicStack<>();  
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.push(6);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        stack.pop();
    }
}
