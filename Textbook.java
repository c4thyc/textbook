public class Textbook extends Book {
    private int edition;

    public Textbook(String bookTitle, double price, int edition) {
        super(bookTitle, price);
        this.edition = edition;
    }

    public boolean canSubstituteFor(Textbook a) {
        if (a.getTitle().equals(getTitle()) && getEdition() >= a.getEdition()) {
            return true;
        }
        return false;
    }

    public int getEdition() {
        return edition;
    }
}