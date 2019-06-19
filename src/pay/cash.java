package pay;

public class cash implements pay {
    double price;
    double input;

    public cash(double price, double input){
        this.price = price;
        this.input = input;
    }

    public double pay(){
        System.out.println("현금 결제가 완료되었습니다.");
        if((input - price) > 0){
            System.out.println("잔액 " +(input - price)+ "원을 반환합니다.");
        }
        return input - price;

    }
}
