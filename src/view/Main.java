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
import menus.MenuPrincipal;
import mapa.Mapa;
import static utilidades.Utils.utils;

public class Main {

    public static MenuPrincipal menu = new MenuPrincipal();
    public static Personagem personagem = new Personagem();
    public static Mapa mapa = new Mapa();

    public static void main(String[] args){

        Criacao criacao = new Criacao();

        //mapa.MapaPrincipal();
        //criacao.menuCriacao();
        //criacao.cadastroPersonagem();
        //personagem.subirNivel();
        menu.Opcoes();

    }
}
