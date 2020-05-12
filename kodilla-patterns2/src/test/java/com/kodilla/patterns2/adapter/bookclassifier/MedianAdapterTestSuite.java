package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author1","title1",1980,"1234");
        Book book2 = new Book("Author2","title2",1986,"2223");
        Book book3 = new Book("Author3","title3",1997,"11133");
        Book book4 = new Book("Author4","title4",1999,"51577");
        Book book5 = new Book("Author5","title5",2005,"12313");
        Book book6 = new Book("Author6","title6",2006,"6666");
        Book book7 = new Book("Author7","title7",2017,"4646");
        MedianAdapter medianAdapter = new MedianAdapter();
        HashSet<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(median,1999,0);

    }
}
