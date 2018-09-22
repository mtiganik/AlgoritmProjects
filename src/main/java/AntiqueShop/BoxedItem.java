package main.java.AntiqueShop;

public class BoxedItem implements  Sellable, Transportable {
    private String descript;
    private int price;
    private int weight;
    private boolean hazard;
    private int height = 0;
    private int width = 0;
    private int depth = 0;

    public BoxedItem(){
        this(1);
    }

    public BoxedItem(int price){
        this(price, "");
    }

    public BoxedItem(int price, String descript) {
        this(price, 1, descript);
    }

    public BoxedItem(int price, int weight, String descript){
        this(price,weight,descript, false);
    }

    public BoxedItem(int price, int weight, String descript, boolean isHazardous){
        this.descript = descript;
        this.price = price;
        this.hazard = isHazardous;
        this.weight = weight;
    }

    public String description() {
        return descript;
    }

    public int listPrice() {
        return price;
    }

    public int lowestPrice() {
        return price / 2;
    }

    public int weight() {
        return weight;
    }

    public boolean isHazardous() {
        return hazard;
    }
}
