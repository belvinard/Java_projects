// Step 1: Base Class LibraryItem (Encapsulation)
public class LibraryItem {
    private String title;
    private String authorDirector;
    private int publicationYear;
    private boolean isCheckedOut;

    public LibraryItem(String title, String authorDirector, int publicationYear){
        this.title = title;
        this.authorDirector = authorDirector;
        this.publicationYear = publicationYear;

    }

    // Encapsulation : Getters and Setters
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public  String getAuthorDirector(){
        return authorDirector;
    }

    public void setPublicationYear(String authorDirector){
        this.authorDirector = authorDirector;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public void checkOut(){
        this.isCheckedOut = true;
        System.out.println("Item checked out : " + this.title);
    }

    public void returnItem(){
        this.isCheckedOut = false;
        System.out.println("Item returned : " + this.title);
    }

    // Step 3 : Polymorphism method to checkout any item
    public void checkoutItem(){
        if(!isCheckedOut){
            checkOut();
        }else{
            System.out.println("Item already checked out : " + this.title);
        }

    }

    // This method can be overridden for specific item details
    public void displayInfo(){
        System.out.println("Title: " + this.title + ", Author/Director : " + this.authorDirector + ", Year : " + this.publicationYear);

    }

}

// Step 2 : Subclass for Book
class  Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int publicationYear, String genre){
        super(title, author,publicationYear);
        this.genre = genre;
    }

    public  String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Genre : " + this.genre);
    }
}

// Step 2 : Subclass for Magazine
class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber){
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    public  int getIssueNumber(){
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber){
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Issue Number : " + this.issueNumber);
    }

}

// Step 2 : Subclass for DVD
class DVD extends LibraryItem{
    private int duration; // in minutes

    public DVD(String title, String director, int publicationYear, int duration){
        super(title, director, publicationYear);
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Duration : " + this.duration + " minutes");
    }

}
