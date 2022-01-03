package utilidades;

public class Utils {

    public static Utils utils = new Utils();

    public String Linha(){
        return("===============================================================\n");
    }

    public void Sleep(Integer n){
        try { Thread.sleep(n);
        } catch (InterruptedException ignored) {}
    }

    public void ULine(Integer m){
        System.out.print("╔");
        Sleep(m);
        for(int i = 0; i < 60; i++){
            System.out.print("═");
            Sleep(m);
        }
        System.out.println("╗");
        Sleep(150);
    }

    public void BLine(Integer m){
        System.out.print("╚");
        Sleep(m);
        for(int i = 0; i < 60; i++){
            System.out.print("═");
            Sleep(m);
        }
        System.out.println("╝");
        Sleep(150);
    }

}
