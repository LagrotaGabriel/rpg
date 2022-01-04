package menus;
import java.util.Random;
import personagem.Personagem;
import mobs.Npc;
import mobs.Lobo;
import mobs.Slime;
import mobs.Bandido;
import mobs.GuerreiroOrc;
import mobs.LiderOrc;
import java.util.Scanner;
import utilidades.Utils;
import view.Main;

import static utilidades.Utils.utils;


public class Criacao {

    // Declarações
    Scanner input = new Scanner(System.in);
    Integer n;
    Personagem personagem = new Personagem();

    // Menu criação// Sair do game
    public void menuCriacao(){

        utils.Sleep(400);
        utils.ULine(15);
        System.out.println("    "+"=-=-=-=-=Seja bem-vindo ao World of Javindor=-=-=-=-=");
        utils.Sleep(400);
        utils.BLine(15);
        utils.Sleep(400);
        do{
            utils.ULine(15);
            utils.Sleep(200);
            System.out.println("               [1] Cadastrar personagem");
            utils.Sleep(400);
            System.out.println("               [2] Sair");
            utils.BLine(15);
            System.out.print("  Escolha: ");
            n = input.nextInt();
            utils.Loading(40);
            utils.LimparTela();
            if(n == 1){
                cadastroPersonagem();
            }else if(n == 2){
                System.exit(0);
            }else{
                System.out.println("  Digite um número entre 1 e 2!");
            }
        }while(n!=2);
    }

    // Cadastrar personagem ( nome, atributos, etc )
    public void cadastroPersonagem(){

        utils.ULine(15);
        System.out.println("    "+"  =-=-=-=-=-=-=Cadastro de personagem=-=-=-=-=-=-=");
        utils.BLine(15);
        System.out.print("  Digite o nome do seu personagem: ");
        personagem.setNome(input.next());
        utils.Loading(25);
        utils.LimparTela();
        personagem.subirNivel();
        Main.menu.Opcoes();

    }


}


