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

    public void CLine(Integer m){
        Sleep(m);
        for(int i = 0; i < 62; i++){
            System.out.print("═");
            Sleep(m);
        }
        System.out.println("");
        Sleep(150);
    }

    public void SULine(Integer m){
        System.out.print("╔");
        Sleep(m);
        for(int i = 0; i < 20; i++){
            System.out.print("═");
            Sleep(m);
        }
        System.out.println("╗");
        Sleep(150);
    }

    public void SBLine(Integer m){
        System.out.print("╚");
        Sleep(m);
        for(int i = 0; i < 20; i++){
            System.out.print("═");
            Sleep(m);
        }
        System.out.println("╝");
        Sleep(150);
    }

    public void SCLine(Integer m){
        Sleep(m);
        for(int i = 0; i < 22; i++){
            System.out.print("═");
            Sleep(m);
        }
        System.out.println("");
        Sleep(150);
    }

    public void Loading(Integer m){
        Sleep(m);
        for(int i = 0; i < 62; i++){
            System.out.print("|");
            Sleep(m);
        }
        for(int i = 0; i < 62; i++){
            System.out.print("\b");
            Sleep(m);
        }
        System.out.println();
        Sleep(150);
    }

    public void LimparTela(){
        for(int i = 0; i < 80; i++){
            System.out.println("-");
        }
    }
}
