package lesson_241203;

public class Average {
    public static void main(String[] args) {
        int plus = 0;
        int result = 0;

        int number[] = new int[] {87, 70, 45, 56, 90, 72, 14, 35};
        for (int i = 0; i < number.length; i++) {
            plus += number[i];
        }
        result = plus / number.length;
        System.out.println(result);
    }
}
