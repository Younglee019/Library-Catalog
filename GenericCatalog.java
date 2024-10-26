import java.util.HashMap;
import java.util.Map;

public class GenericCatalog<T> {
    private Map<String, LibraryItem<T>> catalog = new HashMap<>();

    public void addItem(LibraryItem<T> item) {
        catalog.put(item.getItemID(), item);
    }

    public void removeItem(String itemID) {
        if (catalog.containsKey(itemID)) {
            catalog.remove(itemID);
        } else {
            System.out.println("Error: Item with ID " + itemID + " does not exist.");
        }
    }

    public LibraryItem<T> getItem(String itemID) {
        return catalog.get(itemID);
    }

    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("The catalog is empty.");
        } else {
            for (LibraryItem<T> item : catalog.values()) {
                System.out.println(item);
            }
        }
    }
}
