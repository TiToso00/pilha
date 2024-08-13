public class StaticStack<T> {
    private int top;
    private T[] data;

    // Construtor que inicializa a pilha com o tamanho especificado
    public StaticStack(int size) {
        top = -1;
        data = (T[]) new Object[5];  // Criação de um array genérico
    }

    // Método para adicionar um elemento à pilha
    public void push(T newData) {
        if (!isFull()) {
            data[++top] = newData;  // Incrementa top e adiciona o novo elemento
        } else {
            System.out.println("Stack is full!");
        }
    }

    // Método para remover o elemento do topo da pilha
    public T pop() {
        if (!isEmpty()) {
            return data[top--];  // Retorna o elemento no topo e decrementa top
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return top == -1;
    }

    // Método para verificar se a pilha está cheia
    public boolean isFull() {
        return top == data.length - 1;
    }

    // Método para limpar a pilha
    public void clear() {
        top = -1;  // Simplesmente resetar o índice top para -1
    }
}

