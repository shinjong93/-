import product.*;
import pay.*;
import customer.*;
import admin.*;

public class core {
    private  productCatalog items;
    private custInfo custInfos;
    private pay cash;
    private pay card;
    private admin admin;
    private boolean isAdmin = false;
    private boolean logIn = false;


    public core() {
        items = new productCatalog();
        custInfos = new custInfo();
        admin = new admin(9, 0);
    }

    public void logIn(double ID, int PW) {
        if (custInfos.check(ID, PW)) {
            logIn = true;
            System.out.println("로그인 되었습니다.");
        } else if (admin.check(ID, PW) == true) {
            isAdmin = true;
            logIn = true;
            System.out.println("관리자로 로그인 되었습니다.");
        }
    }

    public void cardPay(double price, int cardNumber){
        card = new card(price,cardNumber);
        card.pay();
    }

    public void cashPay(double price, double input){
        cash = new cash(price, input);
        cash.pay();
    }

    public void createItem(double price, double time){
        if(isAdmin && logIn){
            items.addItem(price,time);
        } else {
            System.out.println("관리자만 접근 가능한 메뉴입니다.");
        }
    }

    public void deleteItem(int index){
        if(isAdmin && logIn){
            items.deleteItem(index);
        } else {
            System.out.println("관리자만 접근 가능한 메뉴입니다.");
        }
    }

}

