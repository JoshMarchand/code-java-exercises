import java.util.Random;

public class ServerNameGenerator {
    static Random rand = new Random();
    static String[] race = {"orc", "human", "blood elf", "tauren", "pandaren", "draenei", "undead", "troll", "gnome", "dwarf", "worgen", "goblin"};
    static String[] type = {"mage", "paladin", "rogue", "hunter", "warrior", "warlock", "demon hunter", "death knight", "monk", "priest", "shaman"};

    public static void main(String[] args) {
        System.out.printf("%s-%s", random(race), random(type));
    }

    public static String random(String[] array){
        return array[rand.nextInt(array.length)];
    }
}
