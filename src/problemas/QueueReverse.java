package problemas;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Dado um inteiro K e uma fila de inteiros, a tarefa é inverter a ordem
 * dos primeiros K elementos da fila, deixando os demais elementos na
 * mesma ordem relativa
 *
 * Solução:
 * 1 - Para os K primeiros elementos:
 *  ° desenfileirar elemento x
 *  ° reordena (K-1) os elementos
 *  ° enfileirar elemento x
 * 2 - Para os N-K elementos:
 *  ° desenfileirar
 *  ° enfileirar
 */

public class QueueReverse {

    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {
        solveQueue(queue, k);
        int n = queue.size() - k;
        while(n-- > 0) {
            int element = queue.remove();
            queue.add(element);
        }
        return queue;
    }

    private static void solveQueue(final Queue<Integer> queue,final int k) {
        if(k == 0) return;
        int element = queue.remove();
        solveQueue(queue, k -1);
        queue.add(element);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(reverseFirstK(queue,2));
    }

}
