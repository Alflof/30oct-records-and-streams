package se.iths.alfred.model;


public record Headset(String title, double price) {

    @Override
    public String toString() {
        return "Headset{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}