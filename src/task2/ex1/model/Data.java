package task2.ex1.model;

import task2.ex1.model.entity.Book;

public class Data {

    public static Book[] getBooks() {
        return new Book[]{
                new Book("War and Peace", "LEO TOLSTOY", "Paperback", 1818, 1296,
                        15),
                new Book("Immortal Beloved", "Cate Tiernan", "Paperback", 2013,
                        43, 24),
                new Book("Pirates", "Celia Rees", "Ebook", 2003,
                        384, 1),
                new Book("The Piano Tuner", "Daniel Mason", "Vintage", 2002,
                        312, 10),
                new Book("East of the Sun", "Julia Gregson", "Paperback", 2007,
                        458, 18),
                new Book("Burn in Hades", "Michael L. Martin Jr.", "Ebook", 2011,
                        328, 4),
                new Book("Power", "Lauren Algeo", "Vintage", 2013,
                        426, 2),
                new Book("The Devil's Bed", "Doug Lamoreux", "Ebook", 2011,
                        351, 5),
                new Book("The Shadow of the Wind", "Lucia Graves", "The Penguin Press",
                        2001, 487, 2)
        };
    }
}
