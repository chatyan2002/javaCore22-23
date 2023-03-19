package homeworks.homework15;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        fileSearch();
//        contentSearch();
//        findLines();
//        printSizeOfPackage();
//        createFileWithContent();

    }

    static void fileSearch() {
        System.out.println("Please input pathName");
        String pathName = scanner.nextLine();
        System.out.println("Please input fileName");
        String fileName = scanner.nextLine();
        File file = new File(pathName, fileName);
        System.out.println(file.isFile());
    }

    static void contentSearch() throws IOException {
        System.out.println("Please input pathName");
        String pathName1 = scanner.nextLine();
        System.out.println("Please input text");
        String keyword = scanner.nextLine();
        File directory = new File(pathName1);

        File[] files = directory.listFiles();
        for (File file : files) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                if (line.contains(keyword)) {
                    System.out.println("File path " + file.getAbsolutePath());
                    break;
                }
                reader.close();
            }
        }

    }

    static void findLines() {
        System.out.println("Please input txtPath.txt");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(keyword);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static void printSizeOfPackage() {
        System.out.println("Please input path");
        String pathName = scanner.nextLine();
        File directory = new File(pathName);
        long totalLenght = 0;

        if(directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if(file.isDirectory()){
                    totalLenght += file.length();
                }
            }
        }
        System.out.println("Total length of all files in the directory " + totalLenght + " bytes ");
    }

    static void createFileWithContent(){
        System.out.println("Please input PathName");
        String pathName = scanner.nextLine();
        System.out.println("Please input fileName");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        scanner.close();

        try{
            File file = new File(pathName, fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("Data was successfully written to the file");
        } catch (IOException e){
            System.out.println("An error occurred while writing data to file.");
            e.printStackTrace();
        }
    }
}
