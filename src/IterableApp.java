import java.util.Iterator;
import java.util.List;

public class IterableApp{
    public static void main(String[] args) {

        Iterable<String> itb = List.of("Teguh", "Prayoga", "Java");

        for(var elmItb : itb){
            System.out.println(elmItb.toUpperCase());
        }

        System.out.println("====ITERATOR====");

        Iterator<String> itr = itb.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next().toUpperCase());
        }
    }
}
