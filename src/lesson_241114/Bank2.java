package lesson_241114;
import java.util.Scanner;

class CreateBank {
    int balance;

    // 입금
    void setDeposit(int depositMoney) {
        if (depositMoney <= 0) {
            System.out.println("0 이상의 금액을 입력하세요 : ");
        }
        else {
            this.balance += depositMoney;
            System.out.println("입금 완료하였습니다");
        }
    }

    // 출금
    void setWithdrawal(int WithdrawalMoney) {
        if (WithdrawalMoney <= 0) {
            System.out.println("0 이상의 금액을 입력하세요 : ");
        }
        else if (WithdrawalMoney > balance) {
            System.out.println("잔액이 부족합니다.");
        }
        else {
            this.balance -= WithdrawalMoney;
            System.out.println("출금 완료하였습니다");
        }
    }

    // 잔액확인
    void getBalance() {  // 잔액 조회
        System.out.println("잔액 : " + balance + "원");
    }
}

public class Bank2 {
    public static void main(String[] args) {
        CreateBank cb = new CreateBank();

        while (true) {
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                     어떤 활동을 수행하시겠습니까?
                     1. 입금
                     2. 출금
                     3. 잔액조회
                     [종료는 4를 눌러주세요]""");
            String select = sc.next();
            if (select.equals("1")) {  // 입금
                System.out.println("입금하실 금액을 입력하세요 : ");
                int depositMoney = sc.nextInt();  // 입금 금액 입력받기
                cb.setDeposit(depositMoney);
                System.out.println("입금 후 잔액 : " + cb.balance + "원");  // 잔액 출력
            }
            else if (select.equals("2")) {  // 출금
                System.out.println("출금하실 금액을 입력하세요 : ");
                int WithdrawalMoney = sc.nextInt();  // 출금 금액 입력받기
                cb.setWithdrawal(WithdrawalMoney);
                System.out.println("출금 후 잔액 : " + cb.balance + "원");  // 잔액 출력
            }
            else if (select.equals("3")) {  // 잔액조회
                cb.getBalance();
            }
            else if (select.equals("4")) {  // 종료
                break;  // 반복 멈춤
            }
            else {  // 오류
                System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}