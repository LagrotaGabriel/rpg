package mobs;

public class GuerreiroOrc extends Npc {
    public GuerreiroOrc(){
        setNome("Guerreiro Orc");
        setForca(9);
        setDano((getForca() * 10));
        setArmadura(30);
        setVitalidade(8);
        setAgilidade(8);
        setHp((getVitalidade() * 10.0));
        setEnergia((getAgilidade() * 10.0));
        setNivel(4);
    }
}
