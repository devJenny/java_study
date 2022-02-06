public class Exam07 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println();

        System.out.println("==========");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.print(/*i + "x" + j + "=" + */i * j +" ");
            }
            System.out.println();
        }

    }
}
