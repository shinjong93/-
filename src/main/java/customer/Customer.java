package customer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Customer {
    private double phoneNumber;
    private int pw;

    public Customer(double phoneNumber,int pw){
        setPhoneNumber(phoneNumber);
        setPw(pw);
    }
}
