package chapter.chapter14.treeSet;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> nameSet = new TreeSet<>();
        nameSet.add("Poxos");
        nameSet.add("Valod");
        nameSet.add("Arzuman");
        nameSet.add("Mirhav");

        for (String s : nameSet) {
            System.out.println(s);
        }
    }
}
