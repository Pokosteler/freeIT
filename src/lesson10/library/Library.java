package lesson10.library;

import java.util.*;

public class Library {
    private List<Book> bookList = new ArrayList();
    Comparator<Book> compareByTitle = (book1, book2) -> book1.getTitle().compareTo(book2.getTitle());
    Comparator<Book> compareByDate = (book1, book2) -> -book1.getId().compareTo(book2.getId());

    public Library() {
    }

    public List<Book> getBookList() {
        return this.bookList;
    }

    public String stringBookList() {
        String str = "";
        Book book;
        for (Iterator var2 = this.getBookList().iterator();
             var2.hasNext(); str = str + "Title \"" + book.getTitle() + "\", genre \"" + book.getGenre() + "\"\n") {
            book = (Book) var2.next();
        }

        return str;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book) {
        if (!this.getBookList().contains(book.getId())) {
            this.bookList.add(book);
        } else {
            System.out.println("The book is already on the list!");
        }

    }

    public void deleteBook(Integer id) {
        this.bookList.removeIf((book) -> Objects.equals(id, book.getId()));
    }

    public Book get(Integer id) {
        Iterator var2 = this.bookList.iterator();
        Book book;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            book = (Book) var2.next();
        } while (!id.equals(book.getId()));

        return book;
    }

    public void editBook(Book book) {
        Book oldBook = this.get(book.getId());
        if (oldBook != null) {
            oldBook.setTitle(book.getTitle());
            oldBook.setGenre(book.getGenre());
        }

    }

    public void sortByTitle() {
        this.getBookList().sort(this.compareByTitle);
    }

    public void sortByDate() {
        Collections.sort(this.getBookList(), this.compareByDate);
    }
}