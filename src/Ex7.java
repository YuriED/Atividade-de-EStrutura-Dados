import java.util.*;
public class Ex7 {
    public static void main(String[] args) {
        
            Queue<Integer> fila = new LinkedList<>();
            Stack<Integer> pilha = new Stack<>();
    
            for (int i = 1; i <= 20; i++) {
                fila.add(i); 
            }
    
            while (!fila.isEmpty()) {
                pilha.push(fila.poll()); 
            }
    
            while (!pilha.isEmpty()) {
                fila.add(pilha.pop()); 
            }
    
            System.out.println(fila); 
        }
    
    }

