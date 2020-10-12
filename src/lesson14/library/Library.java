package lesson14.library;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library implements Runnable {
    private List<Book> allBooks;
    private List<Book> booksAvailableForReading;
    private List<Book> booksCanBeRemovedFromTheLibrary;
    private List<Customer> allCustomers;

    public Library() {
        this.allBooks = new ArrayList<>();
        this.booksAvailableForReading = new ArrayList<>();
        this.booksCanBeRemovedFromTheLibrary = new ArrayList<>();
        this.allCustomers = new ArrayList<>();
    }

    public List<Book> createBook(List<List<String>> listOfBook) {
        List<Book> books = new ArrayList<>();
        for (List<String> dataOfBook : listOfBook) {
            Book book = new Book(dataOfBook.get(0), dataOfBook.get(1), dataOfBook.get(2),
                    Integer.valueOf(dataOfBook.get(3)), dataOfBook.get(4), Boolean.valueOf(dataOfBook.get(5)),
                    Boolean.valueOf(dataOfBook.get(6)), Integer.valueOf(dataOfBook.get(7)));
            books.add(book);
        }
        return books;
    }

    public List<Customer> createCustomer(List<List<String>> listOfCustomers) {
        List<Customer> customers = new ArrayList<>();
        for (List<String> dataOfCustomer : listOfCustomers) {
            Customer customer = new Customer(dataOfCustomer.get(0));
            customers.add(customer);
        }
        return customers;
    }

    public List<List<String>> readFromXML(String path) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(path);
            Node root = document.getDocumentElement();
            NodeList elements = root.getChildNodes();
            List<List<String>> allElements = new ArrayList<>();
            for (int i = 0; i < elements.getLength(); i++) {
                Node element = elements.item(i);
                if (element.getNodeType() != Node.TEXT_NODE) {
                    NodeList elementProps = element.getChildNodes();
                    List<String> dataOfElement = new ArrayList<>();
                    for (int j = 0; j < elementProps.getLength(); j++) {
                        Node elementProp = elementProps.item(j);
                        if (elementProp.getNodeType() != Node.TEXT_NODE) {
                            dataOfElement.add(elementProp.getChildNodes().item(0).getTextContent());
                        }
                    }
                    allElements.add(dataOfElement);
                }
            }
            return allElements;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public void createListOfCustomers() {
        List<List<String>> objects = readFromXML("src\\lesson14\\library\\customers.xml");
        allCustomers.addAll(createCustomer(objects));
    }

    public void createLibrary() {
        List<List<String>> objects = readFromXML("src\\lesson14\\library\\books.xml");
        allBooks.addAll(createBook(objects));
        createListBooksAvailableForReading();
        createListBooksCanBeRemovedFromTheLibrary();
    }

    public void createListBooksAvailableForReading() {
        for (Book book : allBooks) {
            if (book.getAvailableForReading()) {
                for (int i = 0; i < book.getAmount(); i++) {
                    booksAvailableForReading.add(book);
                }
            }
        }
    }

    public void createListBooksCanBeRemovedFromTheLibrary() {
        for (Book book : allBooks) {
            if (book.getOutLibrary()) {
                booksCanBeRemovedFromTheLibrary.add(book);
            }
        }
    }

    public void printCustomers(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i + ". " + customers.get(i).getName());
        }
    }

    public void printBooks(List<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + ". " + books.get(i).getName() + ", " + books.get(i).getAuthor() + ", " +
                    books.get(i).getGenre() + ", " + books.get(i).getYear() + ", " + books.get(i).getCover());
        }
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(List<Book> allBooks) {
        this.allBooks = allBooks;
    }

    public List<Book> getBooksAvailableForReading() {
        return booksAvailableForReading;
    }

    public void setBooksAvailableForReading(List<Book> booksAvailableForReading) {
        this.booksAvailableForReading = booksAvailableForReading;
    }

    public List<Book> getBooksCanBeRemovedFromTheLibrary() {
        return booksCanBeRemovedFromTheLibrary;
    }

    public void setBooksCanBeRemovedFromTheLibrary(List<Book> booksCanBeRemovedFromTheLibrary) {
        this.booksCanBeRemovedFromTheLibrary = booksCanBeRemovedFromTheLibrary;
    }

    public List<Customer> getAllCustomers() {
        return allCustomers;
    }

    public void setAllCustomers(List<Customer> allCustomers) {
        this.allCustomers = allCustomers;
    }

    public void takeBookOutLibraryOrNot(Customer customer, Book book) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to take it out library or to the reading room? (0 - out library, 1 - to the reading room) ");
        int choice = sc.nextInt(); // 0 - out library, 1 - to the reading room
        if (choice == 0) {
            System.out.println(customer.getName() + " chose to take it out library");
            System.out.println("The system checks to see if it can be done...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (getBooksCanBeRemovedFromTheLibrary().contains(book)) {
                System.out.println("You can take this book");
                System.out.println("Good reading!");
                getBooksAvailableForReading().remove(book);
            } else {
                System.out.println("Unfortunately, you can’t take this book");
            }
        } else {
            System.out.println(customer.getName() + " chose to take it to the reading room");
            System.out.println("Good reading!");
            getBooksAvailableForReading().remove(book);
        }
    }

    public synchronized void searchAllCustomers() {
        System.out.println("Searching for all available customers...");
        createListOfCustomers();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printCustomers(getAllCustomers());
    }

    public synchronized void searchAllBooks() {
        System.out.println("Searching for all available books...");
        createLibrary();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printBooks(getBooksAvailableForReading());
    }

    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            searchAllCustomers();
            searchAllBooks();
            if (!allCustomers.isEmpty()) {
                for (Customer customer : allCustomers) {
                    if (!getBooksAvailableForReading().isEmpty()) {
                        System.out.println(customer.getName() + " is being served");
                        System.out.print("How many books do you need? ");
                        int numberOfBooks = sc.nextInt();
                        if (numberOfBooks != 0) {
                            System.out.println("The number of books is calculated...");
                            Thread.sleep(2000);
                            if (numberOfBooks <= getBooksAvailableForReading().size() && numberOfBooks > 0) {
                                for (int i = 0; i < numberOfBooks; i++) {
                                    printBooks(getBooksAvailableForReading());
                                    System.out.print("Choose book: ");
                                    Book book = getBooksAvailableForReading().get(sc.nextInt());
                                    System.out.println(customer.getName() + " chose " + book.toString());
                                    takeBookOutLibraryOrNot(customer, book);
                                }
                            }
                            if (numberOfBooks > getBooksAvailableForReading().size()) {
                                System.out.println("You can’t take so many books, because only " + getBooksAvailableForReading().size() + " books are available in the library");
                            }
                        } else {
                            System.out.println("Hm, okay...");
                        }
                        System.out.println(customer.getName() + " is no longer served");
                    } else {
                        System.out.println("There are no available books in the library");
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
