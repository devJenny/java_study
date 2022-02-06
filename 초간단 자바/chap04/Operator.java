package chap04;

public class Operator {
    public static void main(String[] args) {
        /* 연산자 우선순위
          1. ()
          2. * / %
          3. + -
         */
        System.out.println(8 + 2);
        System.out.println(8 - 2);
        System.out.println(8 * 2);
        System.out.println(8 / 2);
        System.out.println(7 / 2);
        System.out.println(7 % 2);

        int number = 5;
        number = (int) 1.2;
        System.out.println(number);

        System.out.println(1 + 1.2);
        System.out.println(7 / 2);
        System.out.println(7 / 2.0);

    }
}
