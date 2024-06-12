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
