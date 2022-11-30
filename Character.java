public class Character {
    private String name;
    private CharacterClass dndclass;
    private int hp;
    private Stats attributes;

    public Character(String name, CharacterClass dndclass) {
        this.name = name;
        this.dndclass = dndclass;
        this.hp = dndclass.getHp();
        attributes = Stats.generate();
        attributes.getStats().put("Health", hp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stats getAttributes() {
        return attributes;
    }

  public void addClassBonuses() {
      Integer health = dndclass.getHp() + (int) Math.floor(attributes.getStats().get("Constitution") / 2.) - 5;

      attributes.getStats().put("Health", health);
  }

    public void print() {
        dndclass.printMagica();
        System.out.println("Attributes:");

        for (String attribut : attributes.getStats().keySet()) {
            System.out.println(attribut + ": " + attributes.getStats().get(attribut));
        }

        System.out.println();
    }
}
