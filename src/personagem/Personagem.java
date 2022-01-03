package personagem;
import java.util.Scanner;
import armas.Armas;
import armas.Mao;
import menus.Criacao;
import armas.Adaga;
import armas.Gladius;

public class Personagem {

    // Atributos
    String nome;
    Integer forca;
    Integer dano;
    Integer armadura;
    Integer vitalidade;
    Double hp;
    Integer agilidade;
    Double energia;
    Integer nivel;
    Integer xp;
    Double dinheiro;
    Boolean armado;
    Armas arma = new Mao();

    // Construtor
    public Personagem(){
        setForca(5);
        setDano((getForca() * 10));
        setArmadura(0);
        setVitalidade(5);
        setHp((getVitalidade() * 10.0));
        setAgilidade(5);
        setEnergia((getAgilidade() * 10.0));
        setNivel(1);
        setXp(0);
        setDinheiro(0.00);
        setArmado(false);
    }

    /*  Métodos
    */

    // Lutar
    public void golpeFraco(){

    }
    private void golpeMedio(){

    }
    private void golpeForte(){

    }

    // Subir de nivel

    public void subirNivel(){

        Integer atr = 0;
        Integer pts = 3;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 3; i++){

            System.out.printf("Você tem %d pontos para distribuir entre\nAgilidade (Energia), Força (Dano), e Vitalidade (Hp):", pts);
            System.out.printf("""
                    \n[1] Agilidade (ATUAL: %d)
                    [2] Força (ATUAL: %d)
                    [3] Vitalidade (ATUAL: %d)
                    """, getAgilidade(), getForca(), getVitalidade());
            System.out.print("Escolha: ");
            while(atr < 1 || atr > 3) {
                atr = input.nextInt();
                if (atr == 1) {
                    setAgilidade(getAgilidade() + 1);
                }else if (atr == 2) {
                    setForca(getForca() + 1);
                } else if (atr == 3) {
                    setVitalidade(getVitalidade() + 1);
                } else{
                    System.out.println("Digite um valor entre 1 e 3!");
                }
            } // While
            pts--;
            atr = 0;

            Continua();

        } // For

        setHp((getVitalidade() * 10.0));
        setEnergia((getAgilidade() * 10.0));
        setDano((getForca() * 10));

        System.out.printf("""
                    Atributos %s
                    -------------------
                    HP: %.2f || Energia: %.2f || Dano: %d
                    Agilidade: %d
                    Força: %d
                    Vitalidade: %d
                    """, getNome(), getHp(), getEnergia(), getDano(), getAgilidade(), getForca(), getVitalidade());
        Continua();
    }

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
    public Integer getXp(){
        return(this.xp);
    }
    public Double getDinheiro(){
        return(this.dinheiro);
    }
    public Boolean getArmado(){
        return(this.armado);
    }
    public Object getNomeArma(){
        return(this.arma.getNome());
    }
    public Object getPoderArma(){
        return(this.arma.getPoder());
    }
    public Object getDurabilidadeArma(){
        return(this.arma.getDurabilidade());
    }
    public Object getPrecoArma(){
        return(this.arma.getPreco());
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
    public void setXp(Integer st) {
        this.xp = st;
    }
    public void setDinheiro(Double st){
        this.dinheiro = st;
    }
    public void setArmado(Boolean st){
        this.armado = st;
    }

    public String Linha(){
        return("==========================================================\n");
    }

    public void Continua(){
        String go = "";
        Scanner input = new Scanner(System.in);
        while(!go.equals("CONTINUA")){
            System.out.println("(Digite [CONTINUA] para continuar)");
            go = input.next().toUpperCase();
        }
        System.out.print(Linha());
    }
}
