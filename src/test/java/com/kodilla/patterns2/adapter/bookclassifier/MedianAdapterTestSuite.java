package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        Book donQuixote = new Book("Don Quixote", "Miguel de Cervantes", 1605, "D13-xx");
        Book taleOfTwoCities = new Book("A Tale of Two Cities", "Charles Dickens", 1859, "D14-xhx");
        Book littlePrince = new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943, "D17-fx");
        Book hobbit = new Book("The Hobbit", "J. R. R. Tolkien", 1937, "H12-pxx");
        Book catcherInRye = new Book("The Catcher in the Rye", "J. D. Salinger", 1951, "K76-xkx");

        Set<Book> exampleBooksSet = new HashSet<>();
        exampleBooksSet.add(donQuixote);
        exampleBooksSet.add(taleOfTwoCities);
        exampleBooksSet.add(littlePrince);
        exampleBooksSet.add(hobbit);
        exampleBooksSet.add(catcherInRye);

        MedianAdapter adapter = new MedianAdapter();

        //When
        int median = adapter.publicationYearMedian(exampleBooksSet);

        //Then
        assertEquals(1937, median);
    }
}
