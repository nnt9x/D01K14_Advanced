package b8.b2;

public class Newspaper implements Document {
    private String number;
    private String title;
    private String publishedDate;

    public Newspaper() {
    }

    public Newspaper(String number, String title, String publishedDate) {
        this.number = number;
        this.title = title;
        this.publishedDate = publishedDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "number='" + number + '\'' +
                ", title='" + title + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                '}';
    }
}
