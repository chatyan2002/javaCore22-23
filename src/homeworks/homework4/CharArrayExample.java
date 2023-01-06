package homeworks.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        // #1
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;

        for (int x : chars) {
            if (x == c) {
                count++;
            }
        }
            System.out.println(c);
        System.out.println("yndhanur = " + count);

        System.out.println();
        // #2
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print(chars2[chars2.length / 2 ]);
       // System.out.print(chars2[chars2.length / 2 - 1]);

        System.out.println();



        // #3
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
            if (chars3[chars3.length-2] == 'l'){
                if (chars3[chars3.length-1] == 'y'){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }




        System.out.println();
        // #4
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' '){
                System.out.print(text[i]);
            }
        }

    }
}
