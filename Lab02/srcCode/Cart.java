
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
            System.out.println((i + 1) + ": " + itemOrdered[i].getTilte());
        }
    }
}
