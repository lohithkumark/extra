class ShoppingCart {

    // Method to calculate total for 2 items (integer prices)
    public int calculateTotal(int item1Price, int item2Price) {
        return item1Price + item2Price;
    }

    // Method to calculate total for 3 items (integer prices)
    public int calculateTotal(int item1Price, int item2Price, int item3Price) {
        return item1Price + item2Price + item3Price;
    }

    // Method to calculate total for 2 items (decimal prices)
    public double calculateTotal(double item1Price, double item2Price) {
        return item1Price + item2Price;
    }

    // Method to calculate total for 3 items (decimal prices)
    public double calculateTotal(double item1Price, double item2Price, double item3Price) {
        return item1Price + item2Price + item3Price;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Calling method with 2 items (integer prices)
        System.out.println("Total for 2 items (integer prices): " + cart.calculateTotal(100, 150));

        // Calling method with 3 items (integer prices)
        System.out.println("Total for 3 items (integer prices): " + cart.calculateTotal(100, 150, 200));

        // Calling method with 2 items (decimal prices)
        System.out.println("Total for 2 items (decimal prices): " + cart.calculateTotal(100.5, 150.75));

        // Calling method with 3 items (decimal prices)
        System.out.println("Total for 3 items (decimal prices): " + cart.calculateTotal(100.5, 150.75, 200.25));
    }
}
