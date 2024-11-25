package Lab02;

public class Cart {
    public static  final int MAX_NUMBERS_ORDERED = 20;  //So luong DVD toi da
    private DigitalVideoDisc itemOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int quantity; //So luong DVD trong gio
    private float totalCost;  //Tong gia tri DVD trong gio
    public Cart() {
        this.quantity = 0;
        this.totalCost = 0;
    }
    //Them DVD vao gio hang
    public void addDigitalVideoDisc (DigitalVideoDisc disc) {
        if(quantity <= MAX_NUMBERS_ORDERED) {
            itemOrdered[quantity] = disc;
            quantity++;
            totalCost += disc.getCost();
        }
        else {
            System.out.println("The Cart is full. Can't add!");
        }
    }
    public void addDigitalVideoDisc (DigitalVideoDisc[] dvdList) {
        for(DigitalVideoDisc dvd : dvdList) {
            if (quantity == MAX_NUMBERS_ORDERED) {
                System.out.println("The Cart is full. Can't add!" + dvd.getTilte());
                break;
            }
            this.itemOrdered[quantity] = dvd;
            this.quantity++;
            totalCost += dvd.getCost();
        }
    }
    public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(quantity == MAX_NUMBERS_ORDERED) {
            System.out.println("The Cart is full. Can't add!" + dvd1.getTilte() + "and" + dvd2.getTilte());
        }
        else {
            if(quantity < MAX_NUMBERS_ORDERED) {
                this.itemOrdered[quantity] = dvd1;
                this.quantity++;
                totalCost += dvd1.getCost();
                System.out.println("Added " + dvd1.getTilte() + " successful!");
            }
            if(quantity < MAX_NUMBERS_ORDERED) {
                this.itemOrdered[quantity] = dvd2;
                this.quantity++;
                totalCost += dvd2.getCost();
                System.out.println("Added " + dvd2.getTilte() + " successful!");
            }
            else {
                System.out.println("The Cart is full. Can't add!" + dvd2.getTilte());
            }
        }
    }
    //Xoa DVD ra khoi gio hang
    public void removeDigitalVideoDisc (DigitalVideoDisc disc){
        int index = -1;
        for(int i = 0; i < quantity; i++) {
            if(disc == itemOrdered[i]){
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("Unavailble Disc");
        }
        else {
            for(int i = index; i < quantity - 1; i++)
            {
                itemOrdered[i] = itemOrdered[i+1];
            }
            itemOrdered[quantity - 1] = null;
            quantity--;
            totalCost -= disc.getCost();
            System.out.println("The Disc has been removed!");
        }
    }
    //Tinh tong tien tat ca DVD
    public float Total(){
        return totalCost;
    }
    //dua ra danh sach cac DVD
    public void DisplayCart() {
        for(int i = 0; i < quantity; i++) {
            System.out.println((i + 1) + ": " + itemOrdered[i].getTilte() + " with ID = " + itemOrdered[i].getId());
        }
    }
    // In giỏ hàng
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (int i = 0; i < quantity; i++) {
            System.out.println((i + 1) + ". " + itemOrdered[i].toString());
            totalCost += itemOrdered[i].getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }
    // Tìm kiếm DVD theo id
    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < quantity; i++) {
            DigitalVideoDisc disc = itemOrdered[i];
            if (disc.getId() == id) {
                System.out.println("Found: " + disc.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }
    // Tìm kiếm DVD theo tiêu đề
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < quantity; i++) {
            DigitalVideoDisc disc = itemOrdered[i];
            if (disc.isMatch(title)) {
                System.out.println("Found: " + disc.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }
}
