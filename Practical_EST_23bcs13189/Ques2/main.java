public class main {
    public static void main(String[] args) {
        int order = 101;
        System.out.println("----------------------------");
        OrderFacade o = new OrderFacade();
        o.placeorder(order);
        System.out.println("----------------------------");
    }
}
