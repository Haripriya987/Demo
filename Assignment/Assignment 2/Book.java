import java.util.Scanner;
public class Book {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the details of book id pages price");
        int bId=in.nextInt();
        int pages=in.nextInt();
        int price=in.nextInt();
        BookDemo b=new BookDemo(bId,pages,price);
        System.out.println("Enter the details of second book id pages price");
        int bId2=in.nextInt();
        int pages2=in.nextInt();
        int price2=in.nextInt();

        BookDemo b2=new BookDemo(bId2,pages2,price2);
        if(b.getPrice()>b2.getPrice()) {
            System.out.println(b.getDetails());
        }
        else
            System.out.println(b2.getDetails());
in.close();
    }
}
class BookDemo{
    private int bookId;
    private  int pages;
    private int price;

    public BookDemo() {
        System.out.println("Use with parametrised constructor to initialize values ");
    }

    public BookDemo(int bookId, int pages, int price) {
        if(bookId>0 && pages>0  && price>0) {
            this.bookId = bookId;
            this.pages = pages;
            this.price = price;
        }
        else
            System.out.println("Don't enter Negative Values ");
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getDetails(){
        return "Book Id is : "+getBookId()+"\n"+"Pages : "+getPages()+"\n"+"Price : "+ getPrice();
    }
}