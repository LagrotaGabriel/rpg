package escudos;

// Classe pai
public abstract class Escudos {

    // Atributos
    private String nome;
    private Integer armadura;
    private Double preco;
    private Double durabilidade;

    // Construtor
    public Escudos(){
        setNome("Vazio");
        setArmadura(0);
        setPreco(0.00);
        setDurabilidade(0.00);
    }

    // Getters
    public String getNome(){
        return(this.nome);
    }
    public Integer getArmadura(){
        return(this.armadura);
    }
    public Double getPreco(){
        return(this.preco);
    }
    public Double getDurabilidade(){
        return(this.durabilidade);
    }

    // Setters
    protected void setNome(String st){
        this.nome = st;
    }
    protected void setArmadura(Integer st){
        this.armadura = st;
    }
    protected void setPreco(Double st){
        this.preco = st;
    }
    protected void setDurabilidade(Double st){
        this.durabilidade = st;
    }

}
