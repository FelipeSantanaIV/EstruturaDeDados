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
