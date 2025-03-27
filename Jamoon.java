public class Jamoon {

    String color;
    String size ;
    String taste;
    String origin;

public Jamoon(String color,String size,String taste,String origin){
    this.color=color;
    this.size=size;
    this.taste=taste;
    this.origin=origin;
}

public void JamoonDetails(){
    System.out.println("color type is:" + color);
    System.out.println("size:" + size);
    System.out.println("taste is:" + taste);
    System.out.println("Origin is:" + origin);
}
}
