public class Book {
    private String title;
    private String author;
    private boolean onLoan;

    public Book(String title, String author, boolean onLoan) {
        this.title = title;
        this.author = author;
        this.onLoan = onLoan;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }
    public boolean isOnLoan() {
        return onLoan;
    }

    @Override
    public String toString(){
        String statusOfBook;
        if(isOnLoan()){
            statusOfBook = "On Loan";
        } else {
            statusOfBook = "Available";
        }
        return title + "' by " + author + ": " + statusOfBook;
    }



}
