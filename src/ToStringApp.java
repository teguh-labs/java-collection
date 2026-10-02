import classes.Person;

import java.util.ArrayList;
import java.util.List;

public class ToStringApp {
    public static void main(String[] args) {

        Person prs = new Person("Teguh");
        System.out.println(prs);

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Teguh"));
        personList.add(new Person("Prayoga"));

        System.out.println(personList);

    }
}
