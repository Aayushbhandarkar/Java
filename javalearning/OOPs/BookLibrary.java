

public class BookLibrary {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;

    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;
    }

    BookLibrary(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    BookLibrary(String isbn) {
        this("unknown", "Unknown", isbn);
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already Borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, please leave a review for the book and the author");
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        BookLibrary designThings = new BookLibrary("Author", "Design", "1");
        BookLibrary myBook = new BookLibrary("2");
        System.out.println(BookLibrary.getTotalNoOfBooks());
        designThings.borrowBook();
        myBook.borrowBook();
        designThings.borrowBook();
        designThings.returnBook();
         designThings.returnBook();
    }
}
