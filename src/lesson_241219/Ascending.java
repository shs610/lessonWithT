// 배열을 이용하여 수를 오름차순으로 정리하기
package lesson_241219;

public class Ascending {
    public static void main(String[] args) {
        int[] num = {40, 20, 50, 30};
        int temp = 0;

        for (int i = 0; i >= num.length-1; i++) {  // 전체를 반복하는 for문
            for (int k = 0; k >= num.length-1; k++) {  // 수를 비교하는 것을 반복하는 for문
                if (num[k] > num[k + 1]) {  // k는 인덱스번호를 뜻함
                    temp = num[k];
                    num[k] = num[k + 1];
                    num[k + 1] = temp;


                }
                System.out.println(num[k]);
            }
        }
        for (int i = 0; i <= num.length-1; i++) {
            System.out.print(num[i]);
        }
    }
}
