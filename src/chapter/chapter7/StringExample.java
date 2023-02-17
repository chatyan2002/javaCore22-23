package chapter.chapter7;

public class StringExample {
    public static void main(String[] args) {
        String fullName = "Poxos Poxosyan";
        //System.out.println(fullName.trim());
        //System.out.println(fullName.substring(6));
        //System.out.println(fullName.substring(6,15));
        //System.out.println(fullName.substring(fullName.length()-3));
//        System.out.println(fullName.startsWith("Pe"));
//        System.out.println(fullName.endsWith("yan"));
//        System.out.println(fullName.contains("yan"));
//        char c = fullName.charAt(10);
//        System.out.println(c);
//        for (int i = 0; i < fullName.length(); i++) {
//            System.out.println(fullName.charAt(i));
//        }
        String fullName1 = "Poxos Poxosyan Poxosi";
        String[] names = fullName1.split(" ");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
