package main.java.AntiqueShop;

public class Photograph implements Sellable {
    private String description;
    private int price;
    private boolean color;

    public Photograph(int price, boolean isItInColors, String description){
        this.price = price;
        this.color = isItInColors;
        this.description = description;
    }


    public boolean isColor(){
        return color;
    }

    public String description() {
        return description;
    }

    public int listPrice() {
        return price;
    }

    public int lowestPrice() {
        return price/2;
    }
}
