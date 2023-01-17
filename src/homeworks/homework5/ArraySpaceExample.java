package homeworks.homework5;

public class ArraySpaceExample {

    void trim(char[] array) {
        int beginIndex = 0;
        int endIndex = array.length - 1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == ' ') {
//                beginIndex++;
//            } else {
//                break;
//            }
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (array[i] == ' ') {
//                endIndex--;
//            } else {
//                break;
//            }
//        }
//        char[] resault = new char[(endIndex - beginIndex) + 1];
//        int j = 0;
//        for (int i = beginIndex; i <= endIndex; i++) {
//            resault[j] = array[i];
//            j++;
//        }
//        for (char c : resault) {
//            System.out.print(c);
//        }

        while(array[beginIndex] == ' '){
            beginIndex++;
        }
        while (array[endIndex] == ' '){
            endIndex--;
        }
        char[] resault2 = new char[(endIndex - beginIndex) + 1];
        int k = 0;
        for (int i = beginIndex; i <=  endIndex; i++) {
            resault2 [k++] = array[i];
        }
        for (char c : resault2) {
            System.out.print(c);
        }

    }
}