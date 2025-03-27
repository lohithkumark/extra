class IronBox {
    String brand ;
    int wattage ;
    String color ;
    String type;


    public IronBox( String brand ,int wattage , String color ,String type){
        this.brand=brand;
        this.wattage=wattage;
        this.color=color;
        this.type=type;
    }

    public void IronBoxDetils(){
        System.out.println("brand is:" + brand);
        System.out.println("wattage capacity:" + wattage);
        System.out.println("type of color:" + color);
        System.out.println("type :" + type);
    }
}