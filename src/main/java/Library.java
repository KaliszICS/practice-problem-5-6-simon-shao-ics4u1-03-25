public class Library{

    private Book[] books;

    public Library(){
        this.books = new Book[0];
    }

    public void addBook(Book book){
        Book[] tempBooks = this.books;
        this.books = new Book[tempBooks.length+1];
        this.books = tempBooks;
        this.books[tempBooks.length] = book;
    }

    public void removeBook(String isbn){
        int index = -1;
        for (int i = 0; i<this.books.length; i++){
            if(books[i].getISBN().equals(isbn)){
                index = i;
            }
        }

        if (index == -1){
            return;
        }

        Book[] tempBooks = new Book[this.books.length-1];
        for (int i = 0; i<index; i++){
            tempBooks[i] = this.books[i];
        }

        for (int i = index; i<tempBooks.length;i++){
            tempBooks[index] = this.books[index+1];
        }

        this.books = new Book[tempBooks.length];
        this.books = tempBooks;
    }

    public Book[] searchBook(String title){
        int numsFound = 0;
        int[] indexs = new int[0];
        int[] tempIndexs = new int[0];
        for (int i = 0; i<this.books.length; i++){
            if (this.books[i].getTitle().equals(title)){
                numsFound++;
                tempIndexs = new int[indexs.length+1];
                tempIndexs = indexs;
                indexs = new int[tempIndexs.length];
                indexs = tempIndexs;
            }
        }

        Book[] found = new Book[numsFound];
        for (int i = 0; i<indexs.length;i++){
            found[i] = this.books[indexs[i]];
        }

        return found;
    }

    public Book[] displayBooks(){
        return this.books;
    }

}