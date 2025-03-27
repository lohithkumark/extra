import java.util.Scanner;
public class Methods{
    
    public static void main(String args[]){
        System.out.println("Enter your name,age and Salary:");
        System.out.println(getName() +" age is "+ getAge() +" and his salary is "+ getSalary());
    }
    
    public static String getName(){
         
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
    }
        
    public static int getAge(){    
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        return age;
    }
    
    public static double getSalary(){
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        return salary;
    }
}

