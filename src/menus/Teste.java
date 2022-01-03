package menus;
import mobs.*;
import personagem.Personagem;
import view.Main;
import static utilidades.Utils.utils;

import java.util.Random;

public class Teste {

    Criacao criacao;

    // Atributos que sempre aparecem no menu ao selecionar opções
    private void menuAtributos(){
        System.out.printf("Menu Principal\n" + utils.Linha()+"Nivel: %d || HP: %.0f || Energia: %.0f || " +
                        "Moedas: %.2f || Exp: %d\n" + utils.Linha(), Main.personagem.getNivel(), Main.personagem.getHp(),
                Main.personagem.getEnergia(), Main.personagem.getDinheiro(), Main.personagem.getXp());
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

