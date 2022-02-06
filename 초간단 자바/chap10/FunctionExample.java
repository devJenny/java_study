package chap10;

import java.util.Arrays;

public class FunctionExample {
    public static void main(String[] args) {
        sayhello();
        sayHelloTo("로라");
        printSum(5, 10);
        int result = sum(10, 10);
        System.out.println(result);

        int[] sumAndMultiply = addAndMultiply(5, 4);
        System.out.println("sum: " + sumAndMultiply[0]);
        System.out.println("product: " + sumAndMultiply[1]);
        System.out.println(Arrays.toString(sumAndMultiply));

        boolean saidHola = sayHola("바보");
    }

    /*
        인사를 했다면 true를 반환하고
        그렇지 않다면 false를 반환한다
     */
    public static boolean sayHola(String name) {
        if (name.equals("바보")) {
            System.out.println("바르고 고운 말을 사용해주세요.");
            return false;
        }
        System.out.println(name + "님, 안녕하세요?");
        return true;
    }

    //    두 정수를 더한 값과 곲한 값을 반환한다.
    public static int[] addAndMultiply(int a, int b) {
        int sum = a + b;
        int product = a * b;

        int[] result = {sum, product};
        return result;
    }

    //    두 정수를 더한 값을 반환한다.
    public static int sum(int a, int b) {
        return a + b;
    }

    //    1 + 2 = 3의 형태로 덧셈을 출력
    public static void printSum(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public static void sayHelloTo(String name) {

        System.out.println("Hello," + name);
    }

    public static void sayhello() {
        System.out.println("Hello.");
    }
}
