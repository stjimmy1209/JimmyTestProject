package DataStructures.HeroInfo;

public class RoleTest {

    public static void main(String[] args) {

        RoleBiz biz = new RoleBiz();
        biz.addRole(new Role("Superman", "Super Hero", 1000, 150));
        biz.addRole(new Role("Batman", "Super Hero", 400, 40));
        biz.addRole(new Role("Gouku", "Saiya", 20000, 3000));
        biz.addRole(new Role("Vader", "Dark Lord", 600, 120));
        biz.addRole(new Role("Dante", "Devil Hunter", 1250, 120));

        biz.display();

    }

}
