public class InvoiceTest{
    public static void main(String args[]){
        Invoice Phone = new Invoice("Iphone","16gb",3,14500);
        System.out.println(Phone.getNumber());
        System.out.println(Phone.getDescription());
        System.out.println(Phone.getPurchased());
        System.out.println(Phone.getPrice());
        System.out.println(Phone.getInvoiceAmount());
    }
}