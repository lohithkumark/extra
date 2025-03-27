public class Hair {
    String type ;
    String color ;
    String length ;
    String texture;

    public Hair(String type ,String color ,String length ,String texture){
        this.type=type;
        this.color=color;
        this.length=length;
        this.texture=texture;
    }
    public void HairStyle(){
        System.out.println("Hair type is:" + type);
        System.out.println("hair color is:" + color);
            System.out.println("hair length is " + length);
                System.out.println("hair texture is" + texture);
    }
    
}
