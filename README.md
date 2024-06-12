# Estruturas de Dados em Java

## Índice

- [LinkedList](#linkedlist)
  - [Descrição](#descrição-do-linkedlist)
  - [Vantagens](#vantagens-do-linkedlist)
  - [Desvantagens](#desvantagens-do-linkedlist)
  - [Funcionalidades](#funcionalidades-do-linkedlist)
  - [Como Usar](#como-usar-o-linkedlist)
- [Stack](#stack)
  - [Descrição](#descrição-do-stack)
  - [Vantagens](#vantagens-do-stack)
  - [Desvantagens](#desvantagens-do-stack)
  - [Funcionalidades](#funcionalidades-do-stack)
  - [Como Usar](#como-usar-o-stack)
 - [Queue](#queue)
   - [Descrição](#descrição-do-stack)
   - [Vantagens](#vantagens-do-stack)
   - [Desvantagens](#desvantagens-do-stack)
   - [Funcionalidades](#funcionalidades-do-stack)
   - [Como Usar](#como-usar-o-stack)

# LinkedList

## Descrição

Este projeto implementa uma estrutura de dados de Lista Ligada (LinkedList) em Java. Uma lista ligada é uma coleção linear de elementos, onde cada elemento é representado por um nó que contém um valor e uma referência para o próximo nó na sequência. Esta implementação inclui operações básicas como adicionar, remover, obter e imprimir elementos da lista.

## Listas Ligadas

### Vantagens

1. **Estrutura dinâmica**
   - As listas ligadas podem crescer e diminuir conforme necessário, sem a necessidade de realocar ou reorganizar a memória como acontece em arrays.

2. **Utilização da memória**
   - A memória é alocada conforme necessário para cada novo elemento da lista, o que pode ser mais eficiente do que alocar um grande bloco de memória antecipadamente.

3. **Utilização na construção de outras estruturas**
   - Listas ligadas são frequentemente utilizadas como base para outras estruturas de dados, como pilhas, filas, listas duplamente ligadas, e listas circulares.

### Desvantagens

1. **Acesso sequencial**
   - Acesso a elementos é feito de forma sequencial a partir do início da lista, o que pode ser menos eficiente em comparação ao acesso direto em arrays. Isso significa que a busca por um elemento específico pode ser lenta para listas grandes.

2. **Complexidade de implementação**
   - A implementação e manutenção de listas ligadas podem ser mais complexas do que outras estruturas de dados como arrays, devido à manipulação explícita de ponteiros/referências entre nós.

## Funcionalidades

- **Adicionar elementos**
  - `prepend(String data)`: Adiciona um novo elemento no início da lista.
  - `append(String data)`: Adiciona um novo elemento no final da lista.
  - `insert(int index, String data)`: Insere um novo elemento na posição especificada.

- **Remover elementos**
  - `removeFirst()`: Remove o primeiro elemento da lista.
  - `removeLast()`: Remove o último elemento da lista.
  - `remove(int index)`: Remove o elemento na posição especificada.

- **Obter e imprimir elementos**
  - `get(int index)`: Retorna o elemento na posição especificada.
  - `print()`: Imprime todos os elementos da lista.
  - `getHead()`: Imprime o primeiro elemento da lista.
  - `getTail()`: Imprime o último elemento da lista.
  - `getLength()`: Imprime o comprimento da lista.

- **Manipulação da lista**
  - `makeEmpty()`: Esvazia a lista, removendo todos os elementos.
  - `set(int index, String data)`: Atualiza o valor do elemento na posição especificada.

## Como Usar

Para utilizar esta implementação de lista ligada, você pode criar uma instância da classe `LinkedList` e usar seus métodos para manipular a lista. Aqui está um exemplo simples:

```java
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.append("elemento 2");
        list.prepend("elemento 0");
        list.print(); // Imprime todos os elementos da lista
        list.remove(1); // Remove o segundo elemento
        list.print(); // Imprime todos os elementos da lista
    }
}
```
-------------------------------------------------------------------------------------------------------------------------------------------------------

# Stack

## Descrição

Este projeto implementa uma estrutura de dados de Pilha (Stack) em Java. Uma pilha é uma coleção linear de elementos que segue o princípio LIFO (Last In, First Out), onde o último elemento inserido é o primeiro a ser removido. Esta implementação inclui operações básicas como adicionar, remover, obter e imprimir elementos da pilha.

## Vantagens

1. **Estrutura dinâmica**
   - A pilha pode crescer e diminuir conforme necessário, sem a necessidade de realocar ou reorganizar a memória como acontece em arrays.

2. **Eficiente na resolução de problemas LIFO**
   - Pilhas são especialmente eficientes para resolver problemas que requerem acesso aos elementos na ordem inversa de sua inserção, como na avaliação de expressões aritméticas e na implementação de chamadas recursivas.

3. **Simplicidade na implementação**
   - A estrutura de pilha é simples de implementar e utilizar, com operações de inserção (push) e remoção (pop) realizadas em tempo constante O(1).

## Desvantagens

1. **Subutilização de Espaço**
   - Se a pilha for alocada com mais espaço do que o necessário, pode haver desperdício de memória, especialmente se a pilha não utilizar toda a capacidade alocada.

2. **Overflow da Pilha**
   - Se a pilha atingir sua capacidade máxima, não será possível adicionar mais elementos, o que pode causar um erro de estouro de pilha (stack overflow). Este problema é mais comum em pilhas implementadas com um tamanho fixo.

## Funcionalidades

- **Adicionar elementos**
  - `push(int value)`: Adiciona um novo elemento ao topo da pilha.

- **Remover elementos**
  - `pop()`: Remove e retorna o elemento do topo da pilha.

- **Obter e imprimir elementos**
  - `getTop()`: Imprime o elemento no topo da pilha.
  - `getHeight()`: Imprime a altura da pilha.
  - `print()`: Imprime todos os elementos da pilha.

## Como Usar

Para utilizar esta implementação de pilha, você pode criar uma instância da classe `Stack` e usar seus métodos para manipular a pilha. Aqui está um exemplo simples:

```java
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Cria uma nova pilha com um elemento inicial
        stack.push(10); // Adiciona um novo elemento ao topo da pilha
        stack.push(15); // Adiciona outro elemento ao topo da pilha
        stack.print(); // Imprime todos os elementos da pilha
        stack.pop(); // Remove o elemento do topo da pilha
        stack.getTop(); // Imprime o elemento no topo da pilha
        stack.getHeight(); // Imprime a altura da pilha
    }
}
```

# Queue

## Descrição

Este projeto implementa uma estrutura de dados de Fila (Queue) em Java. Uma fila é uma coleção linear de elementos que segue o princípio FIFO (First-In-First-Out), onde o primeiro elemento inserido é o primeiro a ser removido. Esta implementação inclui operações básicas como adicionar, remover, obter e imprimir elementos da fila.

## Vantagens

1. **Organização e Previsibilidade**
   - Seguindo o princípio FIFO (First-In-First-Out), as filas garantem que os elementos sejam processados na ordem exata em que foram adicionados, o que é ideal para tarefas como gerenciamento de tarefas e processamento de pedidos.

2. **Eficiência em Operações Específicas**
   - As filas são eficientes para operações de adição e remoção de elementos, pois não requerem deslocamento de outros elementos, ao contrário de listas ou arrays.

3. **Facilidade de Uso**
   - A interface Queue em Java fornece métodos claros e simples para operações comuns de fila, como `offer()`, `poll()` e `peek()`, facilitando a implementação e manutenção do código.

4. **Flexibilidade de Implementação**
   - Java oferece várias implementações de filas, como LinkedList e ArrayDeque, permitindo escolher a implementação mais adequada com base nas necessidades de desempenho e memória do seu aplicativo.

5. **Aplicações em Algoritmos**
   - Filas são essenciais em algoritmos de busca em largura (BFS) e em cenários onde é necessário manter uma lista de elementos a serem processados.

6. **Concorrência**
   - Algumas implementações de fila em Java são projetadas para serem thread-safe, o que é crucial para aplicações multithread onde vários threads podem estar adicionando ou removendo elementos simultaneamente.

## Desvantagens

1. **Acesso Aleatório Lento**
   - Ao contrário de arrays ou listas, as filas não oferecem acesso rápido a elementos no meio da estrutura. Se você precisar acessar um elemento que não seja o primeiro, terá que remover todos os elementos anteriores.

2. **Consumo de Memória Adicional**
   - Implementações de fila como LinkedList podem consumir mais memória devido ao armazenamento de ponteiros adicionais para cada elemento, o que pode ser um problema em ambientes com memória limitada.

3. **Capacidade Limitada**
   - Se estiver usando uma implementação de fila com capacidade limitada, como ArrayDeque, você pode enfrentar problemas de estouro de fila se não gerenciar cuidadosamente o tamanho da fila.

4. **Dificuldade em Lidar com Prioridades**
   - Filas padrão não lidam com prioridades. Se sua aplicação requer processamento de elementos com diferentes níveis de prioridade, você precisará de uma fila de prioridades ou outra estrutura de dados.

5. **Concorrência**
   - Se estiver trabalhando em um ambiente multithread, você precisará garantir que sua fila seja thread-safe, o que pode exigir implementações adicionais ou o uso de classes de fila específicas que suportam concorrência.

## Funcionalidades

- **Adicionar elementos**
  - `enqueue(int value)`: Adiciona um novo elemento ao final da fila.

- **Remover elementos**
  - `dequeue()`: Remove e retorna o primeiro elemento da fila.

- **Obter e imprimir elementos**
  - `getFirst()`: Imprime o primeiro elemento da fila.
  - `getLast()`: Imprime o último elemento da fila.
  - `getLength()`: Imprime o comprimento da fila.
  - `print()`: Imprime todos os elementos da fila.

## Como Usar

Para utilizar esta implementação de fila, você pode criar uma instância da classe `Queue` e usar seus métodos para manipular a fila. Aqui está um exemplo simples:

```java
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Cria uma nova fila com um elemento inicial
        queue.enqueue(10); // Adiciona um novo elemento ao final da fila
        queue.enqueue(15); // Adiciona outro elemento ao final da fila
        queue.print(); // Imprime todos os elementos da fila
        queue.dequeue(); // Remove o primeiro elemento da fila
        queue.getFirst(); // Imprime o primeiro elemento da fila
        queue.getLength(); // Imprime o comprimento da fila
    }
}
