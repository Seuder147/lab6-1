public class Demo {
    public static void main(String[] args) {
        Character bard = new Character("Ann",ClassFactory.getClass("Bard"));
        bard.print();

        bard.addClassBonuses();
        bard.print();

        Character ranger = new Character("Roy",ClassFactory.getClass("Ranger"));
        ranger.print();

        ranger.addClassBonuses();
        ranger.print();
    }
}