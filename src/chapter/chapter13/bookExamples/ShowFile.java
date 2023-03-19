package chapter.chapter13.bookExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {

        int i;
        FileInputStream fin;

        if(args.length != 1){
            System.out.println("ShowFile name-file");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("file don't open");
            return;
        }
        try {
            do {
                i = fin.read();
                if(i != -1){
                    System.out.println((char) i);
                }
            } while (i != -1);
        }catch (IOException e) {
            System.out.println("error to read file");
        }

        try {
            fin.close();
        }catch (IOException e){
            System.out.println("error to clos file");
        }
    }
}
