package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    private String tilte;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DigitalVideoDisc(String tilte, String category, String director, int length, float cost) {
        this.tilte = tilte;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        // Increment the number of DVDs and assign the id
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String tilte, String category, String director, float cost) {
        this.tilte = tilte;
        this.category = category;
        this.director = director;
        this.cost = cost;
        // Increment the number of DVDs and assign the id
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String tilte, String category, float cost) {
        this.tilte = tilte;
        this.category = category;
        this.cost = cost;
        // Increment the number of DVDs and assign the id
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String tilte) {
        this.tilte = tilte;
        // Increment the number of DVDs and assign the id
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public String getDirector() {
        return director;
    }

    public String getCategory() {
        return category;
    }

    public String getTilte() {
        return tilte;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public int getId() {
        return id;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "DVD - " + tilte + " - " + category + " - " + director + " - " + length + " mins: " + cost + " $";
    }

    // Phương thức kiểm tra tiêu đề
    public boolean isMatch(String title) {
        return this.tilte.equalsIgnoreCase(title);
    }
}