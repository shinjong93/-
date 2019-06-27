package product;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class SelectProduct {

    private Product product;
    private int index;

    public SelectProduct(int index) {
        product = ProductCatalog.getItem(index);
    }

    public Product getItem() {
        return product;
    }
}
