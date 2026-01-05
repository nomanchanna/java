import librarymanager.LibraryManager;

public class Main{
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        manager.addBook("Java Programming", "James", 1);
        manager.addBook("Python Basics", "Guido", 2);
        manager.addBook("C#", "Nauman Channa", 3);

        manager.addUser("Ali", 101);
        manager.addUser("Sara", 102);
        manager.addUser("John", 103);
        manager.issueBook(1, 101);
        manager.issueBook(2, 102);
        manager.issueBook(3, 103);
        manager.printReport();
        manager.returnBook(104);
    }
}
