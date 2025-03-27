public class Bed {

    String size = "King";
    String type = "Memory Foam";
    String material = "Wood";
    String color = "White";
    

    public Bed(String size,String type,String material ,String color){
        this.size=size;
        this.type=type;
        this.material=material;
        this.color=color;
    }

    public void BedValues(){
        System.out.println("Size of bed is:" +size);
        System.out.println("type of bed is :" + type);
        System.out.println("material type is:" + material);
        System.out.println("color:"+ color);
    }
}
