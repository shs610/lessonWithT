package lesson_241112;

public class Star_for {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {  // 줄갯수(초깃값 : 1, 반복할 횟수 : 3, 1줄씩 증가)
            for (int j = 1; j <= 3-i; j++) {  // 공백(초깃값 : 2, 반복할 횟수 : 2, 1씩 감소)
                System.out.print(" ");
            }
                for (int b = 1; b <= 2 * i - 1; b++) {  // *(초깃값 : 1, 반복할 횟수 : 3, 2씩 증가)
                    System.out.print("*");
                }
                System.out.println();
        }
        for (int i = 3; i >= 1; i--) {  // 줄갯수
            for (int j = 0; j < 3 - i; j++) {  // 공백
                System.out.print(" ");
            }
            for (int b = 1; b <= i *2 -1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}