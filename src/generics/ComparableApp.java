package generics;

import java.util.Arrays;

public class ComparableApp {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Teguh", "Indonesia"),
                new Person("Joko", "Indonesia"),
                new Person("Budi", "Indonesia"),
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
