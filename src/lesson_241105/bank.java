package lesson_241105;

import java.util.Scanner;

class Bank {  // 클래스 Bank 생성
    int money;  // 입금, 출금할 돈
    int balance;  // 통장 잔고 변수
    String select;  // 선택 변수(입금인지, 출금인지)

    int getBalance() {
        return balance; // 잔고 출력
    }

    void setDeposit(int money) {
        if (money <= 0) {
            System.out.println("0 이상의 금액을 입력하세요.");
        } else {
            this.balance += money;
            System.out.println("입금 완료");
        }
    }

    void setWithraw(int money) {
        if (money <= 0) {
            System.out.println("0 이상의 금액을 입력하세요.");
        } else {
            this.balance -= money;
            System.out.println("출금 완료");
        }
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입금 또는 출금을 입력하세요 : ");
        String select = sc.nextLine();
        Bank b = new Bank();
        if(select.equals("출금")){
            b.setWithraw(10000);
        }
        else if(select.equals("입금")){
            b.setDeposit(10000);
        }
        else {
            System.out.println("입금 혹은 출금 중에 입력해주세요");
        }
        System.out.println("현재 잔고는"+ b.getBalance());

    }
}