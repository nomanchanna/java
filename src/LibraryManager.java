import java.util.ArrayList;
public class LibraryManager {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    public void addBook(String title, String author, int id) {
        Book b = new Book();
        b.id = id;
        b.title = title;
        b.author = author;
        b.isIssued = false;
        books.add(b);
    }
    public void addUser(String name, int userId) {
        User u = new User();
        u.userId = userId;
        u.name = name;
        users.add(u);
    }
    public void issueBook(int bookId, int userId) {
        for (Book b : books) {
            if (b.id == bookId && b.isIssued == false) {
                for (User u : users) {
                    if (u.userId == userId) {
                        b.isIssued = true;
                        System.out.println("Book issued to user");
                        return;
                    }
                }
                            }
        }
        System.out.println("Issue failed");
    }
    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.id == bookId && b.isIssued == true) {
                b.isIssued = false;
                System.out.println("Book returned");
                return;
            }
        }
        System.out.println("Return failed");
    }
    public void printReport() {
        System.out.println("------ LIBRARY REPORT ------");
        for (Book b : books) {
            if (b.isIssued) {
                System.out.println("Issued Book: " + b.title);
            } else {
                System.out.println("Available Book: " + b.title);
            }
        }
        for (User u : users) {
            System.out.println("User: " + u.name + " ID: " + u.userId);
        }
        System.out.println("------ END REPORT ------");
    }
}


