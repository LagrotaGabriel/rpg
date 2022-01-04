package personagem;
import java.util.Scanner;
import armas.Armas;
import armas.Mao;
import menus.Criacao;
import armas.Adaga;
import armas.Gladius;
import static utilidades.Utils.utils;

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

            utils.ULine(15);
            System.out.println("          =-=-=-=-=Atributos de " + getNome() + "=-=-=-=-=");
            utils.Sleep(25);
            System.out.println("                  " + pts + " PONTOS RESTANTES");

            utils.CLine(25);
            System.out.print("   [1] Força: " + getForca() + "(+)");
            System.out.println("                       Dano: " + getDano());
            utils.Sleep(25);
            System.out.println("   [2] Agilidade: " + getAgilidade()  + "(+)" + "                   Energia: " + getEnergia());
            utils.Sleep(25);
            System.out.println("   [3] Vitalidade: " + getVitalidade() + "(+)" + "                  HP: " + getHp());
            utils.BLine(15);
            System.out.print("   Escolha: ");
            while(atr < 1 || atr > 3) {
                atr = input.nextInt();
                if (atr == 2) {
                    setAgilidade(getAgilidade() + 1);
                    setEnergia((getAgilidade() * 10.0));
                }else if (atr == 1) {
                    setForca(getForca() + 1);
                    setDano((getForca() * 10));
                } else if (atr == 3) {
                    setVitalidade(getVitalidade() + 1);
                    setHp((getVitalidade() * 10.0));
                } else{
                    System.out.println("Digite um valor entre 1 e 3!");
                }
            } // While
            pts--;
            atr = 0;

        } // For

        utils.ULine(15);
        System.out.println("          =-=-=-=-=Atributos de " + getNome() + "=-=-=-=-=");
        utils.CLine(25);
        System.out.print("   [1] Força: " + getForca() + "(+)");
        System.out.println("                       Dano: " + getDano());
        utils.Sleep(25);
        System.out.println("   [2] Agilidade: " + getAgilidade()  + "(+)" + "                   Energia: " + getEnergia());
        utils.Sleep(25);
        System.out.println("   [3] Vitalidade: " + getVitalidade() + "(+)" + "                  HP: " + getHp());
        utils.BLine(15);
    }

    // Atributos

    public void listarAtributos(){
        utils.Loading(30);
        utils.LimparTela();
        utils.ULine(15);
        System.out.println("          =-=-=-=-=Atributos de " + getNome() + "=-=-=-=-=");
        utils.CLine(25);
        System.out.printf("                     Nível %d (%d xp)\n", getNivel(), getXp());
        System.out.print("(");
        for(int i = 0; i < ((getXp() * 60) /100); i++){
            System.out.print("|");
            utils.Sleep(15);
        }
        for(int i = 0; i < (60-((getXp() * 60) /100)); i++){
            System.out.print("-");
            utils.Sleep(15);
        }
        System.out.print(")\n");
        utils.CLine(25);
        System.out.print("     Força: " + getForca() + " (pts)");
        System.out.println("                     Dano: " + getDano());
        utils.Sleep(25);
        System.out.println("     Agilidade: " + getAgilidade()  + " (pts)" + "                 Energia: " + getEnergia());
        utils.Sleep(25);
        System.out.println("     Vitalidade: " + getVitalidade() + " (pts)" + "                HP: " + getHp());
        utils.CLine(25);
        System.out.printf("  Dinheiro: $ %.2f", getDinheiro());
        utils.Sleep(25);
        System.out.printf("        Arma: %s", getNomeArma());
        System.out.print("        Escudo: Vazio\n");
        utils.BLine(15);
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

}
