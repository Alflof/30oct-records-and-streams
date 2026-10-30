package se.iths.alfred.model;

public record Mouse(String title, int dpi) {

    @Override
    public String toString() {
        return "Mouse{" +
                "title='" + title + '\'' +
                ", dpi=" + dpi +
                '}';
    }
}
