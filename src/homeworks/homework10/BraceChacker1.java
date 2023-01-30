package homeworks.homework10;

public class BraceChacker1 {
    private String text;

    private char lastelement;
//    private char c;

    public BraceChacker1(String text1) {
        text = text1;
    }

    public void check() {
        Stack1 myStack = new Stack1();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '[':
                    myStack.push(c);
                    lastelement = (char)
                            myStack.pop(c);
                    if (lastelement != ']' && lastelement != ')' && lastelement != '}') {
                        System.out.println("Error opend : " + lastelement + " but not closed it ");
                    }
                    break;
                case '(':
                    myStack.push(c);
                    lastelement = (char)
                            myStack.pop(c);
                    if (lastelement != ')' && lastelement != ']' && lastelement != '}') {
                        System.out.println("Error opend : " + lastelement + " but not closed it ");
                    }
                    break;
                case '{':
                    myStack.push(c);
                    lastelement = (char)
                            myStack.pop(c);
                    if (lastelement != '}' && lastelement != ')' && lastelement != ']') {
                        System.out.println("Error opend : " + lastelement + " but not closed it ");
                    }
                    break;

                case ']':
                    lastelement = (char)
                            myStack.pop(c);
                    if (lastelement != ']') {
                        System.out.println("Error at: " + i + " index closed " + c + " but not open");
                    } else if (lastelement != '[') {
                        System.out.println("Error opend: " + lastelement + " but closed " + c + " at " + i);
                    }
                    break;
                case ')':
                    lastelement = (char)
                            myStack.pop(c);
                    if (lastelement != ')') {
                        System.out.println("Error at: " + i + " index closed " + c + " but not open");
                    } else if (lastelement != '(') {
                        System.out.println("Error opend: " + lastelement + " but closed " + c + " at " + i);
                    }
                    break;
                case '}':
                    lastelement = (char)
                            myStack.pop(c);
                    if (lastelement != '}') {
                        System.out.println("Error at: " + i + " index closed " + c + " but not open");
                    } else if (lastelement != '{') {
                        System.out.println("Error opend: " + lastelement + " but closed " + c + " at " + i);
                    }
                    break;

            }
        }
    }
}
