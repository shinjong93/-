package pay;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Card implements Pay {

    private double price = 0;
    private boolean isValid = false;
    private int cardNumber;

    public void isCard() {
        isValid = true;
    }

    public Card(double price, int cardNumber) {
        isCard();
        if (isValid) {
            this.price = price;
            this.cardNumber = cardNumber;
            System.out.println("카드 결제가 완료되었습니다.");
        }
    }

    public double pay() {
        return 0;
    }
}
