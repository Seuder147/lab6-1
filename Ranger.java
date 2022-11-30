public class Ranger extends CharacterClass{
    private String perk;

    public Ranger() {
        this.name = "Ranger";
        this.hp = 10;
        this.perk = "Beast Master";
    }

    @Override
    public void printMagica() {
        System.out.println("Character " + name + " has the ability " + perk);
    }
}
