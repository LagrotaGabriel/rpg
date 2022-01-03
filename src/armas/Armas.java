package armas;

// Classe pai
public abstract class Armas {

    // Atributos
    private String nome;
    private Integer poder;
    private Double durabilidade;
    private Double preco;

    // Construtor
    public Armas(){
        setPoder(0);
        setPreco(0.00);
        setDurabilidade(0.00);
    }

    // Getters
    public String getNome(){
        return(this.nome);
    }
    public Integer getPoder(){
        return(this.poder);
    }
    public Double getDurabilidade(){
        return(this.durabilidade);
    }
    public double getPreco(){
        return(this.preco);
    }

    // Setters
    protected void setNome(String st){
        this.nome = st;
    }
    protected void setPoder(Integer st){
        this.poder = st;
    }
    protected void setDurabilidade(Double st){
        this.durabilidade = st;
    }
    protected void setPreco(double st){
        this.preco = st;
    }

}
