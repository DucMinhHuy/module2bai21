package thuchanh3;

public class BookBorrower {
    private BookSingleton borrowerBook;
    private boolean haveBook=false;
    public void borrowBook(){
        borrowerBook = BookSingleton.borrowBook();
        haveBook=borrowerBook!=null;
    }
    public String getAuthorAndTitle(){
        if(haveBook){
            return borrowerBook.getAuthorAndTitle();
        }
        return "i don't have  the book";
    }
    public void returnBook(){
         borrowerBook.returnBook(borrowerBook);
    }
}
