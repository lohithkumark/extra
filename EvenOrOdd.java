import java.util.Scanner;
public class EvenOrOdd {
    public static int printFactorial(int n ) {
        if(n % 2 == 0 ){
            System.out.println("The no is even");
        }
            else{
                System.out.println("The no is odd");
            }
            return n;
        }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        
              printFactorial(n);
        }
}

