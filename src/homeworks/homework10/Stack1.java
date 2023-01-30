package homeworks.homework10;

public class Stack1 {
    char stck[] = new char[10];
    int tos;

    public Stack1() {
        tos = -1;
    }

    void push(char item) {
        if (tos == 9)
            return;
        else
            stck[++tos] = (char) item;
    }

    int pop(char item) {
        if (tos < 0) {
            return 0;
        } else
            return stck[tos--];
    }
}
