package io.codelex.behavioral.visitor;

class Chocolate implements Visitable {
    private final String name;
    private final int price;
    private final int sugar;
    private final int ccal;

    Chocolate(String name, int price, int sugar, int ccal) {
        this.name = name;
        this.price = price;
        this.sugar = sugar;
        this.ccal = ccal;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSugar() {
        return sugar;
    }

    public int getCcal() {
        return ccal;
    }
}
