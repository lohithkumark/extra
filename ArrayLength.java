public class ArrayLength {

    public static void displayArray() {
        int[] arr = {1, 2, 3, 4, 5};  

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {
        displayArray();  
    }
}