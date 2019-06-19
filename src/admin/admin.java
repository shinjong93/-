package admin;

public class admin {
    private double ID;
    private int PW;

    public admin(double ID, int PW) {
        this.ID = ID;
        this.PW = PW;
    }

    public boolean check(double ID, int PW) {
        return (this.ID == ID && this.PW == PW);
    }


}
