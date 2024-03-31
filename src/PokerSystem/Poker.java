package PokerSystem;

public class Poker {
    private String color;
    private String number;
    private int order;

    public Poker() {
    }
    public Poker(String color, String number, int order) {
        this.color = color;
        this.number = number;
        this.order = order;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return color + number;
    }
}   // Class end.
