package Ex3.p1;

public class LibraryCard {
    private int cardNumber;
    private String Nom;
    private String Prenom;

    public LibraryCard(int cardNumber,String Nom, String Prenom) {
        this.cardNumber = cardNumber;
        this.Nom=Nom;
        this.Prenom=Prenom;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getNom() {
        return Nom;
    }
}
