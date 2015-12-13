package org.thehecklers.org.thehecklers.entities;

/**
 * Created by markheckler on 12/13/15.
 */
public class Quote {
    private Integer id;
    private String quoteText;
    private String context;
    private QuoteSource quoteSource;

    public Quote() {
    }

    public Quote(String quoteText, String context, QuoteSource quoteSource) {
        this.quoteText = quoteText;
        this.context = context;
        this.quoteSource = quoteSource;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public QuoteSource getQuoteSource() {
        return quoteSource;
    }

    public void setQuoteSource(QuoteSource quoteSource) {
        this.quoteSource = quoteSource;
    }
}
