package chap06;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        System.out.println("영어 단어와 한글 단어를 하나씩 입력해보세요.");
        Scanner sc = new Scanner(System.in);

        String englishWorld = sc.next();
        String koreanWorld = sc.next();

        System.out.println("입력된 영단어: " + englishWorld);
        System.out.println("입력된 한글단어: " + koreanWorld);
    }
}
