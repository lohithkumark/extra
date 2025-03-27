public class Invoice{
    private  String Number;
     private String Description;
      private int Purchased;
       private double Price;

public Invoice (String Number,String Description ,int Purchased,double Price)
{
this.Number = Number;
this.Description = Description;
this.Purchased = Purchased;
this.Price = Price;
}

public void setNumber(String Number){
    this.Number = Number;
}

public String getNumber(){
    return Number;
}
public void setDescription(String Description){
    this.Description = Description;
}

public String getDescription(){
    return Description;
}

public void setPurchased(int Purchased){
    this.Purchased = Purchased;
}

public int getPurchased(){
    return Purchased;
}
public void setPrice(double Price){
    this.Price = Price;
}
public double getPrice(){
    return Price;
}


public double getInvoiceAmount(){

    return this.Purchased * this.Price;
}
}




