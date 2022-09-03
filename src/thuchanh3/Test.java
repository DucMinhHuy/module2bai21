package thuchanh3;

public class Test {
    public static void main(String[] args) {
        System.out.println("begin");
        BookBorrower book1=new BookBorrower();
        BookBorrower book2=new BookBorrower();
        book1.borrowBook();
        System.out.println("Book1 asked to borrow the book");
        System.out.println("book1 Author and Title:");
        System.out.println(book1.getAuthorAndTitle());

        book2.borrowBook();
        System.out.println("Book2 asked  to borrow the book");
        System.out.println("Book2 Author and title");
        System.out.println(book2.getAuthorAndTitle());

        book1.borrowBook();
        System.out.println("book1 return the book");

        book2.borrowBook();
        System.out.println("book2 Author and Title");
        System.out.println(book1.getAuthorAndTitle());
        System.out.println("END TESTING SINGLETON PATTERN");
    }
}
