package Ex3.p1;

public class Student implements LibraryUser{

     LibraryCard libraryCard;
     public Student(LibraryCard libraryCard)
     {
         this.libraryCard=libraryCard;
     }
    public void borrowBook(Book book,Library library)
    {
        library.removeBook(book);
        System.out.println("The student "+libraryCard.getNom() + " " + libraryCard.getPrenom()+" borrowed the book "+book.getTitle());
    }

    public void returnBook(Book book, Library library)
    {
        System.out.println("The student "+libraryCard.getNom() + " " + libraryCard.getPrenom()+" returned the book "+book.getTitle());
        library.addBook(book);

    }
}
