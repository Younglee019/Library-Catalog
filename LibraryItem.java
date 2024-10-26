public class LibraryItem<T> {
    private String title;
    private String author;
    private String itemID;
    private T additionalInfo;

    public LibraryItem(String title, String author, String itemID, T additionalInfo) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
        this.additionalInfo = additionalInfo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getItemID() {
        return itemID;
    }

    public T getAdditionalInfo() {
        return additionalInfo;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", itemID='" + itemID + '\'' +
                ", additionalInfo=" + additionalInfo +
                '}';
    }
}
