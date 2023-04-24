import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Ex6 {
    
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            fila.offer(random.nextInt(2001) - 1000); 

        while (!fila.isEmpty()) {
            int num = fila.poll();

            if (num >= 0) {
                pilha.push(num);
            } else if (!pilha.isEmpty()) { 
                int topoPilha = pilha.pop();
                System.out.println("Número retirado da pilha: " + topoPilha);
            }
        }
    }
}
}