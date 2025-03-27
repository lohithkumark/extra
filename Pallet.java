public class Pallet {
    





    
    String color, material, size, type, origin, weight, loadCapacity, shape, condition, manufacturer;


    public Pallet (){

    }

    public Pallet(String color){
        this.color=color;
    }

    public Pallet(String color,String material){
        this.color=color;
        this.material=material;

    }

    public Pallet(String color,String material,String size){
        this(color,material);
        this.size = size;
    
    }

    public Pallet(String color,String material,String size,String type){
        this(color,material,size);
        this.type=type;
}

public Pallet(String color,String material,String size,String type,String origin){
    this(color,material,size,type);
    this.origin=origin;
}

public Pallet(String color,String material,String size,String type,String origin,String weight){
    this(color,material,size,type,origin);
    this.weight=weight;
}

public Pallet(String color,String material,String size,String type,String origin,String weight,String loadCapacity){
    this(color,material,size,type,origin,weight);
    this.loadCapacity=loadCapacity;
}

public Pallet(String color,String material,String size,String type,String origin,String weight,String loadCapacity,String shape){
    this(color,material,size,type,origin,weight,loadCapacity);
    this.shape=shape;

}

public Pallet(String color,String material,String size,String type,String origin,String weight,String loadCapacity,String shape,String condition){
    this(color,material,size,type,origin,weight,loadCapacity,shape);
    this.condition=condition;
}

public Pallet(String color,String material,String size,String type,String origin,String weight,String loadCapacity,String shape,String condition,String manufacturer){
    this(color,material,size,type,origin,weight,loadCapacity,shape,condition);
    this.manufacturer=manufacturer;
}

public void Info(){
    System.out.println("The infomation of pallet is:");
    System.out.println("color is :" + color);
    System.out.println("material is :" + material);
    System.out.println("size is:" + size);
    System.out.println("Type is:" + type); 
    System.out.println("origin is :" + origin);
    System.out.println("weigth is :" + weight);
    System.out.println("capacity is :" + loadCapacity);
    System.out.println("shape is :" + shape );
    System.out.println("condition is :" + condition);
    System.out.println("manufacturer is :" + manufacturer);
}

}







