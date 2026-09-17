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

        //--MENGHAPUS ELEMEN
        clc.remove("abcdefg");
        clc.removeAll(List.of("hijk", "lmn", "opq"));

        Iterator<String> itr = clc.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //---MENGECEK APA ADA ELEMEN YANG DIMAKSUD, return val : boolean
        System.out.println(clc.contains("Teguh")); //True
        System.out.println(clc.containsAll(List.of("Programmer", "Zaman", "Now"))); //FALSE

        //---NGASIH TAU JUMLAH ELEMEN
        System.out.println(clc.size());

        //---CEK APA KOSONG ATAU ADA ELEMEN
        System.out.println(clc.isEmpty()); //FALSE

        Collection<Integer> clc2 = new ArrayList<>();
        System.out.println(clc2.isEmpty()); //TRUE
    }
}
