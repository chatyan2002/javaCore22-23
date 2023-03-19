package chapter.chapter14.hashSet;

import java.util.HashSet;

public class HashsetEx {
    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();
        nameSet.add("Poxos");
        nameSet.add("Valod");
        nameSet.add("Arzuman");
        nameSet.add("Mirhav");


        for (String s : nameSet) {
            System.out.println(s);
        }

    }
}
