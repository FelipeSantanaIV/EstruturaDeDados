package dataStructure;

//Pilha
public class Stack {

    // Definição de atributos privados da pilha
    private Node top; // Nó do topo da pilha
    private int height; // Altura da pilha

    // Classe interna Node, que representa cada elemento da pilha
    public class Node {
        int value; // Valor armazenado no nó
        Node next; // Referência para o próximo nó na pilha

        // Construtor da classe Node
        Node(int value) {
            this.value = value; // Inicializa o valor do nó
        }

        // Método para obter o valor do nó
        public int getValue() {
            return value; // Retorna o valor armazenado no nó
        }
    }

    // Construtor da classe Stack, inicializa a pilha com um nó inicial
    public Stack(int value) {
        Node newNode = new Node(value); // Cria um novo nó com o valor fornecido
        top = newNode; // Define o novo nó como topo da pilha
        height = 1; // Define a altura inicial como 1
    }

    // Método para obter e imprimir o nó do topo da pilha
    public void getTop() {
        if (top == null) { // Verifica se a pilha está vazia
            System.out.println("Pilha vazia"); // Imprime mensagem de pilha vazia
        } else {
            System.out.println("Topo: " + top.value); // Imprime o valor do nó do topo
        }
    }

    // Método para obter e imprimir a altura da pilha
    public void getHeight() {
        System.out.println("Altura: " + height); // Imprime a altura da pilha
    }

    // Método para imprimir todos os elementos da pilha
    public void print() {
        System.out.println("##############################");
        Node temp = top;
        // Itera sobre a pilha e imprime cada elemento
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("##############################");
    }

    // Método para adicionar um novo elemento ao topo da pilha
    public void push(int value) {
        Node newNode = new Node(value); // Cria um novo nó com o valor fornecido
        if (height == 0) {
            top = newNode; // Se a pilha estiver vazia, define o novo nó como topo
        } else {
            newNode.next = top; // Define a referência do novo nó para o nó atual no topo
            top = newNode; // Atualiza o topo para o novo nó
        }
        height++; // Incrementa a altura da pilha
    }

    // Método para remover o elemento do topo da pilha
    public Node pop() {
        if (height == 0) return null; // Se a pilha estiver vazia, retorna null
        Node temp = top; // Armazena o nó do topo em uma variável temporária
        top = top.next; // Atualiza o topo para o próximo nó
        temp.next = null; // Remove a referência do nó removido
        height--; // Decrementa a altura da pilha
        return temp; // Retorna o nó removido
    }


    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(1);

        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
//       myStack.getTop();
//       myStack.getHeight();
//
//       myStack.print();


//       myStack.print();
//       myStack.getTop();
//       myStack.getHeight();
    }

}
