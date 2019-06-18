package product;

public class product {
    private double price;
    private double time;

    public double getPrice(){
        return price;
    }

    public double getTime(){
        return time;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setTime(double time){
        this.time = time;
    }

    public product(double price, double time){
        setPrice(price);
        setTime(time);
    }
}
