import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionApp {

    public static void main(String[] args) {
        Collection<String> clc = new ArrayList<>();

        clc.add("Teguh");
        clc.add("Prayoga");
        clc.addAll(List.of("Programmer", "Java", "abcdefg", "hijk", "lmn", "opq"));

        clc.remove("abcdefg");
        clc.removeAll(List.of("hijk", "lmn", "opq"));

        Iterator<String> itr = clc.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
