package mobs;

public class Lobo extends Npc{

    public Lobo(){
        setNome("Lobo");
        setForca(2);
        setDano((getForca() * 10));
        setArmadura(0);
        setVitalidade(2);
        setAgilidade(2);
        setHp((getVitalidade() * 10.0));
        setEnergia((getAgilidade() * 10.0));
        setNivel(1);
    }
}
