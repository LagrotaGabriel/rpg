package mobs;

public class Slime extends Npc{
    public Slime(){
        setNome("Slime");
        setForca(4);
        setDano((getForca() * 10));
        setArmadura(0);
        setVitalidade(4);
        setAgilidade(4);
        setHp((getVitalidade() * 10.0));
        setEnergia((getAgilidade() * 10.0));
        setNivel(2);
    }
}
