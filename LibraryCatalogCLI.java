import java.util.Scanner;

public class LibraryCatalogCLI {
    public static void main(String[] args) {
        GenericCatalog<String> catalog = new GenericCatalog<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Library Catalog Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Catalog");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter item ID: ");
                    String itemID = scanner.nextLine();
                    System.out.print("Enter additional info (e.g., genre for books): ");
                    String additionalInfo = scanner.nextLine();

                    LibraryItem<String> newItem = new LibraryItem<>(title, author, itemID, additionalInfo);
                    catalog.addItem(newItem);
                    System.out.println("Item added.");
                    break;

                case 2:
                    System.out.print("Enter item ID to remove: ");
                    String removeID = scanner.nextLine();
                    catalog.removeItem(removeID);
                    break;

                case 3:
                    System.out.println("Current Catalog:");
                    catalog.displayCatalog();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
