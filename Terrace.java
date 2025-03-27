public class Terrace {
    int size ;
    String floorType ;
    String view ;
    String material ;

    public Terrace(int size,String floorType ,String view ,String material){
        this.size=size;
        this.floorType=floorType;
        this.view=view;
        this.material=material;
    }

    public void TerraceValues(){
        System.out.println("size of floor is:"+ size);
        System.out.println("size of floor is:"+ floorType);
        System.out.println("size of floor is:"+ view);
        System.out.println("size of floor is:"+ material);
    }
}

    