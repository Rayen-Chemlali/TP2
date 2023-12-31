package Ex3.p1;

public class Teacher {

    LibraryCard libraryCard;
    public Teacher(LibraryCard libraryCard)
    {
        this.libraryCard=libraryCard;
    }
    public void borrowBook(Book book,Library library)
    {
        library.removeBook(book);
        System.out.println("The teacher "+libraryCard.getNom() + " " + libraryCard.getPrenom()+" borrowed the book "+book.getTitle());
    }

    public void returnBook(Book book, Library library)
    {
        System.out.println("The teacher "+libraryCard.getNom() + " " + libraryCard.getPrenom()+" returned the book "+book.getTitle());
        library.addBook(book);

    }
}
