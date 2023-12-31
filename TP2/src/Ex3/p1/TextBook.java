package Ex3.p1;

public class TextBook extends Book{
    String subject;
    public TextBook(String title, String author, int yearOfPublication,String subject)
    {
        super(title,author, yearOfPublication);
        this.subject=subject;
    }

    public String getFeatures() {
        return subject;
    }

    public void setFeatures(String subject) {
        this.subject = subject;
    }

    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("Subject: "+subject);


    }
}
