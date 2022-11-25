public class Main {



    public static void main(String[] args) {
        Author Tolstoy = new Author("Lev", "Tolstoy");

        System.out.println();

        Author Esenin = new Author("Sergey", "Esenin");
        Book poems = new Book("Fucken Love", 1901,Esenin);
        poems.setYear(1902);
        System.out.println(poems.getYear());
        System.out.println(poems.getTitle());
        Book warAndPeace = new Book("War and Peace", 1873,Tolstoy);
        System.out.println(Tolstoy.getName());

    }
}