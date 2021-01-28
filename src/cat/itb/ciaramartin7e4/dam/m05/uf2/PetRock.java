package cat.itb.ciaramartin7e4.dam.m05.uf2;

public class PetRock {
    String name;
    boolean happy;

    public PetRock(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isHappy(){
        return happy;
    }
    public void playWithRocky(){
        happy = true;
    }
}
