package lesson10.library;

public class Book {
    private Integer id;
    private String title;
    private String genre;

    public Book(Integer id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}