import java.util.ArrayList;
import java.util.List;

public class Library
{
    private List<Book> books;

    public Library() 
    {
        books = new ArrayList<>();
    }

    public void addBook(Book book) 
    {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void issueBook(int id) 
    {
        for (Book book : books) {
            if (book.getId() == id && !book.isIssued()) 
            {
                book.issueBook();
                System.out.println("Book issued: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found or already issued.");
    }

    public void returnBook(int id)
    {
        for (Book book : books) 
        {
            if (book.getId() == id && book.isIssued())
            {
                book.returnBook();
                System.out.println("Book returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }

    public void displayBooks()
    {
        for (Book book : books)
        {
            System.out.println(book);
        }
    }
}
