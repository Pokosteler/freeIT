package lesson14.library;

public class Book {
    @Override
    public String toString() {
        return name + ", " + author + ", " + genre + ", " + year + ", " + cover;
    }

    private String name;
    private String author;
    private String genre;
    private Integer year;
    private String cover;
    private Boolean availableForReading;
    private Boolean outLibrary;
    private Integer amount;

    public Book() {
    }

    public Book(String name, String author, String genre, Integer year, String cover, Boolean availableForReading,
                Boolean outLibrary, Integer amount) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.cover = cover;
        this.availableForReading = availableForReading;
        this.outLibrary = outLibrary;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Boolean getOutLibrary() {
        return outLibrary;
    }

    public void setOutLibrary(Boolean outLibrary) {
        this.outLibrary = outLibrary;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getAvailableForReading() {
        return availableForReading;
    }

    public void setAvailableForReading(Boolean availableForReading) {
        this.availableForReading = availableForReading;
    }
}
