package mobs;

// Classe pai
public abstract class  Npc {

    // Atributos
    private String nome;
    private Integer forca;
    private Integer dano;
    private Integer armadura;
    private Integer vitalidade;
    private Double hp;
    private Integer agilidade;
    private Double energia;
    private Integer nivel;

    // Getters
    public String getNome(){
        return(this.nome);
    }
    public Integer getForca(){
        return(this.forca);
    }
    public Integer getDano(){
        return(this.dano);
    }
    public Integer getArmadura(){
        return(this.armadura);
    }
    public Integer getVitalidade(){
        return(this.vitalidade);
    }
    public Double getHp(){
        return(this.hp);
    }
    public Integer getAgilidade(){
        return(this.agilidade);
    }
    public Double getEnergia(){
        return(this.energia);
    }
    public Integer getNivel(){
        return(this.nivel);
    }

    // Setters
    public void setNome(String st){
        this.nome = st;
    }
    public void setForca(Integer st){
        this.forca = st;
    }
    public void setDano(Integer st){
        this.dano = st;
    }
    public void setArmadura(Integer st){
        this.armadura = st;
    }
    public void setVitalidade(Integer st){
        this.vitalidade = st;
    }
    public void setHp(Double st){
        this.hp = st;
    }
    public void setAgilidade(Integer st){
        this.agilidade = st;
    }
    public void setEnergia(Double st){
        this.energia = st;
    }
    public void setNivel(Integer st){
        this.nivel = st;
    }

    // Lutar
    private void golpeFraco(){

    }
    private void golpeMedio(){

    }
    private void golpeForte(){

    }
}

