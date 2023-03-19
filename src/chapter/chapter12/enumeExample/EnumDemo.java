package chapter.chapter12.enumeExample;

public class EnumDemo {

    public static void main(String[] args) {

        Apple ap;
        ap = Apple.Jonathan;
        System.out.println(ap);

        ap = Apple.RedDel;
        if (ap == Apple.RedDel) {
            System.out.println("red " + ap + '\n');
        }

        ap = Apple.Cortland;
        switch (ap){
            case RedDel:
                System.out.println("ap is red");
                break;
            case Winesap:
                System.out.println("ap is wine");
                break;
            case Jonathan:
                System.out.println("ap is joni");
                break;
            case GoldenDel:
                System.out.println("ap is gold");
                break;
            case Cortland:
                System.out.println("ap is cort");
                break;
        }

    }

}
