public class Floor {
    private int length; 
    private int breadth;
    private String material ;
    private String color ;


public Floor(int length,int breadth,String material,String color){
    this.length=length;
    this.breadth=breadth;
    this.material=material;
    this.color=color;
}
public void printValues() {
    System.out.println("Length: " + length);
    System.out.println("Breadth: " + breadth);
    System.out.println("Material: " + material);
    System.out.println("Color: " + color);
}
} 