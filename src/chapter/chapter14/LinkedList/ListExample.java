package chapter.chapter14.LinkedList;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("poxos");
        names.add("petros");
        names.add("martiros");

        for (String name : names) {
            System.out.println(name);
        }
//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println(next);
//        }

    }
}
