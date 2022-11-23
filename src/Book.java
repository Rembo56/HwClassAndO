public class Book{
   private static String title;
   private static int year;
   private Author author;
   public Book(Author author){
       this.author=author;
   }
    //String name=Author.name;
   // String surName=Author.surName;

    public Book(String title,int year,Author author){
        this.title=title;
        this.year=year;
        this.author=author;
    }

    public String getTitle(){
        return this.title;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public Author getAuthor(){
       return this.author;
    }
}
