import java.util.*;
public class Ex5{
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int num = random.nextInt(10000);
            if (fila.contains(num)) {
                pilha.push(num);
            } else {
                fila.add(num);
            }
        }

        System.out.println("Fila F: " + fila);
        System.out.println("Pilha P: " + pilha);
    }
}
