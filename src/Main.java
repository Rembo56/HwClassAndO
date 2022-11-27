public class Main {



    public static void main(String[] args) {
        Author Tolstoy = new Author("Lev", "Tolstoy");
        Author Tolstoy2 = new Author("Lev", "Tolstoy");

        Author Tolstoy3 = Tolstoy;
        System.out.println();

        Author Esenin = new Author("Sergey", "Esenin");
        Book poems = new Book("Fucken Love", 1901,Esenin);
        Book poems2 = new Book("Fucken Love", 1901,Esenin);

        Book poems3=poems;

        poems.setYear(1902);
        poems.setYear(1901);

        System.out.println(poems.getYear());
        System.out.println(poems.getTitle());
        Book warAndPeace = new Book("War and Peace", 1873,Tolstoy);
        System.out.println(Tolstoy.getName());
        System.out.println(poems.toString());


        System.out.println("Tolstoy==Tolstoy2 "+(Tolstoy==Tolstoy2));
        System.out.println("Tolstoy==Tolstoy3 "+(Tolstoy==Tolstoy3));
        System.out.println("Tolstoy.equals(Tolstoy2) "+(Tolstoy.equals(Tolstoy2)));
        System.out.println("Tolstoy.equals(Tolstoy3) "+(Tolstoy.equals(Tolstoy3)));

        System.out.println(Tolstoy.hashCode());
        System.out.println(Tolstoy2.hashCode());
        System.out.println(Tolstoy3.hashCode());


        System.out.println("poems==poems2 "+(poems==poems2));
        System.out.println("poems==poems3 "+(poems==poems3));
        System.out.println("poems.equals(poems2)"+(poems.equals(poems2)));
        System.out.println("poems.equals(poems3) "+(poems.equals(poems3)));

        System.out.println(poems.hashCode());
        System.out.println(poems2.hashCode());
        System.out.println(poems3.hashCode());



    }
}