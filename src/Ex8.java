import java.util.*;
public class Ex8 {
    public static void main(String[] args) {
        Stack<Integer> p = new Stack<>();
        Stack<Integer> n = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100; 
            if (numero > 0) {
                p.push(numero); 
            } else if (numero < 0) {
                n.push(numero); 
            } else {
                if (!p.isEmpty() && !n.isEmpty()) {
                    System.out.println("Pilha P: " + p.pop() + ", Pilha N: " + n.pop());
                }
            }
        }
    }
}

  