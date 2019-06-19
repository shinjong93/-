package pay;

public class card implements pay {
    double price = 0;
    boolean is_vaild = false;
    int cardNumber;


    public void is_card(){
        is_vaild = true;
    }

    public card(double price, int cardNumber){
        is_card();
        if(is_vaild){
            this.price = price;
            this.cardNumber = cardNumber;
            System.out.println("카드 결제가 완료되었습니다.");
        }
    }

    public double pay(){
        return 0;
    }
}
