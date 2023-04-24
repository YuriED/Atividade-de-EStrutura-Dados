import java.util.*;

public class Ex2 {
    public static void removeElementos(Stack<Integer> pilha, int chave) {
        Stack<Integer> aux = new Stack<>();
        while (!pilha.isEmpty()) {
            int elementos = pilha.pop();
            if (elementos != chave) {
                aux.push(elementos);

            }
        }
        while (!aux.isEmpty()) {
            pilha.push(aux.pop());
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        System.out.println("pilha no começo: " + pilha);
        System.out.println("digite qual numero voce quer remover de 1a5: ");
        int chave = scan.nextInt();
        removeElementos(pilha, chave);
        System.out.println("pilha depois de remover elemento " + chave + " :" + pilha);
    }
}
