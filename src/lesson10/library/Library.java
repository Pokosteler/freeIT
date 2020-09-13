package lesson10.library;

import java.util.*;

public class Library {
    private List<Book> bookList = new LinkedList<>();
    Comparator<Book> compareByTitle = (book1, book2) -> book1.getTitle().compareTo(book2.getTitle());
    Comparator<Book> compareById = (book1, book2) -> -book1.getId().compareTo(book2.getId());

    public Library() {
    }

    public List<Book> getBookList() {
        return this.bookList;
    }

    public String stringBookList() {
        String listOfBooks = "";
        Book book;
        for (Iterator iterator = this.getBookList().iterator();
             iterator.hasNext(); listOfBooks = listOfBooks + "Title \"" + book.getTitle() + "\", genre \"" + book.getGenre() + "\"\n") {
            book = (Book) iterator.next();
        }

        return listOfBooks;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book) {
        if (!this.getBookList().contains(book)) {
            this.bookList.add(book);
        } else {
            System.out.println("The book is already on the list!");
        }

    }

    public void deleteBook(Integer id) {
        this.bookList.removeIf((book) -> Objects.equals(id, book.getId()));
    }

    public Book get(Integer id) {
        for (Book book : this.bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void editBook(Book book) {
        Scanner sc = new Scanner(System.in);
        Book oldBook = this.get(book.getId());
        if (oldBook != null) {
            System.out.print("Edit title of \"" + book.getTitle() + "\": ");
            oldBook.setTitle(sc.nextLine());
            System.out.print("Edit genre of \"" + book.getTitle() + "\": ");
            oldBook.setGenre(sc.nextLine());
        }
    }

    public void sortByTitle() {
        this.getBookList().sort(this.compareByTitle);
    }

    public void sortById() {
        this.getBookList().sort(this.compareById);
    }
}