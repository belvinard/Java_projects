// Step 4: Main Class to test the system//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating instances of different types of library items
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel");
        Magazine magazine1 = new Magazine("National Geographic", "Multiple Authors", 2021, 50);
        DVD dvd1 = new DVD("Inception", "Christopher Nolan", 2010, 148);

        // Using polymorphism to handle items uniformly
        LibraryItem[] items = {book1, magazine1, dvd1};

        // Display info of all items
        for (LibraryItem item : items){
            item.displayInfo();
            System.out.println();
        }

        // checking out items using polymorphism
        for(LibraryItem item : items){
            item.checkoutItem();
        }

        // Returning items
        for(LibraryItem item : items){
            item.returnItem();
        }
    }
}