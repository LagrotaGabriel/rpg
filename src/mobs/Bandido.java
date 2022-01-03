package mobs;

public class Bandido extends Npc {
    public Bandido(){
        setNome("Bandido");
        setForca(6);
        setDano((getForca() * 10));
        setArmadura(15);
        setVitalidade(6);
        setAgilidade(6);
        setHp((getVitalidade() * 10.0));
        setEnergia((getAgilidade() * 10.0));
        setNivel(3);
    }
}
