package view;

import personagem.Personagem;
import armas.Armas;
import armas.Mao;
import armas.Adaga;
import armas.Gladius;
import armas.EspadaCurta;
import armas.Claymore;
import mobs.Npc;
import mobs.Lobo;
import mobs.Slime;
import mobs.Bandido;
import mobs.GuerreiroOrc;
import menus.Criacao;
import menus.Teste;
import mapa.Mapa;

public class Main {

    public static Personagem personagem = new Personagem();

    public static void main(String[] args){

        Mapa mapa = new Mapa();
        Criacao criacao = new Criacao();
        //mapa.mapaPrincipal();
        criacao.menuCriacao();
        //criacao.cadastroPersonagem();

    }
}
