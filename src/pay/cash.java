package pay;

public class cash implements pay {
    double price;
    double input;

    public cash(double price, double input){
        this.price = price;
        this.input = input;
    }

    public double pay(){
        return input - price;
    }
}
