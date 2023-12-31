package Ex3.p1;

public class Novel extends Book{
    String story;
    public Novel(String title, String author, int yearOfPublication,String story)
    {
        super(title, author, yearOfPublication);
        this.story=story;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public void displayBookInfo() {
           super.displayBookInfo();
           System.out.println("Story : "+story);
    }
}
