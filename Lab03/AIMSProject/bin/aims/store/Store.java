package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;
public class Store {
    // Danh sách các DVD trong cửa hàng
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("Added to store: " + dvd.getTilte());
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("Removed from store: " + dvd.getTilte());
        } else {
            System.out.println("DVD not found in store: " + dvd.getTilte());
        }
    }

    // Phương thức in ra danh sách các DVD trong cửa hàng
    public void displayStore() {
        System.out.println("***************STORE****************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is currently empty.");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
            }
        }
        System.out.println("************************************");
    }
}
