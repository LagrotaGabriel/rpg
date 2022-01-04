package mapa;

import view.Main;
import java.util.Arrays;
import static utilidades.Utils.utils;


public class Mapa {

    Integer playerY = 3;
    Integer playerX = 19;
    // Integer playerY = 0;
    //Integer playerX = 3;
    String[][] matrizMapa = {
            {" ", " ", " ", "X", "═", "═", "═", "═", "═", "═", "═", "═", "═", "o", "═", "═", "═", "═", "═", "╗", " "},
            {"╔", "═", "═", "═", "═", "═", "o", "═", "═", "═", "═", "═", "═", "═", "═", "═", "o", "═", "═", "╝", " "},
            {"║", " ", " ", " ", " ", " ", " ", " ", " ", " ", "╔", "═", "═", "═", "═", "═", "═", "o", "═", "╗", " "},
            {"╚", "═", "o", "═", "═", "═", "═", "╗", " ", " ", "║", " ", " ", " ", " ", " ", " ", " ", " ", "║", " "},
            {" ", " ", " ", " ", " ", " ", " ", "╚", "═", "o", "╝", " ", " ", " ", " ", " ", " ", "|", "═", "╝", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
    };

    public void MapaPrincipal(){

        Integer y = 0;
        for(int x = 0; x < 21; x++){
            utils.Sleep( 15);
            System.out.print(matrizMapa[y][x]);
            if(x == 20){
                x = 0;
                y++;
                System.out.print("\n");
                System.out.print(matrizMapa[y][x]);
            }
            if(y == 5){
                    x = 21;
            }
        }
    }

    public void mapaOpc(){
        //utils.Loading(30);
        //utils.LimparTela();
        utils.SULine(0);
        System.out.println("   Mapa de Javindor");
        utils.SBLine(0);
        Main.mapa.MapaPrincipal();
        System.out.print("\b");
        utils.CLine(0);
    }

    // Setter
    public void setMatrizMapa(Integer y, Integer x, String a){
        this.matrizMapa[y][x] = a;
    }
    public void setPlayerY(Integer y){
        this.playerY = y;
    }
    public void setPlayerX(Integer x){
        this.playerX = x;
    }

    // Getter
    public Integer getPlayerY(){
        return(this.playerY);
    }
    public Integer getPlayerX(){
        return(this.playerX);
    }

}
