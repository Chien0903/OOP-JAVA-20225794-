package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;
public class CartTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Create a new cart
        Cart cart = new Cart();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc test1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);

        cart.addDigitalVideoDisc(test1);

        DigitalVideoDisc test2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "George Lucas", 87, 24.95f);

        cart.addDigitalVideoDisc(test2);

        DigitalVideoDisc test3 = new DigitalVideoDisc("Aladin", "Animation",
                "George Lucas", 18.99f);

        cart.addDigitalVideoDisc(test3);

        // Test the print method
        cart.printCart();
        // 	To-do: test the search methods here

        // Search by ID
        System.out.println("Search by ID:");
        cart.searchById(1);
        cart.searchById(4);

        // Search by Title
        System.out.println("Search by Title:");
        cart.searchByTitle("The Lion King");
        cart.searchByTitle("Inception");

    }

}
