//18
public class Book {
	String Bookname;
	String ISBNnumber;
	String Authorname;
	String Publisher;
	public Book() {
		Bookname="NULL";
		ISBNnumber="NULL";
		Authorname="NULL";
		Publisher="NULL";
		
	}
	public Book(String bkname,String isbn,String authorname,String publisher) {
		Bookname=bkname;
		ISBNnumber=isbn;
		Authorname=authorname;
		Publisher=publisher;
	}
	public void setBookName(int bkname ) {
		this.Bookname=Bookname;
	}
	public String getBookName() {
		return Bookname;
	}
	public void setISBNnumber (int isbn) {
		this.ISBNnumber=ISBNnumber;
	}
	public String ISBNnumber() {
		return ISBNnumber;
	}
	public void setAuthorname(int authorname) {
		this.Authorname=Authorname;
	}
	public void setPublisher(int publisher) {
		this.Publisher=Publisher;
	}
	public String setPublisher() {
		return Publisher;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void getBookInfo() {
		System.out.println("The information of the Book : \nName of the Book: "+Bookname+"\nISBN number of the Book :" +ISBNnumber+"\nAuthor nameof the book: " +Authorname+"\npublisher of the book:"+Publisher);
	}

}
