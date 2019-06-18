package product;

public class selectProduct {
    private product selected;
    private int index;

    public selectProduct(int index){
        selected = productCatalog.getItem(index);
    }

    public product getItem(){
        return selected;
    }


}
