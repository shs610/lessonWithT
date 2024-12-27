package lesson_241128;

public class TwoDiceSumTotalSix {
    public static void main(String[] args) {
        int dice1 = 1;  // 첫번째 주사위(1부터 시작)
        int dice2 = 5;  // 두번째 주사위(5부터 시작)
        for (int i = 1; i < 6; i++) {  // 첫번째 주사위(1~6)
            for (int k = 6; k > 1; k--) {  // 두번째 주사위(6~1)
                dice2 = k - 1;
                int six = dice1 + dice2;  // 두 주사위의 합을 판별해줄 변수
                if (six == 6) {
                    System.out.println("{" + dice1 + ", " + dice2 + "}");  // 두 주사위의 합이 6일 경우 출력
                }
            }
            dice1 = i + 1;
        }
    }
}
