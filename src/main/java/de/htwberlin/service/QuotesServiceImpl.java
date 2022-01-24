package de.htwberlin.service;

public class QuotesServiceImpl implements QuotesService{
    @Override
    public String getQuote(int index) throws IllegalArgumentException {
        if (index < 0 || 79 < index) {
            throw new IllegalArgumentException("Index is out of range");
        } else {
            return this.QUOTES.get(index);
        }
    }
}
