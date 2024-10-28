package Lab02

public class DigitalVideoDisc {
    private String tilte;
    private String category;
    private String director;
    private int length;
    private float cost;

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

    public DigitalVideoDisc(String tilte, String category, String director, int length, float cost) {
        this.tilte = tilte;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(String tilte, String category, String director, float cost) {
        this.tilte = tilte;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String tilte, String category, float cost) {
        this.tilte = tilte;
        this.category = category;
        this.cost = cost;
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


}