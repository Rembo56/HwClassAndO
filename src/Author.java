public class Author {
    //public static int year;
    private String name;
    private String surName;

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

    public String printFullName(){
        return "Имя "+ this.getName()+", Фамилия "+getSurName();
    }
    @Override
    public boolean equals(Object other) {
        if (this==other){
            return true;
        }
        if(other==null||getClass()!=other.getClass()){
            return false;
        }
        Author author=(Author) other;
        if (getName()!=author.getName()){
            return false;
        }
        if (getSurName()!=author.getSurName()){
            return false;
        }
        return printFullName()!=null
                ? printFullName().equals(author.printFullName())
                : author.printFullName()==null;

    }

    @Override
    public int hashCode(){
        int result=name==null ?0: name.hashCode();
        result=result+surName==null ?0:surName.hashCode();
        return result;
    }
}

