package dataStructure;

public class Queue {

    // Declaração dos campos da classe Queue
    private Node first; // Referência ao primeiro nó da fila
    private Node last;  // Referência ao último nó da fila
    private int length; // Armazena o comprimento da fila

    // Classe interna Node que representa um nó da fila
    public class Node {
        int value; // Valor armazenado no nó
        Node next; // Referência ao próximo nó na fila

        // Construtor da classe Node
        Node(int value) {
            this.value = value; // Inicializa o valor do nó
        }

        // Método getter para o valor do nó
        public int getValue() {
            return value;
        }
    }

    // Construtor da classe Queue
    public Queue(int value) {
        Node newNode = new Node(value); // Cria um novo nó com o valor fornecido
        first = newNode; // Define o novo nó como o primeiro nó da fila
        last = newNode;  // Define o novo nó como o último nó da fila
        length++; // Incrementa o comprimento da fila
    }

    // Método privado para obter e imprimir o valor do primeiro nó da fila
    private void getFirst(){
        if(first != null) {
            System.out.println("First: " + first.value); // Imprime o valor do primeiro nó
        } else {
            System.out.println("Fila está vazia"); // Informa que a fila está vazia
        }
    }

    // Método privado para obter e imprimir o valor do último nó da fila
    private void getLast(){
        if(last != null) {
            System.out.println("Last: " + last.value); // Imprime o valor do último nó
        } else {
            System.out.println("Fila está vazia"); // Informa que a fila está vazia
        }
    }

    // Método público para obter e imprimir o comprimento da fila
    public void getLength(){
        System.out.println("Length: " + length);
    }

    // Método para imprimir todos os elementos da fila
    public void print() {
        System.out.println("#############################################");
        Node temp = first; // Inicia com o primeiro nó
        while(temp != null) { // Percorre todos os nós da fila
            System.out.println(temp.value); // Imprime o valor do nó atual
            temp = temp.next; // Avança para o próximo nó
        }
        System.out.println("#############################################");
    }

    // Método para adicionar um novo elemento ao final da fila
    public void enqueue(int value) {
        Node newNode = new Node(value); // Cria um novo nó com o valor fornecido

        if (length == 0) {
            first = newNode; // Define o novo nó como o primeiro nó
            last = newNode;  // Define o novo nó como o último nó
        } else {
            last.next = newNode; // Aponta o último nó atual para o novo nó
            last = newNode; // Atualiza o último nó para o novo nó
        }
        length++; // Incrementa o comprimento da fila
    }

    // Método para remover o primeiro elemento da fila
    public Node dequeue() {
        if (length == 0) return null; // Retorna null se a fila estiver vazia
        Node temp = first; // Armazena o primeiro nó em uma variável temporária
        if (length == 1) {
            first = null; // Define first como null se houver apenas um nó
            last = null;  // Define last como null se houver apenas um nó
        } else {
            first = first.next; // Avança o primeiro nó para o próximo nó
            temp.next = null; // Remove a referência do nó removido para o próximo nó
        }
        length--; // Decrementa o comprimento da fila
        return temp; // Retorna o nó removido
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(1);

//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLenght();
//
//        myQueue.print();

        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);

//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLenght();
//
//        myQueue.print();
    }
}
