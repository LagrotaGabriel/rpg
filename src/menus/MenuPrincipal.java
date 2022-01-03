package menus;
import mobs.*;
import personagem.Personagem;
import view.Main;
import static utilidades.Utils.utils;
import mapa.Mapa;

import java.util.Random;

public class MenuPrincipal {

    Criacao criacao;

    public void Opcoes(){
        //utils.Loading(30);
        //utils.LimparTela();
        utils.SULine(25);
        System.out.println("   Mapa de Javindor");
        utils.SBLine(25);
        Main.mapa.MapaPrincipal();
        System.out.print("\b");
        utils.CLine(25);
        System.out.printf("X: %s", Main.personagem.getNome());
        System.out.print("   o: Chefão");
        System.out.print("   ═: Estrada");
        System.out.print("   ║: Estrada");
        System.out.print("   |: Destino\n");
        utils.CLine(25);


    }

    // Opc1 caminhar
    private void Caminhar(){

        // Inicializando mobs
        Npc lobo = new Lobo();
        Npc slime = new Slime();
        Npc bandido = new Bandido();
        Npc guerreiro = new GuerreiroOrc();
        Npc liderorc = new LiderOrc();

        // ArrayList mobs
        Object[] mobs = new Object[]{lobo, slime, bandido, guerreiro, liderorc};

        // Selecionando mob aleatório de acordo com nível do personagem
        switch(Main.personagem.getNivel()){
            case 1 -> {int rnd = 0;}
            case 2 -> { int rnd = new Random().nextInt(mobs.length-3); }
            case 3 -> { int rnd = new Random().nextInt(mobs.length-2); }
            case 4 -> { int rnd = new Random().nextInt(mobs.length-1); }
            case 5 -> { int rnd = new Random().nextInt(mobs.length); }
        }




    }

}// Armazenar personagem em variável pra depois passar pra outra classe

