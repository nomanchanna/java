package librarymanager;
import java.util.ArrayList;
import java.util.logging.Logger;
import book.Book;
import user.User1;
public class LibraryManager {
     private static final Logger logger = Logger.getLogger(LibraryManager.class.getName());

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User1> users = new ArrayList<>();
    public void addBook(String title, String author, int id) {
        Book b = new Book();
        b.setId(id);
        b.getId();
        b.getAuthor();
        b.setAuthor(author);
        b.getTitle();
        b.setTitle(title);
        b.setIssued(false); 
        b.isIssued1();
        books.add(b);
    }
    public void addUser(String name, int userId) {
        User1 u  = new User1();
        u.setName(name);
        u.setUserId(userId);
        u.getUserId();
        u.getName();
        users.add(u);
    }
    public void issueBook(int bookId, int userId) {
        for (Book b : books) {
            if (b.getId() == bookId && !b.isIssued1()) {
                for (User1 u : users) {
                    if (u.getUserId() == userId) {
                        b.setIssued(true);
                        logger.info("Book issued to user");
                        return;
                    }
                }
                            }
        }
        logger.info("Issue failed");
    }
    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId && b.isIssued1()) {
                b.setIssued(false); 

                logger.info("Book returned");
                return;
            }
        }
       logger.info("Return failed");
    }
    public void printReport() {
        logger.info("------ LIBRARY REPORT ------");
        for (Book b : books) {
            if (b.isIssued1()) {
               logger.info(()->"Issued Book: " + b.getTitle());
            } else {
                logger.info(()->"Available Book: " + b.getTitle());
            }
        }
        for (User1 u : users) {
            logger.info(() -> "User: " + u.getName() + " ID: " + u.getUserId());
        }
        logger.info("------ END REPORT ------");
    }
}


