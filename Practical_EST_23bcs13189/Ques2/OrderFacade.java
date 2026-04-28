public class OrderFacade {
    public void placeorder(int order){
        NotificationService notify = new NotificationService();
        PaymentService payment = new PaymentService();
        Stock st = new Stock(100);
        
        System.out.println("stock ---- " + st.stock);
        System.out.println("order ---- " + order);

        if(!st.make_order(order)){
            System.out.println("order not successfull");
        }else if(!payment.make_payment()){
            System.out.println("Payment not successful");
        }else if(!notify.sendNotification()){
            System.out.println("Notification not sent");
        }else{
            System.out.println("Order placed successfully...");
        }
    }
}
