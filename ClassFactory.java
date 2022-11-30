public class ClassFactory {
    public static CharacterClass getClass(String type) {
        return switch (type) {
            case "Ranger" -> new Ranger();
            case "Bard" -> new Bard();
            default -> null;
        };
    }
}
