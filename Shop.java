public class Shop{
    
    public static void item(String itemName , double totalPrice) {
        double gstRate = 0.18;
        double gstAmount = totalPrice * gstRate;
        double finalPrice = totalPrice + gstAmount;

        System.out.println("Item:" + itemName);
        System.out.println("original price:" + totalPrice);
        System.out.println("gst:" + gstAmount);
        System.out.println("final price:" + finalPrice);

    }

    public static void main(String[] args) {
       item("shoes",4500);
    }
}