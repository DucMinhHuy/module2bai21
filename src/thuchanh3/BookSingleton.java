package thuchanh3;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private  static boolean isLoaneOut;

    private BookSingleton() {
        author="Gamma, helm,johnson,and,Vlisside";
        title="Design,Patterns";
        book=null;
        isLoaneOut=false;
    }
    public static BookSingleton borrowBook(){
        if(!isLoaneOut){
            if(book==null){
                book=new BookSingleton();
            }
            isLoaneOut=true;
            return book;
        }
        return null;
    }
    public void returnBook(BookSingleton book){
        isLoaneOut=false;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return author;
    }
    public String getAuthorAndTitle(){
        return getTitle()+"by"+getAuthor();
    }
}
