package pl.piotrnarecki.nauticalquotes.ui.quotes

import androidx.lifecycle.ViewModel
import pl.piotrnarecki.nauticalquotes.data.Quote
import pl.piotrnarecki.nauticalquotes.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)


}