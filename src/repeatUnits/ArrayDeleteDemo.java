package repeatUnits;

public class ArrayDeleteDemo {
    public static void main(String[] args) {
        ArrayDelete ad = new ArrayDelete();
        for (int i = 0; i < 10; i++) {
            ad.add(i + 1);
        }
//        ad.print();
//        ad.deleteByIndex(4);
//        ad.print();
//        ad.deleteByIndex(10);
//        ad.print();

//        ad.set(6, 99);
//        ad.print();
//        ad.set(2, 67);
//        ad.print();

//        ad.add(6, 999);
//        ad.print();


//        ad.print();
//        System.out.println(ad.exists(6));
//        ad.print();
        ad.print();
        System.out.println(ad.getIndexByValue(5));
        ad.print();
    }
}
