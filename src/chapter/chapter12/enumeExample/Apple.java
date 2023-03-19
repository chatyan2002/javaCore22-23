package chapter.chapter12.enumeExample;

public enum Apple {

    Jonathan(10), GoldenDel(8), RedDel(), Winesap(19), Cortland(6);

    private int price;
    Apple(int p) {
        price = p;
    }
    Apple() {
        price = -1;
    }
    int getPrice(){
        return price;
    }
}
