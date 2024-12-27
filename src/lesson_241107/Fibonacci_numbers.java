package lesson_241107;
class Plus {
    int num1=0;
    int num2 = 1;

    void showPlus(int a) {  // 반복할 횟수를 입력받는다
        System.out.print(num1 + " "  + num2 + " ");  // for문 밖에 있어야함
        for (int i = 0; i <= a; i ++) {  // for (): 괄호 안에는 초깃값, 반복할 횟수, 증감값을 적는다
            int result = num1 + num2;
            num1 = num2;  // 피보나치 수열을 하기 위해 값을 변경
            num2 = result;  // for문 안에 있어야함
            System.out.print(result + " ");
        }
    }
}

public class Fibonacci_numbers {
    public static void main(String[] args) {
        Plus p = new Plus();
        p.showPlus(12);
    }
}