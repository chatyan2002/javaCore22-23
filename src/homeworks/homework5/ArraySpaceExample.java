package homeworks.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] SpaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int beginIndex = SpaceArray[0];
        int endIndex = SpaceArray.length - 1;
        char[] result = new char[SpaceArray.length];
        for (int i = 0; i < SpaceArray.length; i++) {
            if (beginIndex == ' ' && endIndex == ' ') {
                if (SpaceArray[i] != ' ') {
                    SpaceArray[i] = result[result.length];
                    System.out.println(result[result.length]);
                }
            }
            }
       // System.out.print(result);
    }
}
