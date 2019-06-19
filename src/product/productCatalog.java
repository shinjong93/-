package product;

public class  productCatalog {
    static private product[] item = new product[5];

    public static product getItem(int index){
        return item[index];
    }

    public static void init(){
        item[0] = new product(6000, 3600);
        item[1] = new product(12000, 3600 * 2);
        item[2] = new product(24000, 3600 * 3);
        item[3] = new product(36000, 3600 * 4);
        item[4] = new product(72000, 3600 * 5);
    }

    public static void deleteItem(int index){
        item[index] = new product(-1,-1);
    }

    public static void showItem(){
        int index = 1;
        for(product i : item){
            System.out.println("상품 번호 : " + index + "\n사용시간 : " + i.getTime() + " 가격 : " + i.getPrice());
            index++;
        }
    }

    public static void addItem(double price, double time){
        for(int i = 0; i < item.length; i++){
            if(item[i].getPrice() == -1){
                item[i] = new product(price,time);
                break;
            }
        }
    }

    public productCatalog(){
        init();
    }
}
