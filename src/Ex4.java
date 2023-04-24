import java.util.*;
public class Ex4 {
    public static void main(String[] args) {
        Queue<Integer> filaOriginal = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            filaOriginal.add(i);
        }
        
        Queue<Integer> filaInvertida = new LinkedList<>(filaOriginal);
        Collections.reverse((LinkedList<Integer>) filaInvertida);

        System.out.println("Fila original: " + filaOriginal);
        System.out.println("Fila invertida: " + filaInvertida);
    }

}
