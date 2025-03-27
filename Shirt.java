public class Shirt {
    String size ;
    String color ;
    String fabric ;
    String price ;


public Shirt(String size,String color,String fabric,String price ){
    this.size=size;
    this.color=color;
    this.fabric=fabric;
    this.price=price;
}

public void ShirtDetails(){
    System.out.println("Shirt size is:" + size);
    System.out.println("Shirt color is:" + color);
    System.out.println("Type of shirt is:" + fabric);
    System.out.println("Price os shirt is:" + price);
}
    
}
