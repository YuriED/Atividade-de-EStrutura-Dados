public class Ex3 {
    private String nome;
    private int id;
    public Ex3(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;                            
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return nome + "("+ id + ")";
    }

    

}
