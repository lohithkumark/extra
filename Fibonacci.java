public class Fibonacci {

    public static void findFibonacci() {
        int n = 10;  //this is position

        int a = 0, b = 1;
    
        if (n == 0) {
            System.out.println("Fibonacci number at position " + n + " is " + a);
            return;
        }
    
        if (n == 1) {
            System.out.println("Fibonacci number at position " + n + " is " + b);
            return;
        }
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Fibonacci number at position " + n + " is " + b);
    }

    public static void main(String[] args) {
        findFibonacci(); 
    }
}