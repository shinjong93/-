package pay;

public class card implements pay {
    double price = 0;
    boolean is_vaild = false;
    int cardNumber;


    public void is_card(){
        is_vaild = true;
    }

    public card(double price, int cardNumber){
        this.price = price;
        this.cardNumber = cardNumber;
    }

    public double pay(){
        return 0;
    }
}
