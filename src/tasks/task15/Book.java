package tasks.task15;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public String getTitle(){return this.title;}
    public String getAuthor(){return this.author;}
    public int getPrice(){return this.price;}
    public int getIsbn(){return this.isbn;}
    public int getEdition(){return edition;}
    public void setTitle(String title){this.title = title;}
    public void setAuthor(String author){this.author = author;}
    public void setPrice(int price){this.price = price;}

    public Book(String author, int isbn){
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString(){
        return String.format("Book title: %s; author: %s; price: %d; edition: %d.", title, author, price, edition);
    }

    @Override
    public boolean equals(Object object) throws NullPointerException{
        if(object != null && object.getClass() == this.getClass()){
            return (((Book) object).getAuthor().equals(this.author) && ((Book) object).getIsbn() == this.getIsbn());
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() throws NullPointerException{
        int resultHash = title == null? 1:  title.hashCode() * 2;
        resultHash += author == null? 2 : author.hashCode();
        resultHash += price + edition;
        return resultHash;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public int compareTo(Book book){
        return this.isbn - book.isbn;
    }

}
