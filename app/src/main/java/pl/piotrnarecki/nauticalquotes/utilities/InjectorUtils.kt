package pl.piotrnarecki.nauticalquotes.utilities

import pl.piotrnarecki.nauticalquotes.data.FakeDatabase
import pl.piotrnarecki.nauticalquotes.data.QuoteRepository
import pl.piotrnarecki.nauticalquotes.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {

        //dependency injection
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }

}