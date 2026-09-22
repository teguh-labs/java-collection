import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(100); //ukuran nya jadi 100, kalo gak dikasih defaultnya 10
        List<Integer> integerList = new LinkedList<>();

        names.add("Teguh");
        names.add("Muthia");
        names.add("Ridho");
        names.addAll(List.of("Aura", "Laura", "Andina", "Sultan"));

        for(var name : names){
            System.out.println(name.toUpperCase());
        }

//        for(int i = 1; i <= 10; i++){
//            System.out.println("Perulangan ke - " + i);
//        }

        Set<String> setData = Set.of("Username", "Password", "Choices");
        List<String> data1 = new ArrayList(setData); // bisa juga masukin data dari collection lain

        names.addAll(setData); //bisa juga langsung kayak gini buat masukin collection lain ke collection yang sudah kelanjur ada banyak data

        for(var data : data1){
            System.out.println(data);
        }
    }
}
