public class Stock{
    public int stock;

    Stock(int val){
        stock = val;
    }

    public boolean check_status(int val){
        if( val <= stock) return true;
        else return false;
    }

    public boolean make_order(int val){
        if(check_status(val)){
            stock -= val;
            return true;
        }else{
            System.out.println("Not enough Stock available");
            return false;
        }
    }
}

