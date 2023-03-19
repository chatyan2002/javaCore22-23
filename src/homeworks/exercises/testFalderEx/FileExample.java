package homeworks.exercises.testFalderEx;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\IdeaProjects\\homework\\src\\homeworks\\exercises\\testfalder\\example5.txt");

        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        boolean delete = file.delete();
        System.out.println(delete);

        if (file.exists() && file.isDirectory()) {

            File[] list = file.listFiles();
            System.out.println("isDir: " + file.isDirectory());

            for (File s : list) {
                System.out.println(s.getAbsolutePath() + s.getName() + s.length());
            }

//        System.out.println(file.isDirectory());
        }else {
        //    file.mkdir();
        }

        file.deleteOnExit();
        file.getFreeSpace();
        file.getParent();
    }
}


