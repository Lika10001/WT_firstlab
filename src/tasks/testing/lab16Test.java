package tasks.testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tasks.task16.AuthorComparator;
import tasks.task16.Book;
import tasks.task16.Sort;
import tasks.task16.TitleComparator;

import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class lab16Test {

    @Test
    public void testTitleComparator() {
        Comparator<Book> titleComparator = new TitleComparator();
        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(new Book("title4", "author3", 14));
        bookArrayList.add(new Book("title3", "author6", 9));
        bookArrayList.add(new Book("title2", "author0", 4));
        bookArrayList.add(new Book("title1", "author-1", 1));
        bookArrayList.add(new Book("title0", "author312", 4));

        Sort.sort(bookArrayList, titleComparator);

        ArrayList<Book> expectedList = new ArrayList<>();
        expectedList.add(new Book("title0", "author312", 4));
        expectedList.add(new Book("title1", "author-1", 1));
        expectedList.add(new Book("title2", "author0", 4));
        expectedList.add(new Book("title3", "author6", 9));
        expectedList.add(new Book("title4", "author3", 14));

        Assert.assertEquals(expectedList, bookArrayList);
    }

    @Test
    public void testTitleAuthorComparator() {
        Comparator<Book> titleAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(new Book("title4", "author3", 14));
        bookArrayList.add(new Book("title3", "author6", 9));
        bookArrayList.add(new Book("title2", "author0", 4));
        bookArrayList.add(new Book("title1", "author-1", 1));
        bookArrayList.add(new Book("title0", "author312", 4));

        Sort.sort(bookArrayList, titleAuthorComparator);

        ArrayList<Book> expectedList = new ArrayList<>();
        expectedList.add(new Book("title0", "author312", 4));
        expectedList.add(new Book("title1", "author-1", 1));
        expectedList.add(new Book("title2", "author0", 4));
        expectedList.add(new Book("title3", "author6", 9));
        expectedList.add(new Book("title4", "author3", 14));

        Assert.assertEquals(expectedList, bookArrayList);
    }
}