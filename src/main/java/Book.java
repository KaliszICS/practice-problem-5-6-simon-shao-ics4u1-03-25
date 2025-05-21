public class Book{

    private String author;
    private String ISBN;
    private String title;

    public Book(String title, String author, String ISBN){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

//get

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;

    }

    public String getISBN(){
        return this.ISBN;
    }
    
}