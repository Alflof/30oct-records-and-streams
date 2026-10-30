package se.iths.alfred.model;

public record Webcam(String title, int megapixels) {
    @Override
    public String toString() {
        return "Webcam{" +
                "title='" + title + '\'' +
                ", megapixels=" + megapixels +
                '}';
    }
}
