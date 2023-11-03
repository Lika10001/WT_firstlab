package tasks.testing;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tasks.task15.Book;
import tasks.task15.Main;

import static org.junit.jupiter.api.Assertions.*;

class lab15Test {
    @Test
    public void testSort() {
        Book[] bookArray = {
                new Book("a", 14),
                new Book("b", 4),
                new Book("c", 8),
                new Book("d", 11),
                new Book("e", 18),
                new Book("f", 0),
                new Book("g", 3)
        };

        Main.sort(bookArray);

        Book[] expectedArray = {
                new Book("f", 0),
                new Book("d", 11),
                new Book("g", 3),
                new Book("a", 14),
                new Book("b", 4),
                new Book("e", 18),
                new Book("c", 8)
        };

        assertArrayEquals(expectedArray, bookArray);
    }

}