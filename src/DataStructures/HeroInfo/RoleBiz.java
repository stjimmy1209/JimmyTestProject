package DataStructures.HeroInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RoleBiz {

    List<Role> roleList = null;

    public RoleBiz(){

        roleList = new ArrayList<>();

    }

    public void addRole(Role role){

        if(role != null){
            roleList.add(role);
        }
    }

    public void removeRole(Role role){

        roleList.remove(role);

    }

    public void display(){

        System.out.println("Role\tTitle\t\t\t\tHP\tAttack");
        System.out.println("*****************************");
        Iterator<Role> roleit = roleList.iterator();
        while(roleit.hasNext()){
            Role role = roleit.next();
            System.out.println(role.getName() + "\t" + role.getTitle() + "\t" +
            role.getHp() + "\t" +role.getAttack());

        }

    }


}
