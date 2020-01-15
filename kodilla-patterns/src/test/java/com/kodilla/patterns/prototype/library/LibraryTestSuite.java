package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() throws CloneNotSupportedException {
        //given
        Library library = new Library("Library 1");
        Book book1 = new Book("Title1", "Author1", LocalDate.of(2017, Month.MAY, 15));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(2018, 10, 25));
        Book book3 = new Book("Title3", "Author3", LocalDate.now());
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy of board object
        Library clonedLibrary;

        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Library 2");

        //making a deep copy of board object
        Library deepClonedLibrary;

        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Library 3");


        //when
        library.getBooks().remove(book1);

        //then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks().size(), library.getBooks().size());
        Assert.assertNotEquals(deepClonedLibrary.getBooks().size(), library.getBooks().size());

    }
}
