package chapter6.exercisesOfBook;

public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("stack lcvac e");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("stack kanchvac che");
            return 0;
        } else
            return stck[tos--];
    }

}
