package menus;
import mobs.*;
import view.Main;
import java.util.Scanner;
import static utilidades.Utils.utils;
import java.util.Random;

public class MenuPrincipal {

    Criacao criacao;

    // Inicializando mobs
    Npc lobo = new Lobo();
    Npc slime = new Slime();
    Npc bandido = new Bandido();
    Npc guerreiro = new GuerreiroOrc();
    Npc liderorc = new LiderOrc();

    // ArrayList mobs
    Object[] mobs = new Object[]{lobo, slime, bandido, guerreiro, liderorc};

    private void menuPrincipalLayout(){
        Main.mapa.mapaOpc();
        System.out.println("    =-=-=-=-=-=-=-=-=-= Menu Principal =-=-=-=-=-=-=-=-=-=");
        utils.ULine(15);
        System.out.println("      [1] Caminhar    [2] Curar (-50$)    [3] Atributos");
        System.out.println("      [4] Mochila     [5] Ferreiro        [6] Fechar jogo");
        utils.BLine(15);
        System.out.print("      Escolha: ");
    }

    public void Opcoes(){

        Integer n = 0;
        Scanner input = new Scanner(System.in);

        while(n < 1 || n > 6){

            menuPrincipalLayout();
            n = input.nextInt();
            utils.Loading(0);
            if(n == 1){
                Caminhar();
            }else if(n == 2){

            }else if(n == 3){

            }else if(n == 4){

            }else if(n == 5){

            }else if(n == 6){
                System.exit(0);
            }

            n = 0;

        }


    }



    // Opc1 caminhar
    private void Caminhar(){

        if(Main.mapa.getPlayerY() == 0 && Main.mapa.getPlayerX() < 19) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "═");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 0 && Main.mapa.getPlayerX() == 19){
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "╗");
            Main.mapa.setPlayerY(Main.mapa.getPlayerY() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 1 && Main.mapa.getPlayerX() == 19){
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "╝");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() - 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 1 && Main.mapa.getPlayerX() > 0){
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "═");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() - 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 1 && Main.mapa.getPlayerX() == 0){
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "╔");
            Main.mapa.setPlayerY(Main.mapa.getPlayerY() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 2 && Main.mapa.getPlayerX() == 0){
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "║");
            Main.mapa.setPlayerY(Main.mapa.getPlayerY() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 3 && Main.mapa.getPlayerX() == 0){
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "╚");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 3 && Main.mapa.getPlayerX() < 7) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "═");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 3 && Main.mapa.getPlayerX() == 7) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "╗");
            Main.mapa.setPlayerY(Main.mapa.getPlayerY() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 4 && Main.mapa.getPlayerX() == 7) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "╚");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 4 && Main.mapa.getPlayerX() < 10) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "═");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 4 && Main.mapa.getPlayerX() == 10) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "╝");
            Main.mapa.setPlayerY(Main.mapa.getPlayerY() - 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 3 && Main.mapa.getPlayerX() == 10) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "║");
            Main.mapa.setPlayerY(Main.mapa.getPlayerY() - 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 2 && Main.mapa.getPlayerX() == 10) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "╔");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() +1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 2 && Main.mapa.getPlayerX() < 19) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "═");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 2 && Main.mapa.getPlayerX() == 19) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "╗");
            Main.mapa.setPlayerY(Main.mapa.getPlayerY() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 3 && Main.mapa.getPlayerX() == 19) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "║");
            Main.mapa.setPlayerY(Main.mapa.getPlayerY() + 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 4 && Main.mapa.getPlayerX() == 19) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "╝");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() - 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }
        else if(Main.mapa.getPlayerY() == 4 && Main.mapa.getPlayerX() > 17) {
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "═");
            Main.mapa.setPlayerX(Main.mapa.getPlayerX() - 1);
            Main.mapa.setMatrizMapa(Main.mapa.getPlayerY(), Main.mapa.getPlayerX(), "X");
        }


        System.out.println("X: "+ Main.mapa.getPlayerX() + " Y: " + Main.mapa.getPlayerY());
    }

    public void mobSelector(){

        // Selecionando mob aleatório de acordo com nível do personagem
        switch(Main.personagem.getNivel()){
            case 1 -> {int rnd = 0;}
            case 2 -> { int rnd = new Random().nextInt(mobs.length-3); }
            case 3 -> { int rnd = new Random().nextInt(mobs.length-2); }
            case 4 -> { int rnd = new Random().nextInt(mobs.length-1); }
            case 5 -> { int rnd = new Random().nextInt(mobs.length); }

        }
    }

}

