public class Book {
    String bookTitle = "";
    String bookAuthor = "";

    public Book() {

    }

    //things that characters need. Aside from a tragic backstory, that idea was denied. 
    //constructor signature.
    public Book(String newBookTitle) {
        //this.globalvariable = localvariable <- within the signature
        this.bookTitle = newBookTitle;
    }

    public Book(String newBookTitle, String newAuthorName) {
        //this.globalvariable = localvariable
        this.bookTitle = newBookTitle;
        this.bookAuthor = newAuthorName;
    }

    //getters and setters
    public void reBookAuthor(String newAuthorName) {
        this.bookAuthor = newAuthorName;
    }
    public String getBookAuthor() {
        return this.bookAuthor;
    }
    public void reBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }

    @Override
    public String toString() {
        String out = "";
        out += "Book: " + this.bookTitle;
        if(this.bookAuthor==null){
            out += "\nAuthor : " + "no author? not legible.";
        } else {
            out += "\nAuthor: " + this.bookAuthor;
        }
        out += "\n";


        return out;
    }
}
