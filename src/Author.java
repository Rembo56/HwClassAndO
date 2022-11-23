public class Author {
    //public static int year;
   private static String name;
   private static String surName;

    public Author(String name,String surName){
        this.name=name;
        this.surName=surName;
    }
    public String getName(){
        return this.name;
    }
    public String getSurName(){
        return this.surName;
    }


}

