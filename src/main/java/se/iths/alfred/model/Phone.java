package se.iths.alfred.model;

public record Phone(String title, double price) {

    @Override
    public String toString() {
        return "Phone{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
