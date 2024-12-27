package lesson_241115;
import java.util.Scanner;
class FourSix {
    void showFourSix() {
        // 4의 배수, 6의 배수, 4와 6의 공배수 구하기
        while (true) {
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.println("1 외의 정수를 입력하세요(0을 누르면 종료됩니다) : ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            else if ((num % 4 == 0) && (num % 6 != 0)) {
                System.out.println(num + "은/는 4의 배수입니다");
            }
            else if ((num % 4 == 0) && (num % 6 == 0)) {
                System.out.println(num + "은/는 4와 6의 공배수입니다");
            }
            else if ((num % 4 != 0) && (num % 6 == 0)) {
                System.out.println(num + "은/는 6의 배수입니다");
            }
            else {  // 1, 음수, 조건에 충족하지 않은 수를 입력하였을 때
                System.out.println("다시 입력해주세요");
            }
        }
    }
}

class Drainage {
    void showDrainage() {
        while (true) {
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 외의 정수를 입력하세요(0을 누르면 종료됩니다) : ");
            int num1 = scanner.nextInt();
            if (num1 == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else if (num1 % 8 == 0) {
                System.out.println("8의 배수");
            }
            else if (num1 % 6 == 0) {
                System.out.println("6의 배수");
            }
            else if (num1 % 5 == 0) {
                System.out.println("5의 배수");
            }
            else if (num1 % 3 == 0) {
                System.out.println("3의 배수");
            }
            else if (num1 % 2 == 0) {
                System.out.println("2의 배수");
            }
            else {
                System.out.println("다시 입력해주세요");
            }

        }
    }
}
public class Judge_Drainage {
    public static void main(String[] args) {
        // FourSix 클래스
        //FourSix fs = new FourSix();
        //fs.showFourSix();

        // Drainage 클래스
        Drainage d = new Drainage();
        d.showDrainage();
    }
}
