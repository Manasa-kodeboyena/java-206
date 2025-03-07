class Book{
 private String author;
 private String title; 
 private int year;
  
public Book(String author,String title,int year){
 this.author=author;
 this.title=title; 
this.year=year; 
}

 public void author() {
 System.out.println("The author of the book is"+author); 
} 
public void title() { 
System.out.println("the title of the book is"+title);
 } 
public void year() {
 System.out.println("the year of publication of a book is"+year);
 }
 public static void main(String[] args){
Book Book1 =new Book("George Orwell","Animal Farm",1945);
Book Book2 =new Book("Jane Austen","Pride And Prejudice",1813); 
Book Book3 =new Book("Lewis Carroll","Alice’s Adventures In Wonderland",1865);
 Book1.author();
 Book1.title(); 
 Book1.year();

Book2.author(); 
Book2.title()
Book2.year();

Book3.author(); 
Book3.title(); 
Book3.year();
}
}