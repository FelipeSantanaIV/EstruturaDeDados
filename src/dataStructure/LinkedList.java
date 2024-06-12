package dataStructure;

public class LinkedList {

    // Definição de atributos privados da lista
    private Node head; // Nó inicial da lista
    private Node tail; // Nó final da lista
    private int length; // Comprimento da lista

    // Classe interna Node, que representa cada elemento da lista
    class Node {
        String data; // Dados armazenados no nó
        Node next; // Referência para o próximo nó na lista

        // Construtor da classe Node
        Node(String data){
            this.data = data; // Inicializa o dado do nó
        }
    }

    // Construtor da classe LinkedList, inicializa a lista com um nó inicial
    public LinkedList(String data){
        length = 1; // Define o comprimento inicial como 1
        Node newNode = new Node(data); // Cria um novo nó com os dados fornecidos
        head = newNode; // Define o novo nó como cabeça da lista
        tail = newNode; // Define o novo nó como cauda da lista
    }

    // Método para obter e imprimir o nó inicial (head) da lista
    public void getHead(){
        if(this.head == null){ // Verifica se a lista está vazia
            System.out.println("Lista vazia"); // Imprime mensagem de lista vazia
        } else {
            System.out.println("Head: " + head.data); // Imprime os dados do nó inicial
        }
    }

    // Método para obter e imprimir o nó final (tail) da lista
    public void getTail(){
        if(this.tail == null){ // Verifica se a lista está vazia
            System.out.println("Lista vazia"); // Imprime mensagem de lista vazia
        } else {
            System.out.println("Tail: " + tail.data); // Imprime os dados do nó final
        }
    }

    // Método para obter e imprimir o comprimento da lista
    public void getLength(){
        System.out.println("Length: " + this.length); // Imprime o comprimento da lista
    }

    // Método para esvaziar a lista
    public void makeEmpty(){
        head = null; // Remove a referência ao nó inicial
        tail = null; // Remove a referência ao nó final
        length = 0; // Define o comprimento da lista como 0
    }

    public void print() {
        System.out.println("##################################");
        Node temp = this.head;
        // Itera sobre a lista e imprime cada elemento
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("##################################");
    }

    public void append(String data){
        Node newNode = new Node(data);
        if(length == 0) {
            // Se a lista estiver vazia, define o novo nó como head e tail
            head = newNode;
            tail = newNode;
        } else {
            // Se a lista não estiver vazia, adiciona o novo nó ao final e atualiza tail
            tail.next = newNode;
            tail = newNode;
        }
        length++; // Incrementa o comprimento da lista
    }

    public Node removeLast() {
        if(length == 0) return null; // Se a lista estiver vazia, retorna null
        Node pre = head;
        Node temp = null;
        // Encontra o penúltimo nó
        while (pre.next != tail) {
            pre = pre.next;
        }
        temp = tail;
        tail = pre; // Atualiza tail para o penúltimo nó
        tail.next = null; // Remove a referência para o último nó
        length--; // Decrementa o comprimento da lista
        if (length == 0) {
            // Se a lista estiver vazia após a remoção, redefine head e tail
            head = null;
            tail = null;
        }
        return temp; // Retorna o nó removido
    }

    public void prepend(String data){
        Node newNode = new Node(data);
        if(length == 0) {
            // Se a lista estiver vazia, define o novo nó como head e tail
            head = newNode;
            tail = newNode;
        } else {
            // Se a lista não estiver vazia, adiciona o novo nó ao início e atualiza head
            newNode.next = head;
            head = newNode;
        }
        length++; // Incrementa o comprimento da lista
    }

    public Node removeFirst(){
        if (length == 0) return null; // Se a lista estiver vazia, retorna null
        Node temp = head;
        head = head.next; // Atualiza head para o próximo nó
        temp.next = null; // Remove a referência do nó removido
        length--; // Decrementa o comprimento da lista
        if(length == 0){
            // Se a lista estiver vazia após a remoção, redefine tail
            head = null;
            tail = null;
        }
        return temp; // Retorna o nó removido
    }

    public Node get(int index) {
        if(index < 0 || index >= length) return null; // Se o índice for inválido, retorna null
        Node temp = head;
        // Itera até o índice especificado
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp; // Retorna o nó no índice especificado
    }

    public boolean set(int index, String data) {
        Node temp = get(index); // Obtém o nó no índice especificado
        if (temp != null) {
            temp.data = data; // Define o novo valor de data no nó
            return true; // Retorna true se a operação foi bem-sucedida
        }
        return false; // Retorna false se o índice foi inválido
    }

    public boolean insert(int index, String data) {
        if(index < 0 || index > length) return false; // Se o índice for inválido, retorna false
        if(index == 0) {
            prepend(data); // Insere no início da lista
            return true;
        }
        if(index == length) {
            append(data); // Insere no final da lista
            return true;
        }
        Node newNode = new Node(data);
        Node temp = get(index - 1); // Obtém o nó anterior ao índice especificado
        newNode.next = temp.next; // Define a referência do novo nó para o nó atual no índice
        temp.next = newNode; // Atualiza a referência do nó anterior para o novo nó
        length++; // Incrementa o comprimento da lista
        return true; // Retorna true se a operação foi bem-sucedida
    }

    public Node remove(int index){
        if(index < 0 || index >= length) return null; // Se o índice for inválido, retorna null
        if(index == 0) return removeFirst(); // Remove o primeiro nó se o índice for 0
        if(index == length - 1) return removeLast(); // Remove o último nó se o índice for o último

        Node prev = get(index - 1); // Obtém o nó anterior ao índice especificado
        Node temp = prev.next; // Obtém o nó no índice especificado
        prev.next = temp.next; // Atualiza a referência do nó anterior para o próximo nó
        temp.next = null; // Remove a referência do nó removido
        length--; // Decrementa o comprimento da lista
        return temp; // Retorna o nó removido
    }

    // Método principal para testar a lista ligada
    public static void main(String[] args) {
        LinkedList list = new LinkedList("Elemento 1"); // Cria uma nova lista com um elemento inicial
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prepend("Elemento 0");


        list.remove(2);
        list.print();

//        list.insert(3, "Elemento 2.5");

//        System.out.println(list.get(2).data);

//        System.out.println(list.removeFirst().data);
//        list.print();
//
//        list.set(1, "Elemento 0.5");
//        list.print();


//        list.getHead();
//        list.getTail();
//        list.getLength();
//        list.print();
//        list.makeEmpty();
//
//        list.getLength();
    }
}