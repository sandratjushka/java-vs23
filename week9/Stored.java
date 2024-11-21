package week9;

public class Stored {
    public interface ToBeStored {
        double weight();
    }

    public static class Book implements ToBeStored {
        private String writer;
        private String name;
        private double weight;

        public Book(String writer, String name, double weight) {
            this.writer = writer;
            this.name = name;
            this.weight = weight;
        }

        @Override
        public double weight() {
            return this.weight;
        }

        @Override
        public String toString() {
            return this.writer + ": " + this.name;
        }
    }

    public static class CD implements ToBeStored {
        private String artist;
        private String title;
        private int year;

        public CD(String artist, String title, int year) {
            this.artist = artist;
            this.title = title;
            this.year = year;
        }

        @Override
        public double weight() {
            return 0.1;
        }

        @Override
        public String toString() {
            return this.artist + ": " + this.title + " (" + this.year + ")";
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
}
