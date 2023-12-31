package Ex3.p1;

public class Main {
    public static void main(String[] args) {
        Book novelBook = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        Book textbookBook = new TextBook("Introduction to Algorithms", "Thomas H. Cormen", 1990, "Computer Science");

        // Create library and add books
        Library library = new Library();
        library.addBook(novelBook);
        library.addBook(textbookBook);

        library.listBooks();

        LibraryCard studentCard = new LibraryCard(12345 ,"Chemlali","Rayen");
        LibraryCard teacherCard = new LibraryCard(67890,"Besbes","Ines");

        Student student = new Student(studentCard);
        Teacher teacher = new Teacher(teacherCard);

        student.borrowBook(novelBook,library);
        teacher.borrowBook(textbookBook,library);

        student.returnBook(novelBook,library);
        teacher.returnBook(textbookBook,library);

    }
}