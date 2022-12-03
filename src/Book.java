public class Book{
   private String title;
   private int year;
   private Author author;
    // public Book(Author author){
       //this.author=author;
  // }
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

    public String toString() {
        return "Название: "+this.title+", год: " +this.year+"\n"+this.author.printFullName();
    }


    public String printFullDescription(){
        return "Название: "+this.title+", год: " +this.year;
    }



    @Override
    public boolean equals(Object other) {
        if (this==other){
            return true;
        }
        if(other==null||getClass()!=other.getClass()){
            return false;
        }
        Book book=(Book) other;
        return this.year==year&&this.title==title&& this.author.getName() == author.getName()&&this.author.getSurName() == author.getSurName();
        /*if (this==other){
            return true;
        }
        if(other==null||getClass()!=other.getClass()){
            return false;
        }
        Book book=(Book) other;
        if (getTitle()!=book.getTitle()){
            return false;
        }
        if (getYear()!=book.getYear()){
            return false;
        }
        return printFullDescription()!=null
                ? printFullDescription().equals(book.printFullDescription())
                : book.printFullDescription()==null;*/

    }

    @Override
    public int hashCode(){
        int result=title==null ?0: title.hashCode();
        result=result+year;
        return result;
    }

}
