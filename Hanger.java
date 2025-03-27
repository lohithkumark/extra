public class Hanger {
    String material ;
    String color ;
    String size ;
    int quantity ;

public Hanger(String material,String color,String size ,int quantity) {
    this.material=material;
    this.color=color;
    this.size=size;
    this.quantity=quantity;
}
public void HangerInfo(){
    System.out.println("Type of material is:"+ material);
    System.out.println("Type of color is:"+ color);
    System.out.println("Size of Hanger is:"+ size);
    System.out.println("Quantity is :"+ quantity);

}
}
