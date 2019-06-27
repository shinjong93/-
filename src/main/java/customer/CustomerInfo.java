package customer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class CustomerInfo {

    private static Customer[] custList = new Customer[5];

    private void init() {
        custList[0] = new Customer(1, 1);
        custList[1] = new Customer(2, 2);
        custList[2] = new Customer(3, 3);
        custList[3] = new Customer(4, 4);
        custList[4] = new Customer(5, 5);
    }

    public static boolean check(double phoneNumber, int pw) {
        for (Customer customer : custList) {
            if (phoneNumber == customer.getPhoneNumber() && pw == customer.getPW()) {
                return true;
            }
        }
        return false;
    }

    public CustomerInfo() {
        init();
    }
}
