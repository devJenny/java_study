package chap06;

import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("달러 환율을 입력하세요.");
        String exchangeString = sc.nextLine();
        System.out.println("순대국값을 입력하세요.");
        String priceOfSoupString = sc.nextLine();
        double exchange = Double.parseDouble(exchangeString);
        double priceOfSoup = Double.parseDouble(priceOfSoupString);
        System.out.println("순대국은 " + priceOfSoup / exchange + "달러입니다.");
    }
}
