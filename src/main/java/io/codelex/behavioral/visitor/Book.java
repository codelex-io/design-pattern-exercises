package io.codelex.behavioral.visitor;

class Book implements Visitable {
    private final String title;
    private final String isbn;
    private final int price;

    Book(String title, String isbn, int price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPrice() {
        return price;
    }
}
