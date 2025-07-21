public class Book {
    String title;
    String author;
    int pages;
    
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "John Doe", 250);
        book1.displayDetails();
    }
}