package com.philwin.marketdata.common.repository

import com.philwin.marketdata.common.model.Stock
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRespository : CrudRepository<Stock, Long> {
    fun findBySymbol(symbol: String): List<Stock>

    @Query("SELECT DISTINCT s.symbol FROM Stock s ")
    fun findUniqueSymbols() : List<String>
}