public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            library.listBooks();
        }
        catch (EmptyLibraryException e) {
            System.out.println(e.getMessage());
        }

        Book book1 = null;
        Book book2 = null;
        Book book3 = null;
        Book book4 = null;

        try {
            book1 = new Book("Java Programming", 300);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            book2 = new Book("Design Patterns", -3);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            book3 = new Book(null, 100);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            book4 = new Book("", 400);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            if(book1 != null) {
                library.addBook(book1);
            }
            if(book2 != null) {
                library.addBook(book2);
            }
            if(book3 != null) {
                library.addBook(book3);
            }
            if(book4 != null) {
                library.addBook(book4);
            }
        }
        catch (InvalidBookException e) {
            System.out.println(e.getMessage());
        }

        try {
            library.listBooks();
        }
        catch (EmptyLibraryException e) {
            System.out.println(e.getMessage());
        }

        try {
            library.borrowBook("Java Programming");
        }
        catch (BookNotFoundException | EmptyLibraryException e) {
            System.out.println(e.getMessage());
        }

        try {
            library.returnBook("Clean Code");
        }
        catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            library.returnBook("Java Programming");
        }
        catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}