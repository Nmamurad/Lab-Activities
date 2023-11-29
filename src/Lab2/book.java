package Lab2;

public class book {
    private String Bookname;
    private int ISBNno;
    private String Authorname;
    private String Publisher;

    public String getAuthorname() {
        return Authorname;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public int getISBNno() {
        return ISBNno;
    }

    public void setISBNno(int ISBNno) {
        this.ISBNno = ISBNno;
    }

    public void setAuthorname(String authorname) {
        Authorname = authorname;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public book(String Bookname, int ISBNno, String Authorname, String Publisher){
        this.Bookname=Bookname;
        this.ISBNno=ISBNno;
        this.Authorname=Authorname;
        this.Publisher=Publisher;
    }
    public void DisplayBookinfo(){
        System.out.println("BookName                 ISBN           AuthorName           PublisherName\n" +
                           "---------                -----          -----------          --------------\n" +
                            getBookname()+"       "+getISBNno()+"             "+getAuthorname()+"               "+getPublisher());
    }

}
