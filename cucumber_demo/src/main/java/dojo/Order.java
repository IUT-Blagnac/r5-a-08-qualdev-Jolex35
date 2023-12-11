package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String owner;
    private String target;
    private List<String> cocktails;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = "From "+ owner + " to " + target + ": " + message;
    }

    private String message;

    public Order() {
        cocktails = new ArrayList<>();
    }

    public void declareOwner(String romeo) {
        owner = romeo;
    }

    public void declareTarget(String juliette) {
        target = juliette;
    }

    public List<String> getCocktails() {
        return cocktails;
    }
}
