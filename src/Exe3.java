import java.util.*;

public class Exe3 {
    private List<Ex3> filaDecolagem;
    
    public Exe3() {
        filaDecolagem = new ArrayList<>();
    }
    
    public int getNumAvioesNaFila() {
        return filaDecolagem.size();
    }
    
    public void autorizarDecolagem() {
        if (filaDecolagem.isEmpty()) {
            System.out.println("Não há aviões na fila de decolagem.");
        } else {
            Ex3 aviao = filaDecolagem.remove(0);
            System.out.println("Avião autorizado para decolagem: " + aviao.getNome());
        }
    }
    
    public void adicionarAviao(String nome, int id) {
        Ex3 aviao = new Ex3(nome, id);
        filaDecolagem.add(aviao);
        System.out.println("Avião adicionado à fila de decolagem: " + aviao.getNome());
    }
    
    public void listarAvioesNaFila() {
        System.out.println("Aviões na fila de decolagem:");
        for (Ex3 aviao : filaDecolagem) {
            System.out.println("- " + aviao.getNome());
        }
    }
    
    public void listarPrimeiroAviaoNaFila() {
        if (filaDecolagem.isEmpty()) {
            System.out.println("Não há aviões na fila de decolagem.");
        } else {
            Ex3 aviao = filaDecolagem.get(0);
            System.out.println("Primeiro avião na fila de decolagem: " + aviao.getNome());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exe3 controle = new Exe3();
    
        while (true) {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Listar número de aviões aguardando na fila");
            System.out.println("2 - Autorizar decolagem do primeiro avião da fila");
            System.out.println("3 - Adicionar um avião à fila de espera");
            System.out.println("4 - Listar todos os aviões na fila de espera");
            System.out.println("5 - Listar as características do primeiro avião da fila");
            System.out.println("0 - Sair");
    
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    int numAvioes = controle.getNumAvioesNaFila();
                    System.out.println("Número de aviões aguardando na fila: " + numAvioes);
                    break;
                case 2:
                    controle.autorizarDecolagem();
                    break;
                case 3:
                    System.out.println("Digite o nome do avião:");
                    String nome = scanner.next();
                    System.out.println("Digite o ID do avião:");
                    int id = scanner.nextInt();
                    controle.adicionarAviao(nome, id);
                    break;
                case 4:
                    controle.listarAvioesNaFila();
                    break;
                case 5:
                    controle.listarPrimeiroAviaoNaFila();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}    