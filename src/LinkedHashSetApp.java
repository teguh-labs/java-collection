import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {
    public static void main(String[] args) {

        Set<String> cities = new LinkedHashSet<>();

        /**
         * LinkedHashSet itu elemen nya berurutan
         * Elemen pertama yang di add, maka akan menjadi elemen yang pertama
         * Tapi ingat, meskipun berurutan, ia tetap TIDAK MENGGUNAKAN INDEKS!
         * Karena strukturnya itu tetap pakai hashcode namun plus doubly linked list
         */

        cities.add("Palembang");
        cities.add("Jakarta");
        cities.add("Prabumulih");
        cities.add("Palembang");
        cities.add("Prabumulih");

        for(var city : cities){
            System.out.println(city.toUpperCase());
        }
    }
}
