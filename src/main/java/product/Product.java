package product;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Product {

    private double price;
    private double time;

    public Product(double price, double time) {
        this.price = price;
        this.time = time;
    }
}
