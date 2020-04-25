public class Main {
    public static void main(String[] args) {
        Flip temirtayFlip = new Flip();
        Book psychology = new Book("Red pill",7000);
        Book programming = new Book("Java Head First",6500);
        temirtayFlip.add(psychology);
        temirtayFlip.add(programming);
        temirtayFlip.sell(psychology);
        temirtayFlip.printAllProducts();
    }
}
