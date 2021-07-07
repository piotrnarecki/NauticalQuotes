package pl.piotrnarecki.nauticalquotes.data

class QuoteRepository private constructor(private val quotesDao: FakeQuoteDao) {


    fun addQuote(quote: Quote) {
        quotesDao.addQuote(quote)
    }

    fun getQuotes() = quotesDao.getQuote()

    companion object {

        @Volatile
        private var instance: QuoteRepository? = null

        fun getInstance(quotesDao: FakeQuoteDao) =
            instance ?: synchronized(this) {
                instance ?: QuoteRepository(quotesDao).also { instance = it }
            }

    }

}