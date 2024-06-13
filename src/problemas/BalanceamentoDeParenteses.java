package problemas;

import java.util.Set;
import java.util.Stack;

/**
 * Dada uma string de expressão exp, escreva um programa para examinar se os pares e as ordens
 * de "{", "}", "(", ")", "[", "]" estáo corretos na expressão dada.
 *
 * Solução: Uso de pilhas
 * 1 - Empilhar os caracteres de abertura
 * 2 - Ao identificar caracter de fechamento
 *  ° desempilhar e verificar se coincide com abertura
 * 3 - Ao final a pilha deve estar vazia
 */
public class BalanceamentoDeParenteses {
    public static boolean solve (String expression){
        Set<Character> openSymbols = Set.of('(', '{', '[');
        Set<Character> colseSymbols = Set.of(')', '}', ']');
        Stack<Character> stack = new Stack<>();

        for(char c: expression.toCharArray()) {
            if (openSymbols.contains(c)) stack.push(c);
            if (colseSymbols.contains(c)){
                if(stack.isEmpty()) return false;
                var open = stack.pop();
                if (open == '(' && c != ')') return false;
                if (open == '{' && c != '}') return false;
                if (open == '[' && c != ']') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solve("2*(3+4+5*[2+3)]"));
        System.out.println(solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]"));
    }
}
