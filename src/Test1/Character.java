package Test1;

public class Character {
    public String name;
    public int level;
    public String occupation;

    public Character(String name1, int level1, String occupation1){
        name = name1;
        level = level1;
        occupation = occupation1;
    }

    public void castSkill() {
        if (name.equals("Lara"))
        {
            System.out.println("Two Pistols!!");
        }else if(name.equals("Kratos")){
            System.out.println("Blades of Athena!");
        }
    }

}


