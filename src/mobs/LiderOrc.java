package mobs;

public class LiderOrc extends Npc{
    public LiderOrc(){
        setNome("Líder Orc");
        setForca(10);
        setDano((getForca() * 10));
        setArmadura(60);
        setVitalidade(10);
        setAgilidade(10);
        setHp((getVitalidade() * 10.0));
        setEnergia((getAgilidade() * 10.0));
        setNivel(5);
    }
}
