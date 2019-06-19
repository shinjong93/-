import java.util.*;

public class kiosk {
    static core c = new core();
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int flag = -1;
        int pay = 1;
        while (flag != 0) {
            System.out.println("아이디를 입력하십시오.");
            double ID = s.nextDouble();
            System.out.println("비밀번호를 입력하십시오.");
            int PW = s.nextInt();
            c.logIn(ID, PW);

            while (c.adminLogIn()) {
                System.out.println("관리자 모드로 전환되었습니다.\n기존 상품 삭제는 1, 새로운 상품 등록은 0를 입력합니다.\n 종료를 원하시면 0과 1을 제외한 숫자를 입력합니다.");
                int adminFlag = s.nextInt();
                if (adminFlag == 0) {
                    System.out.println("새로운 상품의 가격을 입력하십시오.");
                    double price = s.nextDouble();
                    System.out.println("새로운 상품의 시간을 입력하십시오");
                    double time = s.nextDouble();

                    c.createItem(price, time);
                    c.showItem();
                } else if (adminFlag == 1) {
                    System.out.println("삭제하고자 하는 상품의 번호를 입력하십시오.");
                    c.deleteItem(s.nextInt() - 1);
                    c.showItem();
                } else {
                    break;
                }
            }
            if (!c.adminLogIn()) {
                System.out.println("\n" + "상품 목록입니다.\n");
                c.showItem();

                System.out.println("상품 번호를 입력하십시오.");
                c.select(s.nextInt());

                System.out.println("카드 결제는 1을, 현금 결제는 2가 입력됩니다.");
                pay = s.nextInt();

                if (pay == 1) {
                    System.out.println("카드를 기계에 읽혀주십시오");
                    c.cardPay(s.nextInt());
                } else {
                    System.out.println("현금을 입력하십시오.");
                    c.cashPay(s.nextDouble());
                }
            }
            c.logOut();
            System.out.println("종료를 위해서는 0을 입력하십시오.");
            flag = s.nextInt();

        }


    }


}

