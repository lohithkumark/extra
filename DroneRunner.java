public class DroneRunner {
    public static void main(String[] args) {
        
        Drone drone1 = new Drone("Mavic Air 2", "DJI", "Quadcopter", "Gray", "Brushless", "48 MP", 
                                 "LiPo", "Smart Controller", "34 minutes", "570 g", "180 x 97 x 84 mm", 
                                 "Plastic", "GPS", "68.4 km/h", "18.5 km", "Sport", "1 hour", 
                                 "10 km", "5000 m", "IP43", 34, 5000, 899, 500, 200, 4, 30, 
                                 2021, 84, 25, true, true);
        
        Drone drone2 = new Drone("Phantom 4 Pro", "DJI", "Quadcopter", "White", "Brushless", "20 MP", 
                                 "LiPo", "Phantom 4 Remote Controller", "30 minutes", "1388 g", "350 x 350 x 195 mm", 
                                 "Plastic", "GPS", "72 km/h", "7 km", "Normal", "1.5 hours", 
                                 "7 km", "5000 m", "IP43", 30, 5000, 1499, 800, 300, 4, 28, 
                                 2016, 84, 30, true, false);

        Drone drone3 = new Drone("Inspire 2", "DJI", "Quadcopter", "Black", "Brushless", "5.2K", 
                                 "LiPo", "Cendence", "27 minutes", "3440 g", "450 x 450 x 180 mm", 
                                 "Magnesium Alloy", "GPS", "94 km/h", "7 km", "Intelligent", "1 hour", 
                                 "7 km", "5000 m", "IP43", 27, 7000, 2999, 1000, 400, 4, 30, 
                                 2016, 84, 28, true, false);

        
        drone1.printDetails();
        System.out.println();  
        drone2.printDetails();
        System.out.println();
        drone3.printDetails();
    }
}
