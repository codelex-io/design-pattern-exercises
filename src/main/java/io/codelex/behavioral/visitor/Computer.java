package io.codelex.behavioral.visitor;

class Computer implements Visitable {
    private final String manufacturer;
    private final String model;
    private final int price;
    private final int warranty;

    Computer(String manufacturer, String model, int price, int warranty) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.warranty = warranty;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getWarranty() {
        return warranty;
    }
}
