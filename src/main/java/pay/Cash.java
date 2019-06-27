package pay;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Cash implements Pay {

    private double price;
    private double input;

    public Cash(double price, double input) {
        this.price = price;
        this.input = input;
    }

    public double pay() {
        System.out.println("현금 결제가 완료되었습니다.");
        if ((input - price) > 0) {
            System.out.println("잔액 " + (input - price) + "원을 반환합니다.");
        }
        return input - price;
    }
}
