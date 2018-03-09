package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;
import java.util.Map;

public class MedianAdaptee implements BookStatistics{
    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistic = new Statistics();
        return statistic.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistic = new Statistics();
        return statistic.medianPublicationYear(books);
    }
}
