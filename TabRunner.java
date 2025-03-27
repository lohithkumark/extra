public class TabRunner {
    public static void main(String[] args) {
        
        Tab tab1 = new Tab("Samsung", "Galaxy Tab S7", "Black", "11 inches", "Android", "Snapdragon 865", 
                           "15 hours", "128GB", "Rear: 13MP, Front: 8MP", "Aluminum", 500, 650, 6, 128, 2560, 
                           4, 2020, 10, 10000, 2, 1);
        Tab tab2 = new Tab("Apple", "iPad Pro 12.9", "Silver", "12.9 inches", "iOS", "Apple A12Z Bionic", 
                           "10 hours", "256GB", "Rear: 12MP, Front: 7MP", "Aluminum", 700, 1000, 8, 256, 2732, 
                           5, 2021, 20, 15000, 3, 2);
        Tab tab3 = new Tab("Microsoft", "Surface Pro 7", "Platinum", "12.3 inches", "Windows", "Intel Core i5", 
                           "10.5 hours", "128GB", "Rear: 8MP, Front: 5MP", "Magnesium", 775, 900, 8, 128, 2736, 
                           4, 2020, 15, 7200, 2, 1);

        
        tab1.printDetails();
        System.out.println();  
        tab2.printDetails();
        System.out.println();
        tab3.printDetails();
    }
}
