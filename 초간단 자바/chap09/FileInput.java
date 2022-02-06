package chap09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src/chap09/acronym.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNextLine()) { //다음줄이 있는지 판단
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
