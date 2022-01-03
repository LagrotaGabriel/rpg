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
import static utilidades.Utils.utils;

public class Criacao {

    // Declarações
    Scanner input = new Scanner(System.in);
    Integer n;
    Personagem personagem = new Personagem();
    Teste teste = new Teste();

    // Menu criação// Sair do game
    public void menuCriacao(){

        utils.Sleep(400);
        utils.ULine(15);
        System.out.println("    "+"=-=-=-=-=Seja bem-vindo ao World of Javindor=-=-=-=-=");
        utils.Sleep(400);
        utils.BLine(15);
        utils.Sleep(2300);
        do{
            utils.ULine(15);
            utils.Sleep(200);
            System.out.println("               [1] Cadastrar personagem");
            utils.Sleep(400);
            System.out.println("               [2] Sair");
            utils.BLine(15);
            System.out.print("                Escolha: ");
            n = input.nextInt();
            utils.Sleep(2300);
            if(n == 1){
                cadastroPersonagem();
            }else if(n == 2){
                System.exit(0);
            }else{
                System.out.print("Digite um número entre 1 e 2!");
            }//Condicional Selecionar
        }while(n!=2);//Do While
    }//MenuCriacao()

    // Cadastrar personagem ( nome, atributos, etc )
    public void cadastroPersonagem(){

        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("    "+"  =-=-=-=-=-=-=Cadastro de personagem=-=-=-=-=-=-=");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("    Digite o nome do seu personagem: ");
        personagem.setNome(input.next());
        personagem.subirNivel();

    }


}


