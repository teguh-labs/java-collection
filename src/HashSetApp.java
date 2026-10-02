import java.util.*;

public class HashSetApp {
    public static void main(String[] args) {

        /**
         * SET = merupakan struktur data yang isinya tidak boleh duplikat sama sekali
         * Kenapa tidak bisa duplikat?
         * Karena Set menyimpan elemen dalam bentuk Hash Code
         * Jika 2 elemen punya hashcode yang sama, maka ia dianggap sebagai 1 elemen saja
         * Karena hashcode itu bentuk angka random, maka ia tidak punya pengurutan yang pasti
         * karena elemen kedua bisa saja memiliki hascode yang awalan angkanya lebih kecil dari elemen pertama
         * sehingga Set tidak memiliki indeks seperti List yang menggunakan indeks
         *
         * HASH SET = Tidak berurutan, karena ia murni pakai struktur hashcode
         */

        Set<String> names = new HashSet<>();

        names.add("Teguh");
        names.add("Eko");
        names.add("Sandhika");
        names.add("Teguh");
        names.add("Doddy");
        names.add("Doddy");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next().toUpperCase());
        }

    }
}
