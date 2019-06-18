package customer;

public class custInfo {
    private static customer[] custList = new customer[5];



    private void init(){
        custList[0] = new customer(1,1);
        custList[1] = new customer(2,2);
        custList[2] = new customer(3,3);
        custList[3] = new customer(4,4);
        custList[4] = new customer(5,5);
    }

    public static boolean check(double phoneNumber, int PW){
        for(int i = 0; i < custList.length; i++){
            if(phoneNumber == custList[i].getPhoneNumber() && PW == custList[i].getPW()){
                return true;
            }
        }
        return false;
    }

    public custInfo(){
        init();
    }


}
