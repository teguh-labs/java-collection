package generics;

public class Person implements Comparable<Person>{
    private String name;
    private String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                "}" + "\n";
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}