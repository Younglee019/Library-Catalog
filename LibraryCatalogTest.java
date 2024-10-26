public class LibraryCatalogTest {
    public static void main(String[] args) {
        GenericCatalog<String> catalog = new GenericCatalog<>();

        // Create library items
        LibraryItem<String> book = new LibraryItem<>("Effective Java", "Joshua Bloch", "001", "Programming");
        LibraryItem<String> dvd = new LibraryItem<>("Inception", "Christopher Nolan", "002", "Sci-Fi");
        
        // Add items
        catalog.addItem(book);
        catalog.addItem(dvd);

        // Display catalog
        System.out.println("Initial Catalog:");
        catalog.displayCatalog();

        // Remove an item
        catalog.removeItem("001");
        System.out.println("After removing item with ID 001:");
        catalog.displayCatalog();

        // Try to remove a non-existent item
        catalog.removeItem("999");
    }
}
