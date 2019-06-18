package customer;

public class customer {
    private double phoneNumber;
    private int PW;

    public void setPhoneNumber(double number){
        this.phoneNumber = number;
    }

    public void setPW(int PW) {
        this.PW = PW;
    }
    public double getPhoneNumber(){
        return phoneNumber;
    }

    public double getPW(){
        return PW;
    }

    public customer(double phoneNumber,int PW){
        setPhoneNumber(phoneNumber);
        setPW(PW);
    }
}
