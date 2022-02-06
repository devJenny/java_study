package chap05;

public class WrapperTypes2 {
    public static void main(String[] args) {
        Integer integerNumber = 3;
        float floatNumber = integerNumber.floatValue();
        double doubleNumber = integerNumber.doubleValue();
        String stringNumber = integerNumber.toString();

        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(stringNumber);
    }
}
