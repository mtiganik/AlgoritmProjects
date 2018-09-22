package main.java.AntiqueShop;

public interface Sellable {

    public String description();

    /** list price in cents */
    public int listPrice();

    // lowest price that we accept
    public int lowestPrice();
}
