package Test1;

public class CharacterTest {
    public static void main(String[] args) {
        Character c1 = new Character("Lara",25, "archaeologist");
        Character c2 = new Character("Kratos", 15, "demigod");

        c1.castSkill();
        c2.castSkill();
    }
}
