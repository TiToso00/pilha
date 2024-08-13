public class TesteStack {
    public static void main(String[] args) {
        StaticStack<Integer> stack = new StaticStack<>(5);  // Cria uma pilha para inteiros com capacidade para 5 elementos

        // Adicionando elementos
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Tentando adicionar um elemento quando a pilha está cheia
        stack.push(6);

        // Removendo elementos
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Tentando remover um elemento de uma pilha vazia
        stack.pop();
    }
}
