import classes.Person;

import java.util.List;

public class ImmutableListApp {
    public static void main(String[] args) {

        Person mhs = new Person("Teguh");

        mhs.addHobby("Coding");
        mhs.addHobby("Gaming");
        mhs.addHobby("Sleeping");

        doSomethingWithHobbies(mhs.getHobbies());

        for(var hobby : mhs.getHobbies()){
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        try{
            hobbies.clear();
            hobbies.add("Ups di Hack\uD83E\uDD2D\uD83D\uDE1C");
        } catch (UnsupportedOperationException uoe) {
            System.err.println("Jangan coba-coba diubah!");
            System.err.println("I really know what you doing! \n");
        }
    }
}
